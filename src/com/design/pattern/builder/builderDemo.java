package com.design.pattern.builder;

public class builderDemo {
	public static void main(String[] args) {

		Waiter waiter = new Waiter(); // Director
		waiter.setPizzaBuilder();
		waiter.buildPizza();
		Pizza hawaiianPizza = waiter.getPizza();
		System.out.println("-------- Hawaiian Pizza ---------");
		System.out.println("Dough: " + hawaiianPizza.dough);
		System.out.println("Sauce: " + hawaiianPizza.sauce);
		System.out.println("Topping: " + hawaiianPizza.topping + "\n");

		//TODO SpicyPizzaBuilder: dough = "pan baked", sauce = "hot", Topping = "pepperoni + salami"

	}
}
