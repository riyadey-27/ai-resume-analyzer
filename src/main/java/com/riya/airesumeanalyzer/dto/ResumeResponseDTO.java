package com.riya.airesumeanalyzer.dto;

public class ResumeResponseDTO {

    private String analysisResult;

    public ResumeResponseDTO(String analysisResult) {
        this.analysisResult = analysisResult;
    }

    public String getAnalysisResult() {
        return analysisResult;
    }
}
