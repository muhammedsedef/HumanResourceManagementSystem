package com.hrms.humanresourcemanagementsystem.business.abstracts;

import com.hrms.humanresourcemanagementsystem.model.concretes.JobPositions;

import java.util.List;

public interface JobPositonService {
    List<JobPositions> getAll();
}
