package com.design.pattern.builder;

public class builderDemo {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();

		waiter.setPizzaBuilder (new HawaiianPizzaBuilder());
		waiter.buildPizza();
		Pizza hawaiianPizza = waiter.getPizza();
		System.out.println("-------- Hawaiian Pizza ---------");
		System.out.println("Dough: " + hawaiianPizza.dough);
		System.out.println("Sauce: " + hawaiianPizza.sauce);
		System.out.println("Topping: " + hawaiianPizza.topping + "\n");


		waiter.setPizzaBuilder (new SpicyPizzaBuilder());
		waiter.buildPizza();
		Pizza spicyPizza = waiter.getPizza();
		System.out.println("-------- Spicy Pizza ---------");
		System.out.println("Dough: " + spicyPizza.dough);
		System.out.println("Sauce: " + spicyPizza.sauce);
		System.out.println("Topping: " + spicyPizza.topping + "\n");
	}
}
