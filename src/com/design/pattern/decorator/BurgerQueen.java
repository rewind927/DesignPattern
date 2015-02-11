package com.design.pattern.decorator;

public class BurgerQueen {

	public static void main(String[] args) {
		// Make a beef marine sandwich.
		Burger submarineSandwichBeef = new Beef(new SubmarineSandwich());
		System.out.println(submarineSandwichBeef.getDescription());
		System.out.println(submarineSandwichBeef.cost() + "\n");

		// TODO: Make a cheese sandwich.

		// Make a lettuce sandwich.
		Burger sandwich = new Lettuce(new Sandwich());
		System.out.println(sandwich.getDescription());
		System.out.println(sandwich.cost() + "\n");

		// Make a chicken whopper.
		Burger chickenBurger = new Chicken(new WhopperBurger());
		System.out.println(chickenBurger.getDescription());
		System.out.println(chickenBurger.cost() + "\n");

		// TODO: Make a bacon whopper burger.

	}

}
