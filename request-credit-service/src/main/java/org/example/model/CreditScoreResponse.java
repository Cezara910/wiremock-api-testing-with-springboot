package org.example.model;

import lombok.Data;

@Data
public class CreditScoreResponse {
    private String customerId;
    private int creditScore;

}
