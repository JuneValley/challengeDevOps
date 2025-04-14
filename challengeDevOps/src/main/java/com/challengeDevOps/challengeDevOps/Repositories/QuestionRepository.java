package com.challengeDevOps.challengeDevOps.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challengeDevOps.challengeDevOps.models.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {}