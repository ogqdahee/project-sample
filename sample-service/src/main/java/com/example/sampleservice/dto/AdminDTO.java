package com.example.sampleservice.dto;

public class AdminDTO {

    private String name;

    public AdminDTO(String name){
        this.name = name;
    }
    public AdminDTO(){

    }

    public String getName(){
        return this.name;
    }
}
