package edu.aws.exrt.controller;

import edu.aws.exrt.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @author Ilya Y. Ivanov
 */
@Controller
@RequestMapping("/exchange-rates")
public class ExchangeRateController {

    @Autowired
    private ExchangeRateRepository exchangeRates;

    @RequestMapping(method = RequestMethod.GET)
    public String getExchangeRates(Map<String, Object> model) {
        model.put("exchangeRates", exchangeRates.findAll());
        return "exchange-rate/exchange-rates-list";
    }
}
