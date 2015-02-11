package com.design.pattern.decorator;

public class BurgerQueen {

	public static void main(String[] args) {
		// Make a beef marine sandwich.
		Burger submarineSandwichBeef = new Beef(new SubmarineSandwich());
		System.out.println(submarineSandwichBeef.getDescription());
		System.out.println(submarineSandwichBeef.cost() + "\n");

		// Make a cheese sandwich.
		Burger cheeseSandwich = new Cheese(new Sandwich());
		System.out.println(cheeseSandwich.getDescription());
		System.out.println(cheeseSandwich.cost() + "\n");

		// Make a lettuce chicken whopper.
		Burger lettuceChickenWhopper = new Lettuce(new Chicken(new WhopperBurger()));
		System.out.println(lettuceChickenWhopper.getDescription());
		System.out.println(lettuceChickenWhopper.cost() + "\n");

		// Make a bacon cheese whopper burger.
		Burger baconCheeseWhopper = new Bacon(new Cheese(new WhopperBurger()));
		System.out.println(baconCheeseWhopper.getDescription());
		System.out.println(baconCheeseWhopper.cost() + "\n");
	}

}