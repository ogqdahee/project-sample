package com.example.sampleservice.serviceImpl;

import com.example.samplecore.service.PersonDomainService;
import com.example.sampleservice.service.SampleService;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    private final PersonDomainService domainService;

    public SampleServiceImpl(PersonDomainService domainService) {
        this.domainService = domainService;
    }


    @Override
    public String searchName(String name) {
        return domainService.findName(name);
    }
}
