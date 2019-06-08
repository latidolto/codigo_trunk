package lto.news.json;

import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.json.stream.JsonGenerator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lto.news.entities.User;

public class JSONUtils {
	
	public static String javaToJSON(Object object) {
		String strJson = "";
		if(object != null) {
			StringWriter  writer = new StringWriter();
			JsonGenerator generator = Json.createGenerator(writer);
			Field[] fields = object.getClass().getDeclaredFields();
			generator.writeStartObject();
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					if(field.get(object) instanceof Collection 	||
					   field.get(object) instanceof List		||
					   field.get(object) instanceof ArrayList) {
						JsonArrayBuilder jab = Json.createArrayBuilder();
						for(Object obj : (Collection)field.get(object)) {
							Field[] objFields = obj.getClass().getDeclaredFields();
							JsonObjectBuilder job = Json.createObjectBuilder();
							for(Field oField : objFields) {
								oField.setAccessible(true);
								job.add(oField.getName(), String.valueOf( oField.get(obj) ));
							}
							jab.add(job);
							
						}
						generator.write(field.getName(), jab.build());
					} else {
						generator.write(field.getName(), String.valueOf( field.get(object) ) );
					}
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
			generator.writeEnd();
			generator.flush();
			generator.close();
			strJson = writer.toString();
			
		}
		return strJson;
	}
	
	public static String javaCollectionToJSON(Collection coll) {
		String strJson = "";
		if(coll != null) {
			boolean isFirst = true;
			strJson += "{";
			strJson += System.getProperty("line.separator");
			strJson += "\"List\" : [ ";
			strJson += System.getProperty("line.separator");
			for (Object objInt : (Collection)coll) {
				if (isFirst) 
					strJson += " " + javaToJSON(objInt) ;
				else
					strJson += ", " + javaToJSON(objInt) ;
				isFirst = false;
			}
			strJson += System.getProperty("line.separator");
			strJson += "] }";
		}
		return strJson;
	}

	public static Object JSONToJava(Class cls, String json) {
		Gson gson = new GsonBuilder().create();
		return gson.fromJson(json, cls);
	}
}
