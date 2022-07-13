package io.mkth.controller;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.mkth.model.MimicResponse;
import io.mkth.service.MimicService;
import jakarta.inject.Inject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MimicController {

    @Inject
    private MimicService httpResponseService;

    @Produces
    @Get("/anything")
    public MimicResponse mimic(HttpHeaders headers,
                               HttpServletRequest request,
                               HttpServletResponse response) {

        return httpResponseService.mimic(request, headers);
    }
}
