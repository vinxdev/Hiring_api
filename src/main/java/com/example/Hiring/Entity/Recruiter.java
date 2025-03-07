package com.example.Hiring.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Recruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, unique = true, length = 10)
    private String phone;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false,length = 10)
    private String gender;

    @Column(nullable = false)
    @Min(18)
    @Max(80)
    private int age;

    @Column(nullable = false, length = 50)
    private String companyName;

    @OneToMany(mappedBy = "recruiter",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Jobs> jobs;

    @OneToMany(mappedBy = "recruiter",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<RecruiterHiringLocation> hiringLocations;

    @OneToMany(mappedBy = "recruiter",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<RequiredSkills> requiredSkills;
}
