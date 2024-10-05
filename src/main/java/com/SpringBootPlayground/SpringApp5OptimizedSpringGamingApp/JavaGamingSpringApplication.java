package com.SpringBootPlayground.SpringApp5OptimizedSpringGamingApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Instead of using seperate configuration class -> resuse the Launcher Class (JavaGamingSpringApplication)
 */
@Configuration
@ComponentScan("com/SpringBootPlayground/SpringApp5OptimizedSpringGamingApp")
public class JavaGamingSpringApplication {
    class GamingConfiguration {

        /**
         * Instead of writing below  -> Telling Spring to create an Instance of specific class by adding annotation (@Component)
         * Spring has created an instance of the Mario game and also auto-wire it to GamingConsole
         * Instead of manually created the instance of GameRunner, Spring create them for us.
         **/
//        @Bean
//        public GamingConsole game() {
//            return new Mario();
//        }

//        @Bean
//        public GameRunner runner(GamingConsole game) {
//            return new GameRunner(game);
//        }
    }

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(JavaGamingSpringApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
