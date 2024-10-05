package com.SpringBootPlayground.SpringApp1TightlyCoupledGamingApp;

public class GameRunner {

//    private Mario game;
    SuperContra game = new SuperContra();
    public GameRunner(SuperContra game) {
    this.game = game;
    }

    public void run() {
        System.out.println("Running game : " + game);
        game.right();
        game.up();
        game.left();
        game.down();
    }
}
