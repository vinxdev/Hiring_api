package com.example.Hiring.Repository;

import com.example.Hiring.Entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepo extends JpaRepository<JobApplication,Long> {

}
