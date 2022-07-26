package com.example.sampleservice.serviceImpl;

import com.example.samplecore.service.PersonDomainService;
import com.example.sampleservice.command.AdminCommand;
import com.example.sampleservice.dto.AdminDTO;
import com.example.sampleservice.service.SampleService;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    private final PersonDomainService domainService;

    public SampleServiceImpl(PersonDomainService domainService) {
        this.domainService = domainService;
    }


    @Override
    public AdminDTO searchName(AdminCommand cmd) {
        return new AdminDTO(domainService.findName(cmd.getName()));
    }
}
