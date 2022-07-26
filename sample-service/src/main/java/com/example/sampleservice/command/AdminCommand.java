package com.example.sampleservice.command;


public class AdminCommand {

    private String name;
    public AdminCommand(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
