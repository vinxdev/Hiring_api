package com.example.Hiring.Repository;

import com.example.Hiring.Entity.PreferredJobLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferredJobLocationRepo extends JpaRepository<PreferredJobLocation,Long> {
}
