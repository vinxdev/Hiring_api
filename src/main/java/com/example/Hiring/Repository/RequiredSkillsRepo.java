package com.example.Hiring.Repository;

import com.example.Hiring.Entity.RequiredSkills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequiredSkillsRepo extends JpaRepository<RequiredSkills,Long> {
}
