package br.edu.utfpr.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/todo")
@SecurityRequirement(name = "Authorization")
@Tag(name = "Todo", description = "Todo resource endpoints.")
public class TodoController {

    @GetMapping
    public String hello() {
        return "Hello Todo";
    }
}
