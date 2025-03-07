package com.example.Hiring.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candidate_id",nullable = false)
    private Candidate candidate;

    @Column(nullable = false, length = 255)
    private String degree;

    @Column(nullable = false, length = 50)
    private String institution;

    @Min(1900)
    @Max(2100)
    private int start_year;

    @Min(1900)
    @Max(2100)
    private int end_year;

    @Column(precision = 5, scale = 2)
    private int percentage;
}
