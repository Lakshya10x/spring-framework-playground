package com.SpringBootPlayground.SpringApp8XMLConfiguration;

import com.SpringBootPlayground.SpringApp2LooselyCoupledUsingInterface.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * No Need of @Configuration & @ComponentScan
 * src/main/resources is directly in classpath, so just configuring the name is sufficient.
 *
 **/

public class XmlConfigurationContextLauncherApplication {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("--------------");
            context.getBean(GameRunner.class).run();
        }
    }
}
