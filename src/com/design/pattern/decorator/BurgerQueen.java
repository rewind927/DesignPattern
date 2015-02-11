package com.design.pattern.decorator;

public class BurgerQueen {

	public static void main(String[] args) {
		// Make a beef marine sandwich.
		Burger submarineSandwichBeef = new Beef(new SubmarineSandwich());
		System.out.println(submarineSandwichBeef.getDescription());
		System.out.println(submarineSandwichBeef.cost() + "\n");

		// TODO: Make a cheese sandwich.

		// Make a lettuce chicken whopper.
		Burger lettuceChickenWhopper = new Lettuce(new Chicken(new WhopperBurger()));
		System.out.println(lettuceChickenWhopper.getDescription());
		System.out.println(lettuceChickenWhopper.cost() + "\n");

		// TODO: Make a bacon whopper burger.

	}

}