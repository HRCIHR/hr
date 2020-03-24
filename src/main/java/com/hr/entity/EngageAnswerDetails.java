package com.hr.entity;

public class EngageAnswerDetails {
    private Short andId;

    private Short ansId;

    private Short subjectId;

    private String answer;

    public Short getAndId() {
        return andId;
    }

    public void setAndId(Short andId) {
        this.andId = andId;
    }

    public Short getAnsId() {
        return ansId;
    }

    public void setAnsId(Short ansId) {
        this.ansId = ansId;
    }

    public Short getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Short subjectId) {
        this.subjectId = subjectId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}