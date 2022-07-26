package com.example.samplecontroller.controller;

import com.example.sampleservice.serviceImpl.SampleServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SearchController {

    private final SampleServiceImpl service;

    public SearchController(SampleServiceImpl service) {
        this.service = service;
    }


    @GetMapping
    public String searchName(
            @PathVariable("name") String name
    ){
        return service.searchName(name);
    }
}
