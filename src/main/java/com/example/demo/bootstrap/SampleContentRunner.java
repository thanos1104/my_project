package com.example.demo.bootstrap;

import com.example.demo.domain.Actor;
import com.example.demo.domain.Movie;
import com.example.demo.services.CustomerService;
import com.example.demo.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Profile("actors-movies")
@RequiredArgsConstructor
public class SampleContentRunner implements CommandLineRunner {
	private final CustomerService customerService;
	private final MovieService movieService;

	@Override
	public void run(String... args) {
		/*Actor newActor = Actor.builder().description("Mobile Phones").build();*/
		//@formatter:off
		List<Actor> actors = List.of(
				Actor.builder().email("marryporter.com")
				.firstname("Marry").lastname("Porter")
				.address("2955 Blackwell Street")
				.age(40).build(),
				Actor.builder().email("johnhamas.com")
				.firstname("John").lastname("Hamas")
				.address("4688 White Street")
				.age(45).build(),
				Actor.builder().email("annowen.com")
				.firstname("Ann").lastname("Owen")
				.address("7874 Yellow Street")
				.age(88).build(),
				Actor.builder().email("ianrory.com")
				.firstname("Ian").lastname("Rory")
				.address("7847 Pink Street")
				.age(90).build(),
				Actor.builder().email("helencarrier.com")
						.firstname("Helen").lastname("Carrier")
						.address("3215 Orange Street")
						.age(14).build(),
				Actor.builder().email("foofighter.com")
						.firstname("Foo").lastname("Fighter")
						.address("1471 Purple Street")
						.age(27).build(),
				Actor.builder().email("mariamario.com")
				.firstname("Maria").lastname("Mario")
				.address("5555 Kapou Street")
				.age(37).build()

		);
		//@formatter:on

		/*customerService.save(newCustomer);*/
		customerService.saveAll(actors);

		List<Movie> movies = List.of(
				Movie.builder().typeofdmovie("thriller")
						.title("Seen").productionstudio("WB")
						.build(),
				Movie.builder().typeofdmovie("comedy")
						.title("HaHa").productionstudio("Whatever")
						.build(),
				Movie.builder().typeofdmovie("comedy")
						.title("Laugh").productionstudio("Paramount")
						.build(),
				Movie.builder().typeofdmovie("action")
						.title("Avengers").productionstudio("MarvelStudios")
						.build(),
				Movie.builder().typeofdmovie("drama")
						.title("Cry").productionstudio("CryStudio")
						.build(),
				Movie.builder().typeofdmovie("thriller")
						.title("Shark").productionstudio("WB")
						.build(),
				Movie.builder().typeofdmovie("thriller")
						.title("Saw").productionstudio("WB")
						.build()

		);
		//@formatter:on

		/*customerService.save(newCustomer);*/
		movieService.saveAll(movies);


	}
}
