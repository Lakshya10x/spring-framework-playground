package com.SpringBootPlayground.SpringApp5OptimizedSpringGamingApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private GamingConsole game;

//    public GameRunner(@Qualifier("marioBachpanGame") GamingConsole game) {
//        this.game = game;
//    }

    /**
     * If @Qualifer is not present and you want to use specific class
     * Then, Use - > @Qualifier("className") with 1st letter in small case
     */
    public GameRunner(@Qualifier("mario") GamingConsole game) {
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
