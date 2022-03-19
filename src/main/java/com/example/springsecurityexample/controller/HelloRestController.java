package com.example.springsecurityexample.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SecurityRequirement(name = "javainuseapi")

@RestController
@RequestMapping("hello")

public class HelloRestController {
    @Operation(summary = "My endpoint", security = @SecurityRequirement(name = "bearerAuth"))

    @GetMapping("user")
    public String helloUser() {
        return "Hello User";
    }

    @Operation(summary = "My endpoint", security = @SecurityRequirement(name = "bearerAuth"))
    @GetMapping("admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

}