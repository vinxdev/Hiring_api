package com.example.Hiring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.ISBN;

import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false, length = 50)
    private String location;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal salary_range;

    @Column(length = 30)
    private String required_experience;

    @ManyToOne
    @JoinColumn(name = "recruiter_id",nullable = false)
    private Recruiter recruiter;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<JobApplication> jobApplications;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<SavedJob> savedJobs;



}
