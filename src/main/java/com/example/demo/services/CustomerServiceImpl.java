package com.example.demo.services;

import com.example.demo.domain.Actor;
import com.example.demo.domain.Movie;
import com.example.demo.repository.ActorRepository;
import com.example.demo.transfer.KeyValue;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl extends com.example.demo.services.AbstractServiceImpl<Actor> implements CustomerService {
	private final ActorRepository ActorRepository;

	@Override
	public JpaRepository<Actor, Long> getRepository() {
		return ActorRepository;
	}

	@Override
	public Actor findByName(String firstname) {

		return ActorRepository.findByName(firstname);
	}



	@Override
	public List<KeyValue<String, BigDecimal>> findCustomersPurchasedMostExpensiveProduct() {
		return null;
	}
}
