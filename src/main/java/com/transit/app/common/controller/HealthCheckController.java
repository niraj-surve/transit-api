package com.transit.app.common.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/health-check")
@Tag(name="Health Check API (Public)", description = "Endpoint for checking the health of transit api")
public class HealthCheckController {

    @GetMapping
    @Operation(summary = "Health Check", description = "Returns OK if the api is active.")
    public String healthCheck(){
        log.info("Health Check - OK");
        return "OK";
    }
}
