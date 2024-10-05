package com.SpringBootPlayground.SpringApp2LooselyCoupledUsingInterface;

public class SuperContra implements GamingConsole{
    public void up()
    {
        System.out.println("Jump");
    }
    public void down()
    {
        System.out.println("bend");
    }
    public void right()
    {
        System.out.println("Front Fire");
    }
    public void left()
    {
        System.out.println("Back Fire");
    }
}
