package com.SpringBootPlayground.SpringApp1TightlyCoupledGamingApp;

public class BasicJavaGamingApplication {

    public static void main(String[] args) {

        Mario mario = new Mario();
        SuperContra contra = new SuperContra();
        var gameRunner = new GameRunner(contra);
        gameRunner.run();
    }
}
