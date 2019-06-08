package lto.news.helper;

import java.util.ArrayList;
import java.util.List;

import lto.news.entities.Comentario;
import lto.news.entities.Noticia;

public class NoticiaHelper {
	
	public static List<Noticia> getFullNews(Noticia not){
		List<Noticia> lnot = null;
		String query = null;
		if(not != null) {
			query = "Select * from Noticia where not_id = '" +not.getNotId()+ "'";
		} else {
			query = "Select * from Noticia";
		}
		List<Object> rawNoticiaList = (new Noticia()).fillRowsFromQuery(query);
		/**fill children rows*/
		for (Object rawNoticia : rawNoticiaList) {
			Noticia noticia = (Noticia) rawNoticia;
			noticia.getCategorias();
			noticia.getTags();
			noticia.getImagenes();
			noticia.getComentarios();
			if (noticia.getComentarios() != null) {
				List<Object> rawComentarioList = noticia.getComentarios();
				for (Object rawComentario : rawComentarioList) {
					Comentario comentario = (Comentario) rawComentario;
					comentario.getOpiniones();
				}
			}
			if(lnot == null) {
				lnot = new ArrayList<Noticia>();
			}
			lnot.add(noticia);
		}
		return lnot;
	}
}
