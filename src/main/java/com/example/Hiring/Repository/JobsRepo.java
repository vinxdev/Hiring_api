package com.example.Hiring.Repository;

import com.example.Hiring.Entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepo extends JpaRepository<Jobs,Long> {

}
