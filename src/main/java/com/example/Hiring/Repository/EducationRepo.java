package com.example.Hiring.Repository;

import com.example.Hiring.Entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepo extends JpaRepository<Education,Long> {
}
