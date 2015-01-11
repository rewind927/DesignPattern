package com.design.pattern.decorator;

public class BurgerQueen {

    public static void main(String[] args) {
        
        Burger submarineSandwich = new SubmarineSandwich();
        submarineSandwich = new Cheese(submarineSandwich);
        submarineSandwich = new Beef(submarineSandwich);
        System.out.println(submarineSandwich.getDescription());
        System.out.println(submarineSandwich.cost()+"\n");
        
        Burger sandwitch = new Sandwitch();
        sandwitch = new Lettuce(sandwitch);
        sandwitch = new Chicken(sandwitch);
        System.out.println(sandwitch.getDescription());
        System.out.println(sandwitch.cost()+"\n");
        
        Burger whopper = new Whopper();
        whopper = new Cheese(whopper);
        whopper = new Cheese(whopper);
        System.out.println(whopper.getDescription());
        System.out.println(whopper.cost()+"\n");
    }

}
