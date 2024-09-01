package com.junioroffers.domain.offer.dto;

import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Builder
@Document
public record OfferResponseDto(
        String id,
        String companyName,
        String position,
        String salary,
        String offerUrl
) implements Serializable {
}