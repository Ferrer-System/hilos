package com.ferrer.spring.boot.aop.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicesImpl implements GreetingService{

	@Override
	public String sayHello(String person, String phrase) {

		String greeting = phrase + " " + person;
		System.out.println(greeting);
		return greeting;
		
	}

	@Override
	public String sayHelloError(String person, String phrase) {
		
		throw new RuntimeException("500 internal server error, metodod sayHelloError");
	}

}
