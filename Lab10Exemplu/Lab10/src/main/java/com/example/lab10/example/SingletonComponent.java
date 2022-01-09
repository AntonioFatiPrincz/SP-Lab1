package com.example.lab10.example;

import org.springframework.stereotype.Component;

@Component
public class SingletonComponent {
    public SingletonComponent(){
        System.out.println("SingletonComponent::SingletonComponent =" + this);
    }

    public void operation(){
        System.out.println("Invoke SingletonComponent::operation() on " + this);
    }


}
