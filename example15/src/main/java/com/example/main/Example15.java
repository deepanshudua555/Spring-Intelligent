package com.example.main;

import com.example.bean.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example15 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieve the person bean from the spring context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieve the person bean from the spring context");
    }
}