package models;

import java.util.HashSet;
import java.util.Set;

public class Movie {
	public Long id;
	public String title;
	public Integer year;
	public String director;
	public Movie() {
		super();
	}
	public Movie(Long id, String title, Integer year, String director) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.director = director;
	}
	
	private static Set<Movie> movies;
	static {
		movies = new HashSet<>();
		movies.add(new Movie(1L,"E.T.",1989,"Spilberg"));
		movies.add(new Movie(2L,"Back to the future",1985,"Semeckis"));
		movies.add(new Movie(3L,"The Godfarher",1975,"Coppola"));
	}
	
	public static Set<Movie> getAll(){
		return movies;
	}
	
	public static Movie getMovie(Long id) {
		for (Movie movie : movies) {
			if(id.equals(movie.id)) {
				return movie;
			}
		}
		return null;
	}
}
