package com.design.pattern.decorator;

public class BurgerQueen {

    public static void main(String[] args) {
        
        Burger submarineSandwich = new SubmarineSandwich();
        //TODO add cheese decorator 
        //submarineSandwich = new Cheese(submarineSandwich);
        submarineSandwich = new Beef(submarineSandwich);
        System.out.println(submarineSandwich.getDescription());
        System.out.println(submarineSandwich.cost()+"\n");
        
        Burger sandwich = new Sandwich();
        sandwich = new Lettuce(sandwich);
        sandwich = new Chicken(sandwich);
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.cost() + "\n");
        
        Burger whopper = new Whopper();
        //whopper = new Cheese(whopper);
        //whopper = new Cheese(whopper)
        System.out.println(whopper.getDescription());
        System.out.println(whopper.cost()+"\n");
    }

}
