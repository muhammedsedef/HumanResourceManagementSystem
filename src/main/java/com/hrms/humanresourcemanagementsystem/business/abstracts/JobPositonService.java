package com.hrms.humanresourcemanagementsystem.business.abstracts;

import com.hrms.humanresourcemanagementsystem.core.utilities.results.DataResult;
import com.hrms.humanresourcemanagementsystem.core.utilities.results.Result;
import com.hrms.humanresourcemanagementsystem.model.concretes.JobPosition;

import java.util.List;

public interface JobPositonService {
    DataResult<List<JobPosition>> getAll();
    Result add(JobPosition jobPosition);
}
