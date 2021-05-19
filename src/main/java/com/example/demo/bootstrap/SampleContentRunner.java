package com.example.demo.bootstrap;

import com.example.demo.domain.Actor;
import com.example.demo.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Profile("product-catalog")
@RequiredArgsConstructor
public class SampleContentRunner implements CommandLineRunner {
	private final CustomerService customerService;


	@Override
	public void run(String... args) {
		/*Actor newActor = Actor.builder().description("Mobile Phones").build();*/
		//@formatter:off
		List<Actor> actors = List.of(
				Actor.builder().email("fsafa.com")
				.firstname("John").lastname("Porter")
				.address("2955 Blackwell Street")
				.age(40).build(),
				Actor.builder().email("jgasg.com")
				.firstname("John").lastname("Porter")
				.address("2955 Blackwell Street")
				.age(40).build(),
				Actor.builder().email("jadsgdl.com")
				.firstname("John").lastname("Porter")
				.address("2955 Blackwell Street")
				.age(40).build(),
				Actor.builder().email("hwress.com")
				.firstname("John").lastname("Porter")
				.address("2955 Blackwell Street")
				.age(40).build(),
				Actor.builder().email("esgsegse.com")
						.firstname("John").lastname("Porter")
						.address("2955 Blackwell Street")
						.age(40).build(),
				Actor.builder().email("jesgsel.com")
						.firstname("John").lastname("Porter")
						.address("2955 Blackwell Street")
						.age(40).build(),
				Actor.builder().email("hseses.com")
				.firstname("John").lastname("Porter")
				.address("2955 Blackwell Street")
				.age(40).build()

		);
		//@formatter:on

		/*customerService.save(newCustomer);*/
		customerService.saveAll(actors);
	}
}
