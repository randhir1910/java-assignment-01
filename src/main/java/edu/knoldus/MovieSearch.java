package edu.knoldus;

import edu.knoldus.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieSearch {
	public static void main(String[] args) {

		List<edu.knoldus.model.Movie> movieList = new ArrayList<>();

		movieList.add(new edu.knoldus.model.Movie("Untouchable ", 2011, 8.6, "comedy"));
		movieList.add(new edu.knoldus.model.Movie("Haider", 2014, 8.0, "Drama"));
		movieList.add(new edu.knoldus.model.Movie("PK", 2014, 8.2, "comedy"));
		movieList.add(new edu.knoldus.model.Movie("Moon", 2009, 7.0, "Sci-Fi"));

		System.out.println("List out all the movies with rating more than 8 and genre comedy");
		movieList.stream().filter(movies -> movies.getRating() > 8 && movies.getGenre().equalsIgnoreCase("comedy"))
				.map(movie -> movie.getName()).forEach(System.out::println);

		System.out.println("List out all the movies with release year greater than 2000 and rating less than 8.");
		movieList.stream().filter(movies -> movies.getRating() < 8 && movies.getReleaseYear() > 2000)
				.map(movie -> movie.getName()).forEach(System.out::println);

		System.out.println("List out all the movies with rating as even number");
		movieList.stream().filter(movies -> movies.getRating() % 2 == 0)
				.map(movie -> movie.getName()).forEach(System.out::println);

		System.out.println("List out all the movies with rating equals to 7 and genre Sci-Fi");
		movieList.stream().filter(movies -> movies.getRating() == 7.0 && movies.getGenre().equalsIgnoreCase("Sci-Fi"))
				.map(movie -> movie.getName()).forEach(System.out::println);
	}
}
