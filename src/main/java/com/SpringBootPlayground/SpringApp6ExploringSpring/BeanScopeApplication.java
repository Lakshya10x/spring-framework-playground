package com.SpringBootPlayground.SpringApp6ExploringSpring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * Scopes applicable ONLY for web-aware Spring Application Context
    Request - One object instance per single HTTP request
    Session - One object instance per user HTTP session
    Application - One object instance per entire web-application runtime
    Websocket - One object instance per Websocket instance.

 Java Singleton : One object instance per JVM
 Spring Singleton : One object instance per Spring IOC Container
 However, is running multiple Spring IOC Container in a JVM, then both are diff
 Usually - We do not run multiple Spring IOC Container
 */


/**
 *  By Default, all the beans created in spring are Singletons - returns same instance back
 *  Singleton : One object instance per Spring IOC Container
 * @Scope(value = Configurable.BeanFactory.SCOPE_SINGLETON)
 */
@Component
class NormalClass
{

}

/**
 * Prototype : Possibly many object instances per Spring IOC Container
 */
@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Scope(value = "prototype")
class PrototypeClass

{

}

@Configuration
@ComponentScan
public class BeanScopeApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BeanScopeApplication.class)) {
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println("------------------");
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
