package org.example.model;

import lombok.Data;

@Data
public class CreditResponse {
    private String status;
    private String customerId;
    private int loanAmount;
    private String reason;

    public CreditResponse(String status, String customerId, int loanAmount) {
        this.status = status;
        this.customerId = customerId;
        this.loanAmount = loanAmount;
    }

    public CreditResponse(String status, String customerId, int loanAmount, String reason) {
        this.status = status;
        this.customerId = customerId;
        this.loanAmount = loanAmount;
        this.reason = reason;
    }

}

