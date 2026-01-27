package se.jensen.charitha.meetspaceserver.controller;

import jakarta.annotation.security.PermitAll;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PermitAll
    @PostMapping()
    public void addUser() { }
}
