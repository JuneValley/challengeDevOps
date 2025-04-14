package com.challengeDevOps.challengeDevOps.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.challengeDevOps.challengeDevOps.Services.QuestionService;
import com.challengeDevOps.challengeDevOps.models.Question;

public class QuestionController {
	private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    
    @PostMapping
    public Question create(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }
}
