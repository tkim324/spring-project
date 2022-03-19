package de.lernen.springboot.controllers;

import de.lernen.springboot.models.User;
import de.lernen.springboot.services.IService;
import de.lernen.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final IService<User> service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping(path = "/users", consumes = "application/json")
    private void create(User user){
        service.create(user);
    }

    @GetMapping(path ="/users", produces = "application/json")
    private List<User> getAllUsers() {
        return service.getAll();
    }

}
