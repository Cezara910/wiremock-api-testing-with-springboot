package org.example.service;

import org.example.config.AppConfig;
import org.example.model.CreditRequest;
import org.example.model.CreditResponse;
import org.example.model.CreditResponseBuilder;
import org.example.model.CreditScoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class CreditService {
    private final WebClient webClient;

    @Autowired
    public CreditService(WebClient.Builder webClientBuilder, AppConfig config) {
        this.webClient = webClientBuilder
//                .baseUrl("http://credit-score-service:8080")
                .baseUrl(config.getCreditScoreServiceUrl())
                .build();
    }

    public Mono<CreditResponse> processCreditRequest(CreditRequest request) {
        // Call the Credit Score Service
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/credit_score")
                        .queryParam("customer_id", request.getCustomerId())
                        .build())
                .retrieve().bodyToMono(CreditScoreResponse.class)
                .publishOn(Schedulers.boundedElastic())
                .map(response -> {
                    return CreditResponseBuilder.returnResponseFor(response, request);
                });
    }
}

