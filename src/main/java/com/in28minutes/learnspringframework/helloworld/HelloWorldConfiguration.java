package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {

};

record Address(String street, String city) {

};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Toros";
    }

    @Bean
    public int age() {
        return 37;
    }

    @Bean
    public Person person() {
        return new Person("Rambo", 45, new Address("Palatset", "Dalarna"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Kungliga Slottet", "Stockholm");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("Castle", "Vania");
    }
}
