package com.challengeDevOps.challengeDevOps.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.challengeDevOps.challengeDevOps.Services.ResponseService;
import com.challengeDevOps.challengeDevOps.models.Response;

public class ResponseController {
	private final ResponseService responseService;

    public ResponseController(ResponseService responseService) {
        this.responseService = responseService;
    }
    
    @PostMapping
    public Response create(@RequestBody Response response) {
        return responseService.saveResponse(response);
    }
}
