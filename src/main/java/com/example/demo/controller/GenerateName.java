/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.github.javafaker.Faker;
import java.util.Date;
import java.util.HashMap;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author Test
 */
@Component
public class GenerateName {
    private HashMap<String, String> podDetail;
    
    public GenerateName(){
        Faker faker = new Faker();
        HashMap<String, String> detail = new HashMap();
        String name = faker.name().fullName();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String streetAddress = faker.address().streetAddress();
        detail.put("name", name);
        detail.put("firstName", firstName);
        detail.put("lastName", lastName);
        detail.put("streetAddress", streetAddress);
        detail.put("time", new Date().toString());
        this.podDetail=detail;
        System.out.println(this.podDetail);
    }

    public HashMap<String, String> getPodDetail() {
        return podDetail;
    }

}
