package com.SpringBootPlayground.SpringApp4SpringFrameworkGamingApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaGamingSpringApplication {
    public static void main(String[] args) {

        /** context is never closed -> Leads to 'Resource Leakage'.
         1. Put "try-catch" block and finally to close the context
         2. Use "try with resources"
         **/
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
