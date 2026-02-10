package com.riya.airesumeanalyzer.controller;

import com.riya.airesumeanalyzer.dto.ResumeRequestDTO;
import com.riya.airesumeanalyzer.dto.ResumeResponseDTO;
import com.riya.airesumeanalyzer.service.ResumeAnalyzerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResumeAnalyzerController {

    private final ResumeAnalyzerService service;

    public ResumeAnalyzerController(ResumeAnalyzerService service) {
        this.service = service;
    }

    @PostMapping("/analyze")
    public ResumeResponseDTO analyze(@RequestBody ResumeRequestDTO request) {
        String result = service.analyzeResume(
                request.getResumeText(),
                request.getJobDescription()
        );
        return new ResumeResponseDTO(result);
    }
}
