package com.example.Hiring.Dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CandidateRequestDto {

    @NotBlank(message = "Name is required")
    private String name;

    @NotNull(message = "Phone number is required")
    @Size(min = 10,max = 10,message = "Phone number must be 10 digits")
    private String phone;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "Gender is required")
    @Pattern(regexp = "male|female",message = "Gender can be male or female")
    private String gender;

    @NotNull(message = "Age is required")
    @Min(value = 18 ,message = "Age must be greater than 18")
    private int age;

    @NotBlank(message = "NoticePeriod is required")
    private String noticePeriod;

    private String expectedDesignation;
    private BigDecimal expectedSalary;
    private BigDecimal currentSalary;
    private String bio;

    @NotBlank(message = "Resume is required")
    private String resume;

    public static CandidateRequestDto ToEntity (CandidateRequestDto candidateRequestDto){
        CandidateRequestDto dto = new CandidateRequestDto();
        dto.setName(candidateRequestDto.getName());
        dto.setPhone(candidateRequestDto.getPhone());
        dto.setEmail(candidateRequestDto.getEmail());
        dto.setAddress(candidateRequestDto.getAddress());
        dto.setPassword(candidateRequestDto.getPassword());
        dto.setGender(candidateRequestDto.getGender());
        dto.setAge(candidateRequestDto.getAge());
        dto.setNoticePeriod(candidateRequestDto.getNoticePeriod());
        dto.setExpectedDesignation(candidateRequestDto.getExpectedDesignation());
        dto.setExpectedSalary(candidateRequestDto.getExpectedSalary());
        dto.setCurrentSalary(candidateRequestDto.getCurrentSalary());
        dto.setBio(candidateRequestDto.getBio());
        return dto;
    }

}
