package com.SpringBootPlayground.SpringApp3HelloWorldSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorldSpringApplication {

    public static void main(String[] args) {

        // 1 - Launch a Spring Context
        // 2 - Configure the things that we want "Spring Framework" to manage -> @Configuration
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //Retrieve bean using attribute name
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("person"));
        //or
        //Retrieve bean using Class Type
//        System.out.println(context.getBean(Person.class));  -> Ambiguity Error
        System.out.println("----------");
        System.out.println("By Attribute : " + context.getBean("currentPata"));
        System.out.println("By class name : " +context.getBean(Address.class));
        System.out.println(context.getBean("personMethodCall"));
        System.out.println("----------");
        System.out.println("Prioritize beans matching beans");
        System.out.println(context.getBean("person1ParametersCall"));
        System.out.println(context.getBean("person2ParametersCall"));
        System.out.println("----------");
        System.out.println("Listing of beans managed by spring");
        System.out.println(context.getBeanDefinition("person"));
        System.out.println(context.getBeanDefinitionCount());
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("----------");

    }
}
