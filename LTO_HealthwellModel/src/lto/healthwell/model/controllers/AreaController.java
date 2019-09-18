package lto.healthwell.model.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.latido.model.utils.Parameter;
import com.latido.security.LatidoSecurityManager;

import lto.healthwell.model.entities.Area;
import lto.healthwell.model.entities.AreaPersona;
import lto.healthwell.model.entities.Persona;

public class AreaController extends LtoController {
	private static final String PROCESS = "AR";
	
	public AreaController(String keyMem) {
		super(keyMem);
	}
	
	private Boolean validateUserLevel(String action) {
		String userLevelProcess = this.getUserLevelAccess(PROCESS);
		return userLevelProcess.contains(action);
	}
	
	public Area getCurrentArea() {
		return (Area) this.getLtoHealthwellFacade().getEjb(Area.class.getName());
	}
	
	public void setCurrentArea(Area are) {
		this.getLtoHealthwellFacade().setEjb(Area.class.getName(), are);
	}
	
	public List<Area> getListAreasByParent(Area are){
		if(!validateUserLevel("R"))
			return null;
		
		Parameter[] params = new Parameter[] { new Parameter("p_idarea_padre", are.getIdarea()) };
		
		List<Area> lare = this.getLtoHealthwellFacade().getListFromParameters(Area.class, "findChildrens", true, params);
		
		return lare;
	}
	
	public List<Area> getListAreaParents(){
		if(!validateUserLevel("R"))
			return null;
		
		// Agregar el permiso de solo un grupo por usuario
		Long GOUsuario = this.getGrupoOrganizacionalForUser();
		if(GOUsuario == null) {
			return null;
		}
		
		Parameter[] params = new Parameter[] {new Parameter("p_idgo", GOUsuario)};
		
		List<Area> lare = this.getLtoHealthwellFacade().getListFromParameters(Area.class, "findParents", true, params);
		return lare;
	}
	
	private List<Area> fillAreaRecursiveChildren(List<Area> lare) {
		if(lare != null) { 
			for(Area are : lare) {
				// Areas
				Parameter[] parameters = new Parameter[] { new Parameter("idarea_padre", are.getIdarea())};
				List<Area> children = this.getLtoHealthwellFacade().getListFromParameters(Area.class, true, parameters);
				children = fillAreaRecursiveChildren(children);
				are.setChildren(children);
			}
		}
		return lare;
	}
	
	public String guardarArea(Area are) {
		String result = "success";
		if(are != null) {
			boolean isRequiredAttributes = Boolean.TRUE;
			if(are.getNombre() == null || are.getNombre().trim().equalsIgnoreCase("")) {
				result = "No es posible guardar una Area sin su Nombre, favor de verificar";
				isRequiredAttributes = Boolean.FALSE;
			}
			if(isRequiredAttributes) {
				are.setFec_mod(new Date(System.currentTimeMillis()));
				are.setUsu_cve(LatidoSecurityManager.getUserInLine() == null ? "anonymous" : LatidoSecurityManager.getUserInLine());
				if(are.getIdarea() != 0L) {
					//Update
					if(!validateUserLevel("U"))
						return "[ERROR] Su usuario no tiene permisos para actualizar una Area.";
					this.getLtoHealthwellFacade().mergeEjb(are);
				} else {
					if(!validateUserLevel("C"))
						return "[ERROR] Su usuario no tiene permisos para crear una Area.";
					//Insert
					are.setIdgo(this.getGrupoOrganizacionalForUser());
					are.setIdarea(this.getNextPK("area","idarea"));
					are.setEstatus(1);
					this.getLtoHealthwellFacade().persistEjb(are);
				}
			}
		} else {
			result = "[ERROR_INTERNO] No se puede guardar una entidad nula, favor de verificar";
		}
		return result;
	}
	
	public String guardarAreaPersona() {
		String result = "success";
		Area are = this.getCurrentArea();
		Persona per = (Persona) this.getLtoHealthwellFacade().getEjb(Persona.class.getName());
		
		AreaPersona ap = new AreaPersona();
		ap.setIdarea(are.getIdarea());
		ap.setIdgo(are.getIdgo());
		ap.setIdpersona(per.getIdpersona());
		 
		this.getLtoHealthwellFacade().persistEjb(ap);
		return result;
	}
	
	public List<Persona> getPersonasNotIn(Area are){
		List<Persona> lp = null;
		if(are != null) {
			EntityManager em = this.getLtoHealthwellFacade().getEM();
			/*String query = 	"Select per.idpersona " + 
							"from persona per " + 
							"where per.idpersona not in " + 
							"	( Select idpersona from area_persona ap where ap.idgo = ? and ap.idarea = ? )";*/
			String query = "Select p from Persona p "
						 + "	Where p.idpersona not in "
						 + "         ( Select ap.idpersona from AreaPersona ap Where ap.idgo = :p_idgo and ap.idarea = :p_idarea ) ";
			Query q = em.createQuery(query);
			q.setParameter("p_idgo", are.getIdgo());
			q.setParameter("p_idarea", are.getIdarea());
			lp = q.getResultList();
			/*List lr = q.getResultList();
			if(lr != null && lr.size() > 0) {
				lp = new ArrayList<Persona>();
				for(Object result : lr) {
					Query qr = em.createNamedQuery("Select o from Persona o where o.idpersona = :p_idpersona");
					qr.setParameter(1, result);
					Persona per = (Persona) qr.getSingleResult(); 
					lp.add(per);
				}
			}*/	
		}
		return lp;
	}
	
	public List<Persona> getPersonasIn(Area are){
		List<Persona> lp = null;
		if(are != null) {
			EntityManager em = this.getLtoHealthwellFacade().getEM();
			String query = "Select p from Persona p "
					 + "	Where p.idpersona in "
					 + "         ( Select ap.idpersona from AreaPersona ap Where ap.idgo = :p_idgo and ap.idarea = :p_idarea ) ";
			Query q = em.createQuery(query);
			q.setParameter("p_idgo", are.getIdgo());
			q.setParameter("p_idarea", are.getIdarea());
			lp = q.getResultList();
		}
		return lp;
	}

}
