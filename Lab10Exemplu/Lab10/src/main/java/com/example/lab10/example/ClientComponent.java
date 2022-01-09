package com.example.lab10.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientComponent {
    private final TransientComponent tc;
    private final SingletonComponent sc;

    @Autowired
    public ClientComponent(TransientComponent t, SingletonComponent s){
        this.tc = t;
        this.sc = s;
        System.out.println("ClientComponent::ClientComponent = "+this);
        System.out.println("    SingletonComponent = " + sc);
        System.out.println("    TransientComponent = "+ tc);
    }

    public void operation(){
        System.out.println("Invoked ClientComponent on " + this);
        System.out.println("SingletonComponent = " + sc);
        System.out.println("TransientComponent = " + tc);
    }
}
