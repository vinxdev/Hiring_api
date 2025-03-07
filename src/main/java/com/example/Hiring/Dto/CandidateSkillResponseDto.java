package com.example.Hiring.Dto;

import com.example.Hiring.Entity.Candidate;
import com.example.Hiring.Entity.CandidateSkill;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
public class CandidateSkillResponseDto {

    private Long id;
    private Long candidateId;
    private Long skillsId;
    private String skillName;

    private static CandidateSkillResponseDto FromEntity (CandidateSkill candidateSkill){
        return new CandidateSkillResponseDto(
                candidateSkill.getId(),
                candidateSkill.getCandidate().getId(),
                candidateSkill.getSkills().getId(),
                candidateSkill.getSkills().getName()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public Long getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(Long skillsId) {
        this.skillsId = skillsId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
