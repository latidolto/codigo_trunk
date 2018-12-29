package lto.services.model.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.latido.model.utils.Parameter;

import lto.services.model.entities.Servicio;

public class ServicesController extends LtoController {
	
	public ServicesController(String keyMem) {
		super(keyMem);
	}

	public Servicio getCurrentService() {
		return (Servicio) this.getLtoServicesFacade().getEjb(Servicio.class.getName());
	}
	
	public void setCurrentService(Servicio servicio) {
		this.getLtoServicesFacade().setEjb(Servicio.class.getName(), servicio);
	}

	public Servicio getServiceById(Long id) {
		Servicio servicio = null;
		Map<String,Long> params = new HashMap<String,Long>();
		params.put("p_clave", id);
		List<Servicio> lc = this.getLtoServicesFacade().getListFromParameters(Servicio.class.getName(), "findById", params);
		if(lc != null)
			servicio = lc.get(0);
		return servicio;
	}
	
	public List<Servicio> getServicesByParams(Parameter... params){
		return this.getLtoServicesFacade().getListFromParameters(Servicio.class, params);
	}
	
	public List<Servicio> getServicesByParams(){
		return this.getLtoServicesFacade().getListFromParameters(Servicio.class, null);
	}
	
	public void saveService(Servicio servicio) {
		Boolean isPersist = servicio.getIdServicio() == null ? true : servicio.getIdServicio() == 0L;
		servicio.setFechaModificacion(new Date());
		if(isPersist) {
			this.getLtoServicesFacade().persistEjb(servicio);
		} else {
			this.getLtoServicesFacade().mergeEjb(servicio);
		}
	}
}
