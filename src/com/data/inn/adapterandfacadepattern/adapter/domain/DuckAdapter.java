package com.data.inn.adapterandfacadepattern.adapter.domain;

import com.data.inn.adapterandfacadepattern.adapter.domain.Duck;
import com.data.inn.adapterandfacadepattern.adapter.domain.Turkey;

public class DuckAdapter implements Duck {

    Turkey turkey;

    public DuckAdapter(Turkey turkey){

        this.turkey = turkey;
    }

    @Override
    public String quack() {

        return turkey.gobbles();
    }

    @Override
    public String fly() {

        // To fly equivalent to a duck turkey need to fly at least 5 times.
        StringBuilder s= new StringBuilder();
        for( int x=0;x<5;x++){
            s.append(" ").append(turkey.fly());
        }

        return s.toString();
    }
}
