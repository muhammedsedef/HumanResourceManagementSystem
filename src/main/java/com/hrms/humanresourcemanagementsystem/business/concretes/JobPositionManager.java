package com.hrms.humanresourcemanagementsystem.business.concretes;

import com.hrms.humanresourcemanagementsystem.business.abstracts.JobPositonService;
import com.hrms.humanresourcemanagementsystem.core.utilities.results.DataResult;
import com.hrms.humanresourcemanagementsystem.core.utilities.results.Result;
import com.hrms.humanresourcemanagementsystem.core.utilities.results.SuccessDataResult;
import com.hrms.humanresourcemanagementsystem.core.utilities.results.SuccessResult;
import com.hrms.humanresourcemanagementsystem.model.concretes.JobPosition;
import com.hrms.humanresourcemanagementsystem.repository.abstracts.JobPositionRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class JobPositionManager implements JobPositonService {

    private final JobPositionRepository jobPositionRepository;

    public JobPositionManager(JobPositionRepository jobPositionRepository) {
        this.jobPositionRepository = jobPositionRepository;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>
                (jobPositionRepository.findAll(), "meslek rolleri listelendi");

    }

    @Override
    public Result add(@RequestBody JobPosition jobPosition) {
        jobPositionRepository.save(jobPosition);
        return new SuccessResult("meslek rolü eklendi");
    }
}
