package lto.news.rest.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BasicValidation {
	private static BasicValidation bv;
	private static Map callers = null;
	
	private BasicValidation() {
		
	}
	
	public static BasicValidation getBasicValidation() {
		if (bv == null) {
			bv = new BasicValidation();
		}
		return bv;
	}
	
	public Map getCallers() {
		return callers;
	}
	
	public void setCallers(Map callers) {
		this.callers = callers;
	}

	public static boolean validateCall(String remoteUrl) {
		boolean isValid = true;
		Map callers = getBasicValidation().getCallers();
		if(callers != null) {
			Date lastCall = (Date) callers.get(remoteUrl);
			if(lastCall != null) {
				long lastLong = lastCall.getTime();
				long curretnLong = System.currentTimeMillis();
				long diffLong = curretnLong - lastLong;
				if(diffLong < 2000) { // 2 segundos entre llamadas
					isValid = false;
				} 
			} 
			callers.put(remoteUrl, new Date(System.currentTimeMillis()));
		}else {
			callers = new HashMap();
			callers.put(remoteUrl, new Date(System.currentTimeMillis()));
		}
		getBasicValidation().setCallers(callers);
		return isValid;
	}
	
	public class Call{
		public Date dateCall = null;
		public String remoteUrl = null;
	}
}
