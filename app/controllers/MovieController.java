package controllers;

import java.util.Set;

import models.Movie;
import play.mvc.*;

public class MovieController extends Controller {
	
	public Result index() {
		Set<Movie> movies = Movie.getAll();
		return ok(views.html.movie.index.render(movies));
	}
	
	public Result getMovie(Long id) {
		String titulo = "Movie con id : " + id;
		return ok(views.html.movie.getMovie.render(titulo));
	}
	
	public Result create() {
		return ok("CREATE");
	}
	
	public Result save() {
		return ok("SAVE");
	}
	public Result edit(Long id) {
		return ok("EDIT");
	}
	public Result delete(Long id) {
		return ok("DELETE");
	}
	
}

