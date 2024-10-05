package com.SpringBootPlayground.SpringApp4SpringFrameworkGamingApp;

public class GameRunner {

    private GamingConsole game;

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
