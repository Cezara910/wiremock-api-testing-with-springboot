package org.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ConfigurationProperties(prefix = "services")
@Primary
public class AppConfig {
    private String creditScoreServiceUrl;

    public String getCreditScoreServiceUrl() {
        return creditScoreServiceUrl;
    }

    public void setCreditScoreServiceUrl(String creditScoreServiceUrl) {
        this.creditScoreServiceUrl = creditScoreServiceUrl;
    }
}
