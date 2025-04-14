package com.challengeDevOps.challengeDevOps.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challengeDevOps.challengeDevOps.models.Response;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {}