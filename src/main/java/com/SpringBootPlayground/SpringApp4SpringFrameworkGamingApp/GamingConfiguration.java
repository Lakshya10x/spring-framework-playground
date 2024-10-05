package com.SpringBootPlayground.SpringApp4SpringFrameworkGamingApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new SuperContra();
        return game;
    }

    @Bean
    public GameRunner runner(GamingConsole game) {
        return new GameRunner(game);
    }
}
