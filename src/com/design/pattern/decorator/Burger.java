package com.design.pattern.decorator;

public abstract class Burger {
    protected String description;
    private boolean hasChesse;
    private boolean hasBacon;
    private boolean hasBeef;
    private boolean hasChicken;
    private boolean hasLettuce;
    
    public abstract String getDescription();
    public abstract int cost();
    public boolean isHasChesse() {
        return hasChesse;
    }
    public void setHasChesse(boolean hasChesse) {
        this.hasChesse = hasChesse;
    }
    public boolean isHasBacon() {
        return hasBacon;
    }
    public void setHasBacon(boolean hasBacon) {
        this.hasBacon = hasBacon;
    }
    public boolean isHasBeef() {
        return hasBeef;
    }
    public void setHasBeef(boolean hasBeef) {
        this.hasBeef = hasBeef;
    }
    public boolean isHasChicken() {
        return hasChicken;
    }
    public void setHasChicken(boolean hasChicken) {
        this.hasChicken = hasChicken;
    }
    public boolean isHasLettuce() {
        return hasLettuce;
    }
    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }
}
