package com.design.pattern.adapter.classadapter;

import com.design.pattern.adapter.Duck;
import com.design.pattern.adapter.WildTurkey;

public class TurkeyClassAdapter extends WildTurkey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            super.fly();
        }
    }

}
