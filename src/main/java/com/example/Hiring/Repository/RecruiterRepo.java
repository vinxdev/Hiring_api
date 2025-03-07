package com.example.Hiring.Repository;

import com.example.Hiring.Entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterRepo extends JpaRepository<Recruiter,Long> {
}
