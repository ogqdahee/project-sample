package com.example.sampleservice.service;

import com.example.sampleservice.command.AdminCommand;
import com.example.sampleservice.dto.AdminDTO;

public interface SampleService {

    AdminDTO searchName(AdminCommand name);
}
