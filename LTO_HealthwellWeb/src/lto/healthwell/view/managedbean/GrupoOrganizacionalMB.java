package lto.healthwell.view.managedbean;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.latido.view.managedbean.utils.CommonManagedBean;
import com.latido.view.managedbean.utils.JsfUtils;

import lto.healthwell.dispatcher.LtoHealthwellDispatcher;
import lto.healthwell.model.controllers.GrupoOrganizacionalController;
import lto.healthwell.model.entities.AvisoPrivacidad;
import lto.healthwell.model.entities.GrupoOrganizacional;
import lto.healthwell.view.managedbean.util.FileUploader;

public class GrupoOrganizacionalMB extends CommonManagedBean{
	public static final String RESOURCE_NAME = "LTO_HWL_GRUPOORGANIZACIONAL";
	
	private static final String GRUORG_CONTENT_ENABLE = "gruorg_content_enable";
	private static final String FILE_GRUORG_LOGO = "gruorg_logo";
	private static final String FILE_AVIPRI_ARCH = "gruorg_arch";
	
	public GrupoOrganizacionalMB() {
		super();
		//super(RESOURCE_NAME);
	}
	
	private GrupoOrganizacionalController getController() {
		GrupoOrganizacionalController goc = (GrupoOrganizacionalController) LtoHealthwellDispatcher.getControllerInstance(LtoHealthwellDispatcher.GO_CONTROLLER, this.getSessionKey());
		// Inicializacion de variables globales en cache
		if(goc.getVariable(GRUORG_CONTENT_ENABLE) == null)
			goc.setNewValueVariable(GRUORG_CONTENT_ENABLE, false);
		return  goc;
	}
	
	public GrupoOrganizacional getGrupoOrganizacional() {
		return this.getController().getCurrentGrupoOrganizacional();
	}
	
	public List<GrupoOrganizacional> getGrupoOrganizacionales() {
		return this.getController().getGrupoOrganizacionalByParams(false, false, true);
	}

	public Part getFile() {
		return FileUploader.getInstance(this.getSessionKey()+FILE_GRUORG_LOGO).getFile();
	}

	public void setFile(Part file) {
		FileUploader.getInstance(this.getSessionKey()+FILE_GRUORG_LOGO).setFile(file);
	}
	
	public Part getFileArch() {
		return FileUploader.getInstance(this.getSessionKey()+FILE_AVIPRI_ARCH).getFile();
	}

	public void setFileArch(Part file) {
		FileUploader.getInstance(this.getSessionKey()+FILE_AVIPRI_ARCH).setFile(file);
	}
	
	public boolean getGrupoOrgContentEnabled() {
		return (boolean) this.getController().getVariable(GRUORG_CONTENT_ENABLE);
	}
	
	public List<AvisoPrivacidad> getAvisosPrivacidad(){
		if(this.getGrupoOrganizacional() != null) {
			return this.getGrupoOrganizacional().getAvisoPrivacidadChildren();
		}
		return null;
	}
	
	public AvisoPrivacidad getAvisoPrivacidad() {
		return this.getController().getCurrentAvisoPrivacidad();
	}
	
	/*EVENTOS EN LA PANTALLA*/
	public void agregarGrupo(ActionEvent ae) {
		this.getController().setNewValueVariable(GRUORG_CONTENT_ENABLE, true);
		this.getController().getLtoHealthwellFacade().setEjb(GrupoOrganizacional.class.getName(), new GrupoOrganizacional());
		
		JsfUtils.resfreshComponentById("panelGruOrg");
	}
	
	public void guardarGrupo(ActionEvent ae) {
		GrupoOrganizacional go = this.getController().getCurrentGrupoOrganizacional();
		String message = "Se ha guardado el grupo de forma correcta.";
		try {
			byte[] fileToUpload = FileUploader.getInstance(this.getSessionKey()+FILE_GRUORG_LOGO).fileToByteArray();
			if(fileToUpload != null) {
				go.setLogo(FileUploader.getInstance(this.getSessionKey()+FILE_GRUORG_LOGO).fileToByteArray());	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		message = this.getController().guardarGrupoOrganizacional(go);
		
		if(!message.equalsIgnoreCase("success")) { 
			JsfUtils.sendMessageToView_ERROR(message);
		} else {
			JsfUtils.sendMessageToView_INFO(message);
			this.resetUI();
		}
		
		JsfUtils.resfreshComponentById("mainForm");
	}
	
	public void inactivarGrupo(ActionEvent ae) {
		GrupoOrganizacional go = this.getController().getCurrentGrupoOrganizacional();
		String message = "Se ha inactivado el grupo de forma correcta.";
		Boolean isError = Boolean.FALSE;
		
		go.setEstatus(0);
		try {
			this.getController().guardarGrupoOrganizacional(go);
		} catch (Exception e) {
			e.printStackTrace();
			message = e.getMessage();
			isError = Boolean.TRUE;
		}
		if(isError) { 
			JsfUtils.sendMessageToView_ERROR(message);
		} else {
			JsfUtils.sendMessageToView_INFO(message);
		}
		this.resetUI();		
		JsfUtils.resfreshComponentById("mainForm");
	}
	
	public void seleccionarParaInactivarGrupo(ActionEvent ae) {
		GrupoOrganizacional go = (GrupoOrganizacional) ae.getComponent().getAttributes().get("rowGrupo");
		this.getController().setCurrentGrupoOrganizacional(go);
		
		JsfUtils.resfreshComponentById("formModalInactivaGrupo");
	}
	
	public void seleccionarParaEditarGrupo(ActionEvent ae) {
		GrupoOrganizacional go = (GrupoOrganizacional) ae.getComponent().getAttributes().get("rowGrupo");
		this.getController().setCurrentGrupoOrganizacional(go);
		this.getController().setNewValueVariable(GRUORG_CONTENT_ENABLE, true);
		
		JsfUtils.resfreshComponentById("panelGruOrg");
		JsfUtils.resfreshComponentById("panelAvisoPrivacidad");
	}
	
	public void cancelarEditar(ActionEvent ae) {
		this.resetUI();
		JsfUtils.resfreshComponentById("panelGruOrg");
		JsfUtils.resfreshComponentById("panelAvisoPrivacidad");
	}
	
	private void resetUI() {
		//Dejamos la pantalla como en un inicio
		this.getController().setNewValueVariable(GRUORG_CONTENT_ENABLE, false);
		this.getController().getLtoHealthwellFacade().setEjb(GrupoOrganizacional.class.getName(), new GrupoOrganizacional());
		this.getController().getLtoHealthwellFacade().setEjb(AvisoPrivacidad.class.getName(), new AvisoPrivacidad());
	}
	
	public void guardarAvisoPrivacidad(ActionEvent ae) {
		AvisoPrivacidad ap = this.getController().getCurrentAvisoPrivacidad();
		String message = "Se ha guardado el aviso de privacidad de forma correcta.";
		try {
			byte[] fileToUpload = FileUploader.getInstance(this.getSessionKey()+FILE_AVIPRI_ARCH).fileToByteArray();
			if(fileToUpload != null) {
				ap.setArchivo(FileUploader.getInstance(this.getSessionKey()+FILE_AVIPRI_ARCH).fileToByteArray());	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		message = this.getController().guardarAvisoPrivacidad(ap);
		
		if(!message.equalsIgnoreCase("success")) { 
			JsfUtils.sendMessageToView_ERROR(message);
		} else {
			JsfUtils.sendMessageToView_INFO(message);
			this.resetUI();
		}
		
		JsfUtils.resfreshComponentById("mainForm");
	}
	
	public void descargarAvisoPrivacidad(ActionEvent ae) {
		AvisoPrivacidad ap = (AvisoPrivacidad) ae.getComponent().getAttributes().get("archivo");
		if(ap != null && ap.getArchivo() != null) {
	        FacesContext facesContext = FacesContext.getCurrentInstance();
	        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
	         
	        response.reset();   
	        response.setHeader("Content-Type", "application/pdf");  
	        response.setHeader("Content-Disposition", "attachment;filename=aviso_privacidad.pdf");  
	        try {
				OutputStream responseOutputStream = response.getOutputStream();
				 
				InputStream pdfInputStream = new ByteArrayInputStream(ap.getArchivo());//url.openStream();
				 
				byte[] bytesBuffer = new byte[2048];
				int bytesRead;
				while ((bytesRead = pdfInputStream.read(bytesBuffer)) > 0) {
				    responseOutputStream.write(bytesBuffer, 0, bytesRead);
				}
				
				responseOutputStream.flush();
				
				pdfInputStream.close();
				responseOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
	        facesContext.responseComplete();
		} 
	}
	
}
