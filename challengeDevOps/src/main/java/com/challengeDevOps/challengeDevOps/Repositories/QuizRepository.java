package com.challengeDevOps.challengeDevOps.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challengeDevOps.challengeDevOps.models.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {}