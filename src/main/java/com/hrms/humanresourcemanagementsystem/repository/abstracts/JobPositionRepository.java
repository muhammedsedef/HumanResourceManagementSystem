package com.hrms.humanresourcemanagementsystem.repository.abstracts;

import com.hrms.humanresourcemanagementsystem.model.concretes.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionRepository extends JpaRepository<JobPositions, Integer> {

}
