package com.SpringBootPlayground.SpringApp6ExploringSpring;

import ch.qos.logback.core.model.processor.DependencyDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Typically, you'd have to create seperate files but for simplicity, it would create all of them in this specific class
 */
@Component
class YourBusinessClass {
    /**
     * Field Injection - As you put @Autowired Spring will do the field injection
     */
//    @Autowired
    Dependency1 dependency1;

    //    @Autowired
    Dependency2 dependency2;

    /**
     * Setters Injection - Generate Setters & add @Autowired
     */
//    @Autowired
//    public void setDependency1(Dependency1 dependency1)
//    {
//        this.dependency1 = dependency1;
//        System.out.println("Setters Based Injection - Dependency 1");
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2)
//    {
//        this.dependency2 = dependency2;
//        System.out.println("Setters Based Injection - Dependency 2");
//    }

    /**
     * Construction Injection - Generate Constructor & add @Autowired
     * Recommended - "Constructor-Based-Injection" as dependencies are automatically set when an object is created !!
     */

//    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
        System.out.println("Constructor Injection Called");
    }

    @Override
    public String toString() {

        /**
         * String is not efficient for concatenation, if you're concatenating a lot of things then go for StringBuffer
         */
        return "YourBusinessClass{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));

        }
    }
}
