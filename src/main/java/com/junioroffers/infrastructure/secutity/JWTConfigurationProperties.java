package com.junioroffers.infrastructure.secutity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties("auth.jwt")
public record JWTConfigurationProperties (
        String secret,
        long expirationDays,
        String issuer
){
}
