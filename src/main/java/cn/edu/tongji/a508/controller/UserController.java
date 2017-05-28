package cn.edu.tongji.a508.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mark on 5/27/17.
 */
@RestController
public class UserController {

    /* Maps to all HTTP actions by default (GET,POST,..)*/
    @RequestMapping("/users")
    public @ResponseBody
    String getUsers() {
        return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"}," +
                "{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}";
    }
}
