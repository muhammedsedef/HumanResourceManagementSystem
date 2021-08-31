package com.hrms.humanresourcemanagementsystem.api.controllers;


import com.hrms.humanresourcemanagementsystem.business.abstracts.JobPositonService;
import com.hrms.humanresourcemanagementsystem.core.utilities.results.DataResult;
import com.hrms.humanresourcemanagementsystem.core.utilities.results.Result;
import com.hrms.humanresourcemanagementsystem.model.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public DataResult<List<JobPosition>> getAll() {
        return jobPositonService.getAll();
    }

    @PostMapping
    public Result add(JobPosition jobPosition) {
        return jobPositonService.add(jobPosition);
    }


}
