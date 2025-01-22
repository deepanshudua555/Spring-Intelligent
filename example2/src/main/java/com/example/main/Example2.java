package com.example.main;


import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        Vehicle veh1 = context.getBean( "VolvoVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());
        Vehicle veh2 = context.getBean(  "SuzukiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());
        Vehicle veh3 = context.getBean(  "BMW Vehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());
        Vehicle veh4 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh4.getName());


    }
}