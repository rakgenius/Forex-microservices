package com.rakeshv.forexservice.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ExchangeValue
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValue {
    @Id
    private Long id;
    @Column(name = "currency_from")
    private String currencyFrom;
    @Column(name = "currency_to")
    private String currencyTo;
    private BigDecimal conversionMultiple;
    private int port;
    
}