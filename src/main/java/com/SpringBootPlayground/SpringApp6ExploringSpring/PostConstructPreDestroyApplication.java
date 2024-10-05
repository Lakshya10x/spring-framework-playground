package com.SpringBootPlayground.SpringApp6ExploringSpring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @PostConstruct - Used on a method that needs to be executed after the dependency injection is done to perform any initialization.
                    This method must be invoked before the class is put into service.
 * @PreDestroy - Used on a method as a callback notification to signal that the instance is in the process of being removed by the container.
                    It is typically used yo release resources that it has been holding.
 */

@Component
class SomeClass
{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency)
    {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready !!");
    }
    public void maintenance()
    {
        System.out.println("Code Maintaining");
    }
    @PostConstruct
    public void initialize()
    {
        someDependency.getReady();
    }
    @PreDestroy
    public void cleanUp()
    {
        System.out.println("Clean Up code");
    }
}
@Component
class SomeDependency
{
    public void getReady()
    {
        System.out.println("Some logic using SomeDependency");
    }
}

@Configuration
@ComponentScan("com/SpringBootPlayground/SpringApp6ExploringSpring")
public class PostConstructPreDestroyApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PostConstructPreDestroyApplication.class)) {
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(SomeClass.class));
            context.getBean(SomeClass.class).maintenance();
        }
    }
}
