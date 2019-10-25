package com.rakeshv.forexservice.controllers;

import com.rakeshv.forexservice.models.ExchangeValue;
import com.rakeshv.forexservice.repository.ExchangeValueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * ForexController
 */
@RestController
@Slf4j
public class ForexController {
    @Autowired
    private Environment environment;
    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) {
        ExchangeValue exchangeValue = repository.findByCurrencyFromAndCurrencyTo(from, to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;
    }
}