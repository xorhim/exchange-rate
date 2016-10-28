package edu.aws.exrt.controller;

import edu.aws.exrt.entity.ExchangeRate;
import edu.aws.exrt.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ilya Y. Ivanov
 */
@Controller
@RequestMapping("/exchange-rates")
public class ExchangeRateController {

    @Autowired
    private ExchangeRateRepository exchangeRates;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<ExchangeRate> getExchangeRates() {
        final Iterable<ExchangeRate> rates = exchangeRates.findAll();
        return rates;
    }
}
