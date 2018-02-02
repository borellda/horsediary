package main.java.horsediary.controllers;

import horsediary.model.AbstractEvent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @RequestMapping("/events")
    public AbstractEvent greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new AbstractEvent();
    }
}
