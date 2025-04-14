package com.challengeDevOps.challengeDevOps.Services;

import com.challengeDevOps.challengeDevOps.Repositories.ResponseRepository;
import com.challengeDevOps.challengeDevOps.models.Response;

public class ResponseService {
	private final ResponseRepository responseRepository;

	public ResponseService(ResponseRepository responseRepository) {
		this.responseRepository = responseRepository;
	}
	
	public Response saveResponse(Response response) {
        return responseRepository.save(response);
    }
}
