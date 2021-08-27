package com.hrms.humanresourcemanagementsystem.api.controller;


import com.hrms.humanresourcemanagementsystem.business.abstracts.JobPositonService;
import com.hrms.humanresourcemanagementsystem.model.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobs")
public class JobPositionController {

    private final JobPositonService jobPositonService;

    @Autowired
    public JobPositionController(JobPositonService jobPositonService) {
        this.jobPositonService = jobPositonService;
    }

    @GetMapping("/getAll")
    public List<JobPositions> getAll() {
        return jobPositonService.getAll();
    }
}
