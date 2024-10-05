package com.SpringBootPlayground.SpringApp5OptimizedSpringGamingApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContra implements GamingConsole {
    public void up()
    {
        System.out.println("Foji Jump");
    }
    public void down()
    {
        System.out.println("Foji bend");
    }
    public void right()
    {
        System.out.println("Foji Front Fire");
    }
    public void left()
    {
        System.out.println("Foji Back Fire");
    }
}
