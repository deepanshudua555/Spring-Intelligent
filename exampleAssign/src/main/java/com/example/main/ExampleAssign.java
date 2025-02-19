package com.example.main;

import com.example.bean.Person;
import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleAssign {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        String[] persons = context.getBeanNamesForType(Person.class);
//        Person person = context.getBean(Person.class);
//        String[] names = context.getBeanNamesForType(Vehicle.class);
//        /*Vehicle vehicle = context.getBean(Vehicle.class);
//        vehicle.getVehicleServices().playMusic();
//        vehicle.getVehicleServices().moveVehicle();*/
//        person.getVehicle().getVehicleServices().playMusic();
//        person.getVehicle().getVehicleServices().moveVehicle();

        VehicleServices v1 = context.getBean(VehicleServices.class);
        VehicleServices v2 = context.getBean("vehicleServices",VehicleServices.class);

        System.out.println("Hashcode of v1 is: " + v1.hashCode());
        System.out.println("Hashcode of v2 is: " + v2.hashCode());

        if(v1 == v2) {
            System.out.println("VehicleServices bean is a Singleton bean");
        }
    }
}