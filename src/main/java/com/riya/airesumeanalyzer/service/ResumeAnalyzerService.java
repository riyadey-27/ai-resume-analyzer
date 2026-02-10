package com.riya.airesumeanalyzer.service;

import org.springframework.stereotype.Service;

@Service
public class ResumeAnalyzerService {

    public String analyzeResume(String resumeText, String jobDescription) {
        return "Skill Match: 75%\n"
             + "Missing Skills: Spring Security, Docker\n"
             + "Suggestions: Improve backend project exposure.";
    }
}

