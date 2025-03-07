package com.example.Hiring.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candidate_id",nullable = false)
    private Candidate candidate;

    @Column(nullable = false, length = 255)
    private String company_name;

    @Column(nullable = false, length = 100)
    private String job_title;

    @NotNull
    private LocalDate start_date;

    private LocalDate end_date;

    @Column(nullable = false, length = 255)
    private String description;
}
