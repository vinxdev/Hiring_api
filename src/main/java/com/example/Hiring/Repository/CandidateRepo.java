package com.example.Hiring.Repository;

import com.example.Hiring.Entity.Candidate;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepo extends JpaRepository<Candidate,Long> {
}
