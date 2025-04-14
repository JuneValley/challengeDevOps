package com.challengeDevOps.challengeDevOps.Services;

import com.challengeDevOps.challengeDevOps.Repositories.QuizRepository;
import com.challengeDevOps.challengeDevOps.models.Quiz;

public class QuizService {
	private final QuizRepository quizRepository;

	public QuizService(QuizRepository quizRepository) {
		this.quizRepository = quizRepository;
	}
	
	public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }
}
