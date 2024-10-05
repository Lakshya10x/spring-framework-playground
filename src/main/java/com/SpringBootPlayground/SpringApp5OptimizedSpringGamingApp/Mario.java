package com.SpringBootPlayground.SpringApp5OptimizedSpringGamingApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("MarioBachpanGame")
public class Mario implements GamingConsole {
    public void up()
    {
        System.out.println("Mario Jump");
    }
    public void down()
    {
        System.out.println("Mario tackle by bending down");
    }
    public void right()
    {
        System.out.println("Mario Move Forward");
    }
    public void left()
    {
        System.out.println("Mario Move Backward");
    }
}
