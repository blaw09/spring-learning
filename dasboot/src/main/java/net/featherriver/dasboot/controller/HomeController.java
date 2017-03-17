package net.featherriver.dasboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Brad on 3/16/2017.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
