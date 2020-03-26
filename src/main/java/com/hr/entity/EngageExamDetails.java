package com.hr.entity;

public class EngageExamDetails {
    private Short exdId;

    private String examNumber;

    private Short secondKindId;

    private Short questionAmount;

    public Short getExdId() {
        return exdId;
    }

    public void setExdId(Short exdId) {
        this.exdId = exdId;
    }

    public String getExamNumber() {
        return examNumber;
    }

    public void setExamNumber(String examNumber) {
        this.examNumber = examNumber == null ? null : examNumber.trim();
    }

    public Short getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(Short secondKindId) {
        this.secondKindId = secondKindId;
    }

    public Short getQuestionAmount() {
        return questionAmount;
    }

    public void setQuestionAmount(Short questionAmount) {
        this.questionAmount = questionAmount;
    }
}