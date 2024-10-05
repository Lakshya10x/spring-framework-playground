package com.SpringBootPlayground.SpringApp2LooselyCoupledUsingInterface;

public class BasicJavaGamingApplication {

    public static void main(String[] args) {
    //Implementing Loosely Coupled Basic Java Gaming Application using "Gaming Console" interface
        Mario mario = new Mario();
        SuperContra contra = new SuperContra();
        var gameRunner = new GameRunner(mario);
        gameRunner.run();
    }
}
