package com.challengeDevOps.challengeDevOps.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.challengeDevOps.challengeDevOps.Services.QuizService;
import com.challengeDevOps.challengeDevOps.models.Quiz;

public class QuizController {
	private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
    
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz) {
        return quizService.saveQuiz(quiz);
    }
}
