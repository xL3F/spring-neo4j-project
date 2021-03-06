package movies.spring.data.neo4j.movies;

import java.util.List;

public class PersonDetails {

	private final String name;

	private final Integer born;

	private final List<Movie> actedIn;

	private final List<Movie> directed;

	private final List<Person> related;

	public PersonDetails(String name, Integer born, List<Movie> actedIn,
		List<Movie> directed, List<Person> related) {
		this.name = name;
		this.born = born;
		this.actedIn = actedIn;
		this.directed = directed;
		this.related = related;
	}

	public String getName() {
		return name;
	}

	public Integer getBorn() {
		return born;
	}

	public List<Movie> getActedIn() {
		return actedIn;
	}

	public List<Movie> getDirected() {
		return directed;
	}

	public List<Person> getRelated() {
		return related;
	}
}
