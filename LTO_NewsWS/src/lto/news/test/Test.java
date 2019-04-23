package lto.news.test;


import lto.news.entities.Post;
import lto.news.json.JSONUtils;

public class Test {
	
	public static void main(String args[]) {
		Post p = new Post();
		/*for (Object o : p.getAll() ) {
			Post post = (Post) o;
			System.out.println(post.getTitulo());
			System.out.println(post.getDescripcion());
			System.out.println(post.getEncabezado());
			System.out.println(post.getVisitas());
		}*/
		//System.out.println( JSONUtils.javaToJSON(p.getAll()) );
		
	}
}
