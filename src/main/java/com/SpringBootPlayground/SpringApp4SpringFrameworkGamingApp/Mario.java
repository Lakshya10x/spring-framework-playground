package com.SpringBootPlayground.SpringApp4SpringFrameworkGamingApp;

public class Mario implements GamingConsole {
    public void up()
    {
        System.out.println("Jump");
    }
    public void down()
    {
        System.out.println("tackle by bending down");
    }
    public void right()
    {
        System.out.println("Move Forward");
    }
    public void left()
    {
        System.out.println("Move Backward");
    }
}
