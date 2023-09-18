package com.jwt.example.jwtexample3.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

import com.jwt.example.jwtexample3.models.User;
import com.jwt.example.jwtexample3.services.UserService;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = userService.getUser();
        model.addAttribute("users", users);
        return "home";
    }

    @GetMapping("/current-users")
    public String getLoggedInUser(Model model, Principal principal) {
        model.addAttribute("currentUser", principal.getName());
        return "home";
    }
}
