package com.example.Hiring.Repository;

import com.example.Hiring.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepo extends JpaRepository<Skills,Long> {
}
