package com.example.Hiring.Entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, unique = true, length = 10)
    private String phone;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false,length = 255)
    private String address;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false,length = 10)
    private String gender;

    @Column(nullable = false)
    @Min(18)
    @Max(80)
    private int age;

    @Column(length = 20)
    private String noticePeriod;

    @Column(length = 100)
    private String expectedDesignation;

    private BigDecimal expectedSalary;
    private BigDecimal currentSalary;

    @Column(length = 255)
    private String bio;

    @Column(length = 255)
    private String resume;


    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Education> educationList;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Experience> experienceList;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<CandidateSkill> candidateSkills;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<PreferredJobLocation> preferredJobLocations;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<JobApplication> jobApplications;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<SavedJob> savedJobs;

    @OneToMany(mappedBy = "candidate",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Project>projects;

}
