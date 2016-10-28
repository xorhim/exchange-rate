package edu.aws.exrt.controller;

import edu.aws.exrt.entity.Currency;
import edu.aws.exrt.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @authro Ilya Y. Ivanov
 */
@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    @Autowired
    CurrencyRepository currencies;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Currency> getCurrencies() {
        return currencies.findAll();
    }
}
