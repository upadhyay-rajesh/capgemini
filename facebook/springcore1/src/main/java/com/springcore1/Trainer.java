package com.springcore1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@Scope(scopeName = "Prototype")
public class Trainer implements TrainerInterface{
	public void teach() {
		System.out.println("trainer is teaching");
	}
	
	//@PostConstruct
	public void add() {
		System.out.println("initializing Trainer");
	}
	
	//@PreDestroy
	public void add1() {
		System.out.println("destroying Trainer");
	}
}
