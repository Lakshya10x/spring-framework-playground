package com.SpringBootPlayground.SpringApp2LooselyCoupledUsingInterface;

public class GameRunner {

    GamingConsole game;
    public GameRunner(GamingConsole game) {
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
