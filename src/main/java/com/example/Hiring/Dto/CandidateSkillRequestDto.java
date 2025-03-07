package com.example.Hiring.Dto;

import com.example.Hiring.Entity.Candidate;
import com.example.Hiring.Entity.Skills;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CandidateSkillRequestDto {

    @NotNull(message = "Candidate Id is required")
    private Long candidateId;

    @NotNull(message = "Skill Id is required")
    private Long skillsId;

    private static CandidateSkillRequestDto toEntity(CandidateSkillRequestDto candidateSkillRequestDto){
        CandidateSkillRequestDto dto = new CandidateSkillRequestDto();
        dto.setCandidateId(candidateSkillRequestDto.getCandidateId());
        dto.setSkillsId(candidateSkillRequestDto.getSkillsId());
        return dto;
    }
}
