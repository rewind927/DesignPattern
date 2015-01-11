package com.design.pattern.decorator;

public class BurgerQueen {

    public static void main(String[] args) {
        
        Burger submarineSandwich = new SubmarineSandwich();
        System.out.println(submarineSandwich.getDescription());
        System.out.println(submarineSandwich.cost()+"\n");
        
        Burger sandwitch = new Sandwitch();
        System.out.println(sandwitch.getDescription());
        System.out.println(sandwitch.cost()+"\n");
        
        Burger whopper = new Whopper();
        System.out.println(whopper.getDescription());
        System.out.println(whopper.cost()+"\n");
    }

}
