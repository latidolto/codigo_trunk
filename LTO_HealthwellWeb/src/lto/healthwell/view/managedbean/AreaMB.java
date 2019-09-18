package lto.healthwell.view.managedbean;

import java.util.List;

import javax.faces.event.ActionEvent;
import javax.servlet.http.Part;

import com.latido.model.utils.Parameter;
import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

import lto.healthwell.dispatcher.LtoHealthwellDispatcher;
import lto.healthwell.model.controllers.AreaController;
import lto.healthwell.model.entities.Area;
import lto.healthwell.model.entities.AvisoPrivacidad;
import lto.healthwell.model.entities.GrupoOrganizacional;
import lto.healthwell.model.entities.Persona;
import lto.healthwell.view.managedbean.util.FileUploader;

public class AreaMB extends CommonManagedBean{
	public static final String RESOURCE_NAME = "LTO_HWL_AREA";
	
	public static final String AREA_EDITING_MODE = "AREA_IS_EDITING_MODE_ACTIVE";
	public static final String AREA_PARENT_ROW = "AREA_PARENT_ROW";
	
	public static final String FILE_AREA_LOGO = "FILE_AREA_LOGO";

	public AreaMB() {
		//super(RESOURCE_NAME);
		this.getController().setNewValueVariable(AREA_EDITING_MODE, false);
	}
	
	public Part getFile() {
		return FileUploader.getInstance(this.getSessionKey()+FILE_AREA_LOGO).getFile();
	}

	public void setFile(Part file) {
		FileUploader.getInstance(this.getSessionKey()+FILE_AREA_LOGO).setFile(file);
	}
	
	
	public AreaController getController() {
		return (AreaController) LtoHealthwellDispatcher.getControllerInstance(LtoHealthwellDispatcher.AR_CONTROLLER, this.getSessionKey());
	}
	
	public List<Area> areas(Area are){
		List<Area> la = null;
		if(are != null) {
			la = this.getController().getListAreasByParent(are);
		} else {
			la = this.getController().getListAreaParents();
		}
		return la;
	}
	
	public Area getArea() {
		return this.getController().getCurrentArea();
	}
	
	public Persona getPersona() {
		return (Persona) this.getController().getLtoHealthwellFacade().getEjb(Persona.class.getName());
	}
	
	public List<Persona> personas(Area are){
		return this.getController().getPersonasIn(are);
	}
	
	public List<Persona> getPersonasIn(){
		return this.getController().getPersonasIn(getArea());
	}
	
	public List<Persona> getPersonasNotIn(){
		return this.getController().getPersonasNotIn(getArea());
	}
	
	private void resetUI() {
		//Dejamos la pantalla como en un inicio
		this.getController().getLtoHealthwellFacade().setEjb(Area.class.getName(), new Area());
		this.getController().setNewValueVariable(AREA_EDITING_MODE, false);
		this.getController().setNewValueVariable(AREA_PARENT_ROW, null);
	}
	
	public void guardarArea(ActionEvent ae) {
		Area are = this.getController().getCurrentArea();
		String message = "Se ha guardado el grupo de forma correcta.";
		try {
			byte[] fileToUpload = FileUploader.getInstance(this.getSessionKey()+FILE_AREA_LOGO).fileToByteArray();
			if(fileToUpload != null) {
				are.setLogo(fileToUpload);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Area parentArea = (Area) this.getController().getVariable(AREA_PARENT_ROW);
				
		if(!getModoEdicion() && parentArea != null) {
			are.setIdarea_padre(parentArea.getIdarea());
		}
		message = this.getController().guardarArea(are);
		
		if(!message.equalsIgnoreCase("success")) {
			JsfUtils.sendMessageToView_ERROR(message);
		} else {
			JsfUtils.sendMessageToView_INFO(message);
			this.resetUI();
		}
		
		JsfUtils.resfreshComponentById("mainForm");
	}
	
	public void asignarArea(ActionEvent ae) {
		this.getController().setNewValueVariable(AREA_EDITING_MODE, false);
		Area are = (Area) ae.getComponent().getAttributes().get("areaRow");
		if(are != null)
			this.getController().setNewValueVariable(AREA_PARENT_ROW, are);
		
		this.getController().getLtoHealthwellFacade().setEjb(Area.class.getName(), new Area());
	}
	
	public void editarArea(ActionEvent ae) {
		this.getController().setNewValueVariable(AREA_EDITING_MODE, true);
		Area are = (Area) ae.getComponent().getAttributes().get("areaRow");
		this.getController().getLtoHealthwellFacade().setEjb(Area.class.getName(), are);
	}
	
	public Boolean getModoEdicion() {
		return (Boolean) this.getController().getVariable(AREA_EDITING_MODE);
	}
	
	public void agregarPersona(ActionEvent ae) {
		this.getController().getLtoHealthwellFacade().setEjb(Persona.class.getName(), new Persona());
	}
	
	public void onSelectPersona(Persona per, String typeOfSelection, String indexes) {
		if(per != null)
			System.out.println(per.getNombre());
		this.getController().getLtoHealthwellFacade().setEjb(Persona.class.getName(), per);
	}
	
	public void guardarAreaPersona(ActionEvent ae) {
		String message = "Se ha agregado a la persona de forma correcta.";
		
		message = this.getController().guardarAreaPersona();
		
		if(!message.equalsIgnoreCase("success")) {
			JsfUtils.sendMessageToView_ERROR(message);
		} else {
			JsfUtils.sendMessageToView_INFO(message);
			this.resetUI();
		}
	}
}
