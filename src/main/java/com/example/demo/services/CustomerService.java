package com.example.demo.services;

import com.example.demo.domain.Actor;
import com.example.demo.transfer.KeyValue;


import java.math.BigDecimal;
import java.util.List;

public interface CustomerService extends BaseService<Actor, Long> {
	Actor findByName(String firstname);

	List<KeyValue<String, BigDecimal>> findCustomersPurchasedMostExpensiveProduct();


}
