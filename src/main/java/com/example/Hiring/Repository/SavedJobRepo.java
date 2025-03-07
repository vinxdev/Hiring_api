package com.example.Hiring.Repository;

import com.example.Hiring.Entity.SavedJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavedJobRepo extends JpaRepository<SavedJob,Long> {
}
