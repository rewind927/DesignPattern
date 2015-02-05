package com.design.pattern.adapter.objectadapter;

import com.design.pattern.adapter.Duck;
import com.design.pattern.adapter.Turkey;

public class TurkeyObjectAdapter implements Duck {

    private Turkey turkey;

    public TurkeyObjectAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

}
