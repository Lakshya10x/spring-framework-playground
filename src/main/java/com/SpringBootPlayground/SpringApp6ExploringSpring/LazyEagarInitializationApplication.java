package com.SpringBootPlayground.SpringApp6ExploringSpring;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
/**
 * @Lazy(value=false)
 *  Default initialization for Spring bean is : Eager
 *  Errors will prevent application from starting up
 */
class ClassA
{

}
@Component
@Lazy
/** (@Lazy or @Lazy(value=true))
    Lazy : Indicate whether a bean is to be lazily initialized.
    Errors will result in runtime exception+
    If you have lot of complex initialization logic & you don't want to delay the startup
 **/
 class ClassB
{
    ClassA classA;
    public ClassB(ClassA classA)
    {
        // Complex initialization logic
        this.classA = classA;
        System.out.println("Some initialization logic");
    }
    public void doSomething()
    {
        System.out.println("Do Some Work");
    }
}


@Configuration
@ComponentScan
public class LazyEagarInitializationApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(LazyEagarInitializationApplication.class))
        {
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("initializaion of context is completed");
            context.getBean((ClassB.class)).doSomething();
        }

    }
}
