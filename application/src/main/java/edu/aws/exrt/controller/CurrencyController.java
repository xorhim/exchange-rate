package edu.aws.exrt.controller;

import edu.aws.exrt.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @authro Ilya Y. Ivanov
 */
@Controller
@RequestMapping("/currencies")
public class CurrencyController {

    @Autowired
    CurrencyRepository currencies;

    @RequestMapping(method = RequestMethod.GET)
    public String getCurrencies(Map<String, Object> model) {
        model.put("currencies", currencies.findAll());
        return "currency/currencies-list";
    }
}
