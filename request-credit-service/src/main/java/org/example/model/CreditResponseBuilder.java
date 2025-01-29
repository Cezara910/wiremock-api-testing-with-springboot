package org.example.model;

public class CreditResponseBuilder {
    public static CreditResponse returnResponseFor(CreditScoreResponse scoreResponse, CreditRequest originalRequest) {
        if (scoreResponse != null && scoreResponse.getCreditScore() >= 700) {
            return new CreditResponse("Approved", originalRequest.getCustomerId(), originalRequest.getLoanAmount());
        } else {
            return new CreditResponse(
                    "Rejected",
                    originalRequest.getCustomerId(),
                    originalRequest.getLoanAmount(),
                    "Insufficient Credit Score"
            );
        }
    }
}
