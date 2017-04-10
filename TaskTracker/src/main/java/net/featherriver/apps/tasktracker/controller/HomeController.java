package net.featherriver.apps.tasktracker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lawb2 on 4/7/2017.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Task Tracker ready to go";
    }
}
