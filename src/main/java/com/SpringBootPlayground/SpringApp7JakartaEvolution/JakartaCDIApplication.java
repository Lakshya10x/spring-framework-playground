package com.SpringBootPlayground.SpringApp7JakartaEvolution;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Scope;
import jakarta.inject.Singleton;
import jdk.jfr.Name;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * "CDI Specification (Interface)" introduced into Java EE 6 platform in December 2009
 * now called (Jakarta Context & Dependency Injection)
 * Add the below dependency to pom.xml
    <dependency>
        <groupId>jakarta.inject</groupId>
    `   <artifactId>jakarta.inject-api</artifactId>
        <version>2.0.2</version>
    </dependency>
 */
@Named
class ClassA
{

}
@Named
@Singleton
class ClassB
{
    @Inject
    private ClassA classA;
}

@Configuration
@ComponentScan
public class JakartaCDIApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(JakartaCDIApplication.class)) {
            System.out.println(context.getBean(ClassB.class));
            System.out.println(context.getBean(ClassB.class));
        }
    }
}
