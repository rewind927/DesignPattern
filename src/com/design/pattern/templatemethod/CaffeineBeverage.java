
package com.design.pattern.templatemethod;

public abstract class CaffeineBeverage {
    
    private boolean isNeedToAddCondiments = true;

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        return isNeedToAddCondiments;
    }
    
    public void setCustomerWantsCondiments(boolean needToAddCondiment) {
        isNeedToAddCondiments = needToAddCondiment;
    }
}
