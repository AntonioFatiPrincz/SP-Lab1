package com.example.lab10;


import com.example.lab10.example.ClientComponent;
import com.example.lab10.example.SingletonComponent;
import com.example.lab10.example.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab10Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Lab10Application.class, args);

        TransientComponent transientComponent = context.getBean(TransientComponent.class);
        transientComponent.operation();

        transientComponent = context.getBean(TransientComponent.class);
        transientComponent.operation();

        SingletonComponent singletonComponent = context.getBean(SingletonComponent.class);
        singletonComponent.operation();

        singletonComponent = context.getBean(SingletonComponent.class);
        singletonComponent.operation();

        ClientComponent clientComponent = context.getBean(ClientComponent.class);
        clientComponent.operation();

        clientComponent = (ClientComponent) context.getBean("clientComponent");
        clientComponent.operation();
    }

}
