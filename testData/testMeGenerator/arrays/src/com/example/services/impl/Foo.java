package com.example.services.impl;

import com.example.warriers.FooFighter;
import com.example.foes.Fire;
<caret>
public class Foo{

    private FooFighter[] fooFighter;

    public String fight(Fire[] withFire,String[] foeName, int[  ] times) {
        return fooFighter[0].fight(withFire[0]);
    }

}
