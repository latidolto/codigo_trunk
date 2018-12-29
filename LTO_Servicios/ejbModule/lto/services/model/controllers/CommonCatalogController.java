package lto.services.model.controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.latido.model.entities.Multivaluada;
import com.latido.model.utils.Parameter;

import lto.services.model.entities.Cliente;

public class CommonCatalogController extends LtoController {
	
	public CommonCatalogController(String keyMem) {
		super(keyMem);
	}

	public List<Multivaluada> getMultivaluadaByClave(String clave) {
		List<Multivaluada> lmul = null;
		Map<String,String> params = new HashMap<String,String>();
		params.put("p_clave", clave);
		lmul = this.getLtoServicesFacade().getListFromParameters(Multivaluada.class.getName(), "findByClave", params);
		return lmul;
	}
	
	public void guardarNuevaMultivaluada(Multivaluada mul) throws Exception {
		List<Multivaluada> lmul = this.getLtoServicesFacade().getListFromParameters(Multivaluada.class, new Parameter("clave", mul.getClave()),new Parameter("valor", mul.getValor()));
		if(lmul != null && lmul.size() > 0)
			throw new Exception("No se puede insertar una nueva multivaluada con los datos de clave y valor dados, ya existen ["+mul.getClave()+","+mul.getValor()+"]");
		this.getLtoServicesFacade().getEM().persist(mul);
	}
	
	public Cliente getCurrentClient() {
		return (Cliente) this.getLtoServicesFacade().getEjb(Cliente.class.getName());
	}

	public Cliente getClienteById(Long id) {
		Cliente cliente = null;
		Map<String,Long> params = new HashMap<String,Long>();
		params.put("p_clave", id);
		List<Cliente> lc = this.getLtoServicesFacade().getListFromParameters(Cliente.class.getName(), "findById", params);
		if(lc != null)
			cliente = lc.get(0);
		return cliente;
	}
	
	public List<Cliente> getClientesByParams(Parameter... params){
		return this.getLtoServicesFacade().getListFromParameters(Cliente.class, params);
	}
}
