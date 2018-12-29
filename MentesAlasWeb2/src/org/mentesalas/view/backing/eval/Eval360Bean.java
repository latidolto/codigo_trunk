package org.mentesalas.view.backing.eval;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
import org.mentesalas.model.MentesAlasFacade;
import org.mentesalas.model.entities.EvaluacionDefinicion;
import org.mentesalas.model.entities.EvaluacionDefinicionPregunta;
import org.mentesalas.model.entities.EvaluacionDefinicionPreguntaPK;
import org.mentesalas.model.entities.Multivaluada;
import org.mentesalas.view.util.JsfUtils;

public class Eval360Bean
{
  public List<EvaluacionDefinicion> getEvaluaciones()
  {
    return MentesAlasFacade.getInstance().getFindAllList(EvaluacionDefinicion.class.getName());
  }
  
  public EvaluacionDefinicion getEvaluacionDefinicion()
  {
    return (EvaluacionDefinicion)MentesAlasFacade.getInstance().getEjb(EvaluacionDefinicion.class.getName());
  }
  
  public List<Multivaluada> getTiposEvaluacion()
  {
    return MentesAlasFacade.getInstance().getMultivaluada("0117");
  }
  
  public void onSelect(EvaluacionDefinicion eva, String typeOfSelection, String indexes)
  {
    MentesAlasFacade.getInstance().setEjb(EvaluacionDefinicion.class.getName(), eva);
    MentesAlasFacade.getInstance().setLedp(null);
  }
  
  public void clickCloseModalEva(ActionEvent ae)
  {
    JsfUtils.resfreshComponentById("panelForm");
  }
  
  public List<EvaluacionDefinicionPregunta> getPreguntas()
  {
    List<EvaluacionDefinicionPregunta> ledp = MentesAlasFacade.getInstance().getLedp();
    if (ledp == null)
    {
      EvaluacionDefinicion ed = getEvaluacionDefinicion();
      if (ed != null)
      {
        int evalId = ed.getEvaluacionId();
        ledp = MentesAlasFacade.getInstance().getPreguntas(evalId);
        MentesAlasFacade.getInstance().setLedp(ledp);
      }
    }
    return ledp;
  }
  
  public void saveAction(ActionEvent ae)
  {
    EvaluacionDefinicion ed = getEvaluacionDefinicion();
    if (ed.getEvaluacionId() == 0) {
      MentesAlasFacade.getInstance().persistEjb(EvaluacionDefinicion.class.getName());
    } else {
      MentesAlasFacade.getInstance().mergeEjb(EvaluacionDefinicion.class.getName());
    }
    List<EvaluacionDefinicionPregunta> ledp = ed.getLedp();
    if (ledp != null)
    {
      int idPr = 0;
      for (EvaluacionDefinicionPregunta edp : ledp)
      {
        edp.setEvaluacionRespuestaBienRegularMalo(0);
        edp.setEvaluacionRespuestaComentarios(0);
        edp.setEvaluacionRespuestaExcelenteMalo(0);
        edp.setEvaluacionRespuestaSiNo(0);
        edp.setEvaluacionRespuestaSiNoNose(0);
        edp.setEvaluacionRespuestaUnoACinco(0);
        if (edp.getTipoPregunta() == 0) {
          edp.setEvaluacionRespuestaBienRegularMalo(1);
        }
        if (edp.getTipoPregunta() == 1) {
          edp.setEvaluacionRespuestaExcelenteMalo(1);
        }
        if (edp.getTipoPregunta() == 2) {
          edp.setEvaluacionRespuestaSiNo(1);
        }
        if (edp.getTipoPregunta() == 3) {
          edp.setEvaluacionRespuestaSiNoNose(1);
        }
        if (edp.getTipoPregunta() == 4) {
          edp.setEvaluacionRespuestaUnoACinco(1);
        }
        if (edp.getTipoPregunta() == 5) {
          edp.setEvaluacionRespuestaComentarios(1);
        }
        if (edp.isTieneComentarios()) {
          edp.setEvaluacionRespuestaComentarios(1);
        }
        System.out.println("Valor de la pregunta");
        System.out.println(edp.getEvaluacionPregunta());
        System.out.println("EvaluacionId:" + ed.getEvaluacionId());
        System.out.println("PreguntaOrdenId:" + edp.getId().getEvaluacionPreguntaOrden());
        if (edp.getId().getEvaluacionPreguntaOrden() == 0)
        {
          edp.setId(new EvaluacionDefinicionPreguntaPK(ed.getEvaluacionId(), idPr++));
          MentesAlasFacade.getInstance().getEM().persist(edp);
          System.out.println("persist");
        }
        else
        {
          edp.setId(new EvaluacionDefinicionPreguntaPK(ed.getEvaluacionId(), edp.getId().getEvaluacionPreguntaOrden()));
          MentesAlasFacade.getInstance().getEM().merge(edp);
          System.out.println("merge");
        }
      }
    }
    JsfUtils.resfreshComponentById("panelForm");
    System.out.println("Guardado Exitoso");
  }
  
  public void addAction(ActionEvent ae)
  {
    EvaluacionDefinicion ed = getEvaluacionDefinicion();
    List<EvaluacionDefinicionPregunta> ledp = ed.getLedp();
    if (ledp == null) {
      ledp = new ArrayList();
    }
    ledp.add(new EvaluacionDefinicionPregunta());
    ed.setLedp(ledp);
    JsfUtils.resfreshComponentById("panelForm");
  }
  
  public void removeAction(ActionEvent ae)
  {
    EvaluacionDefinicionPregunta edp = (EvaluacionDefinicionPregunta)ae.getComponent().getAttributes().get("row");
    EvaluacionDefinicion ed = getEvaluacionDefinicion();
    List<EvaluacionDefinicionPregunta> ledp = ed.getLedp();
    if (ledp != null)
    {
      MentesAlasFacade.getInstance().getEM().remove(edp);
      ledp.remove(edp);
    }
    JsfUtils.resfreshComponentById("panelForm");
  }
  
  public void duplicateAction(ActionEvent ae)
  {
    EvaluacionDefinicion ed = getEvaluacionDefinicion();
    EvaluacionDefinicion ed_c = new EvaluacionDefinicion();
    try
    {
      MentesAlasFacade.getInstance().settingNextId(ed_c);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
    ed_c.setComentarios(ed.getComentarios());
    ed_c.setEvaluacionFechaCreacion(ed.getEvaluacionFechaCreacion());
    ed_c.setEvaluacionFechaModificacion(ed.getEvaluacionFechaModificacion());
    ed_c.setEvaluacionTipo(ed.getEvaluacionTipo());
    ed_c.setEvaluacionVersion(ed.getEvaluacionVersion());
    ed_c.setUsuCve(ed.getUsuCve());
    MentesAlasFacade.getInstance().getEM().persist(ed_c);
    
    List<EvaluacionDefinicionPregunta> ledp_c = new ArrayList();
    int evalId = ed.getEvaluacionId();
    List<EvaluacionDefinicionPregunta> ledp = MentesAlasFacade.getInstance().getPreguntas(evalId);
    int idPr = 1;
    for (EvaluacionDefinicionPregunta edp : ledp)
    {
      EvaluacionDefinicionPregunta edp_c = new EvaluacionDefinicionPregunta();
      
      edp_c.setEvaluacionPregunta(edp.getEvaluacionPregunta());
      edp_c.setEvaluacionRespuestaBienRegularMalo(edp.getEvaluacionRespuestaBienRegularMalo());
      edp_c.setEvaluacionRespuestaComentarios(edp.getEvaluacionRespuestaComentarios());
      edp_c.setEvaluacionRespuestaExcelenteMalo(edp.getEvaluacionRespuestaExcelenteMalo());
      edp_c.setEvaluacionRespuestaSiNo(edp.getEvaluacionRespuestaSiNo());
      edp_c.setEvaluacionRespuestaSiNoNose(edp.getEvaluacionRespuestaSiNoNose());
      edp_c.setEvaluacionRespuestaUnoACinco(edp.getEvaluacionRespuestaUnoACinco());
      edp_c.setId(new EvaluacionDefinicionPreguntaPK(ed_c.getEvaluacionId(), idPr++));
      MentesAlasFacade.getInstance().getEM().persist(edp_c);
      ledp_c.add(edp_c);
    }
    ed_c.setLedp(ledp_c);
    
    MentesAlasFacade.getInstance().setEjb(EvaluacionDefinicion.class.getName(), ed_c);
    MentesAlasFacade.getInstance().setLedp(ledp_c);
    JsfUtils.resfreshComponentById("panelForm");
  }
}
