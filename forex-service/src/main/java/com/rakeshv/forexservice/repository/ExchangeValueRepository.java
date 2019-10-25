package com.rakeshv.forexservice.repository;

import com.rakeshv.forexservice.models.ExchangeValue;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ExchangeValueRepository
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByCurrencyFromAndCurrencyTo(String from, String to);
    
}