package com.junioroffers.domain.offer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Configuration
public class OfferFacadeConfiguration {

    @Bean
    OfferFacade offerFacade(OfferFetchable offerFetchable, OfferRepository offerRepository){
        OfferService offerService = new OfferService(offerFetchable, offerRepository);
        return new OfferFacade(offerRepository, offerService);
    }
}
