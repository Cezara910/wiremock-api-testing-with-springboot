package org.example.controller;

import org.example.model.CreditRequest;
import org.example.model.CreditResponse;
import org.example.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

@RestController
@EnableAutoConfiguration
@RequestMapping("/request-credit")
public class CreditRequestController {

    @Autowired
    private CreditService creditService;

    @PostMapping
    public Mono<ResponseEntity<CreditResponse>> requestCredit(@RequestBody CreditRequest request) {
        Mono<CreditResponse> responseMono = creditService.processCreditRequest(request);
        return responseMono.map(ResponseEntity::ok);
    }
}
