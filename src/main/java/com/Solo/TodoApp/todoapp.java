package com.Solo.TodoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoapp {
    @GetMapping("/")
    public String getToDoApp() {
        return "To-do Application!";
    }
}
