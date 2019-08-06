package lto.actmanager.model.controllers;

import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.latido.model.utils.Parameter;

import lto.actmanager.model.entities.Compania;

public class CommonCatalogController extends LtoController {
	public static final int SAVE_SUCCESS = 1;
	public static final int SAVE_ERROR = 0;
	public static final int SAVE_WARN = 2;
	
	public CommonCatalogController(String keyMem) {
		super(keyMem);
	}
	
	public Compania getCurrentCompania() {
		return (Compania) this.getLtoActManagerFacade().getEjb(Compania.class.getName());
	}
	
	public void setCurrentCompania(Compania cia) {
		this.getLtoActManagerFacade().setEjb(Compania.class.getName(), cia);
	}
	
	public List<Compania> getCompaniasByParams(Parameter... params){
		return this.getLtoActManagerFacade().getListFromParameters(Compania.class, params);
	}
	
	public int saveCompania(Compania cia) {
		if(cia != null) {
			Boolean isPersist = cia.getIdCompania() == null ? true : cia.getIdCompania() == 0;
			cia.setFecMod(new Date(System.currentTimeMillis()));
			if(isPersist) {
				this.getLtoActManagerFacade().persistEjb(cia);
			} else {
				this.getLtoActManagerFacade().mergeEjb(cia);
			}
			return SAVE_SUCCESS;
		} else {
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "No se puede salvar una entidad nula.");
			return SAVE_ERROR;
		}
	}
}
