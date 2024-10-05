package com.SpringBootPlayground.SpringApp6ExploringSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringContextLauncherApplication {
    public static void main(String[] args) {

    try(var context = new AnnotationConfigApplicationContext(SpringContextLauncherApplication.class))
    {
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
    }
}
