package controllers;

import play.mvc.*;

public class MovieController extends Controller {
	
	public Result index() {
		String titulo = "Testing";
		return ok(views.html.movie.index.render(titulo));
	}

}
