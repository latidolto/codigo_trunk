package org.mentesalas.view.backing.expgen;

import java.util.Date;
import java.util.List;
import javax.faces.event.ActionEvent;
import org.mentesalas.model.MentesAlasFacade;
import org.mentesalas.model.entities.Integrante;
import org.mentesalas.model.entities.Multivaluada;
import org.mentesalas.view.security.SecurityManager;
import org.mentesalas.view.util.JsfUtils;

public class RegistroProspecto
{
  public Integrante getIntegrante()
  {
    return (Integrante)MentesAlasFacade.getInstance().getEjb(Integrante.class.getName());
  }
  
  public List<Integrante> getIntegrantes()
  {
    return MentesAlasFacade.getInstance().getFindAllList(Integrante.class.getName());
  }
  
  public void onSelect(Integrante eva, String typeOfSelection, String indexes)
  {
    MentesAlasFacade.getInstance().setEjb(Integrante.class.getName(), eva);
  }
  
  public void clickCloseModalEva(ActionEvent ae)
  {
    JsfUtils.resfreshComponentById("panelForm");
  }
  
  public List<Multivaluada> getLugarOcupaFamilia()
  {
    return MentesAlasFacade.getInstance().getMultivaluada("0101");
  }
  
  public List<Multivaluada> getEstadosCivil()
  {
    return MentesAlasFacade.getInstance().getMultivaluada("0106");
  }
  
  public List<Multivaluada> getEscolaridades()
  {
    return MentesAlasFacade.getInstance().getMultivaluada("0102");
  }
  
  public void newAction(ActionEvent ae)
  {
    Integrante integrante = new Integrante();
    MentesAlasFacade.getInstance().setEjb(Integrante.class.getName(), integrante);
  }
  
  public void saveAction(ActionEvent ae)
  {
    Integrante integrante = getIntegrante();
    integrante.setFecMod(new Date(System.currentTimeMillis()));
    integrante.setUsuCve(SecurityManager.getInstance().getUserName());
    if (integrante.getIntId() == 0) {
      MentesAlasFacade.getInstance().persistEjb(Integrante.class.getName());
    } else {
      MentesAlasFacade.getInstance().mergeEjb(Integrante.class.getName());
    }
    JsfUtils.JSfMessages.info("Guardado Exitoso.");
  }
  
  public void deleteAction(ActionEvent ae)
  {
    Integrante integrante = getIntegrante();
    integrante.setIntEstatus(0);
    integrante.setFecMod(new Date(System.currentTimeMillis()));
    integrante.setUsuCve(SecurityManager.getInstance().getUserName());
    MentesAlasFacade.getInstance().mergeEjb(Integrante.class.getName());
    JsfUtils.JSfMessages.info("Guardado Exitoso.");
  }
  
  public void clearAction(ActionEvent ae)
  {
    Integrante integrante = new Integrante();
    MentesAlasFacade.getInstance().setEjb(Integrante.class.getName(), integrante);
  }
  
  public void changeDateFecNac() {}
}
