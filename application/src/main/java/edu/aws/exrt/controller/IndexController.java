package edu.aws.exrt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ilya Y. Ivanov
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(path = "index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "redirect:index";
    }
}
