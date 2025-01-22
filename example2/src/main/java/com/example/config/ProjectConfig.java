package com.example.config;

import com.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
public class ProjectConfig {

    /*
        @Bean annotation, which lets Spring know that it needs to call
        this method when it initializes its context and adds the returned
        value to the context.
    */
    @Primary
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("AUDI");
        return veh;
    }
    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }
    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }


    @Bean(name="VolvoVehicle")
    Vehicle vehicle4() {
        var veh = new Vehicle();
        veh.setName("Volvo");
        return veh;
    }

    @Bean(value="SuzukiVehicle")
    Vehicle vehicle5() {
        var veh = new Vehicle();
        veh.setName("Suzuki");
        return veh;
    }

    @Bean("BMW Vehicle")
        Vehicle vehicle6() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

}
