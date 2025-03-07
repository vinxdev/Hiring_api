package com.example.Hiring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 255)
    private String description;

    @Column(nullable = false, length = 50)
    private String project_name;

    @ManyToOne
    @JoinColumn(nullable = false,name = "candidate_id")
    private Candidate candidate;
}
