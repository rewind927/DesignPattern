package com.design.pattern.builder;

public class Waiter {
	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder (PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void buildPizza() {
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}
