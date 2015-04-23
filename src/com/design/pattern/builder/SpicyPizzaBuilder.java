package com.design.pattern.builder;

public class SpicyPizzaBuilder extends PizzaBuilder {
	public void buildDough()   { pizza.dough = "pan baked"; }
	public void buildSauce()   { pizza.sauce = "hot"; }
	public void buildTopping() { pizza.topping = "pepperoni + salami"; }
}
