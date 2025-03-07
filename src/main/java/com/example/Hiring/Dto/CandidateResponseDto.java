package com.example.Hiring.Dto;

import com.example.Hiring.Entity.Candidate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CandidateResponseDto {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String gender;
    private int age;
    private String noticePeriod;
    private String expectedDesignation;
    private BigDecimal expectedSalary;
    private BigDecimal currentSalary;
    private String bio;
    private String resume;


    public static CandidateResponseDto fromEntity (Candidate candidate){
        return new CandidateResponseDto(
                candidate.getId(),
        candidate.getName(),
        candidate.getPhone(),
        candidate.getEmail(),
        candidate.getAddress(),
        candidate.getGender(),
        candidate.getAge(),
        candidate.getNoticePeriod(),
        candidate.getExpectedDesignation(),
        candidate.getExpectedSalary(),
        candidate.getCurrentSalary(),
        candidate.getBio(),
        candidate.getResume()
        );
    }
}
