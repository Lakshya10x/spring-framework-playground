package com.SpringBootPlayground.SpringApp3HelloWorldSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Sita";
    }

    @Bean
    public int age() {
        return 23;
    }

    @Bean
    public Person person() {
        return new Person("Ram", 0, new Address("Ram Mandir Road", "Jaipur"));
    }

    @Bean(name = "currentPata")
    @Primary
    public Address address1() {
        return new Address("Sector 18", "Gurugram");
    }

    @Bean(name = "companyAddress")
    @Qualifier("address2Qualifier")
    public Address address2()
    {
        return new Address("Sector 48","Gurugram");
    }
    @Bean
    public Person personMethodCall() {
        return new Person("Lakshya", 24, address1());
    }

    @Bean
    public Person person1ParametersCall(String name, int age, Address currentPata) {
        return new Person("Sourabh", age, currentPata);
    }
    @Bean
    public Person person2ParametersCall(String name, int age,@Qualifier("address2Qualifier") Address companyAddressORxyz) {
        return new Person("Aman", age, companyAddressORxyz);
    }
}
