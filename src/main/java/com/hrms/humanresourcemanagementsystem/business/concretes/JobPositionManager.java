package com.hrms.humanresourcemanagementsystem.business.concretes;

import com.hrms.humanresourcemanagementsystem.business.abstracts.JobPositonService;
import com.hrms.humanresourcemanagementsystem.model.concretes.JobPositions;
import com.hrms.humanresourcemanagementsystem.repository.abstracts.JobPositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositonService {

    private final JobPositionRepository jobPositionRepository;

    public JobPositionManager(JobPositionRepository jobPositionRepository) {
        this.jobPositionRepository = jobPositionRepository;
    }

    @Override
    public List<JobPositions> getAll() {
        return jobPositionRepository.findAll();
    }
}
