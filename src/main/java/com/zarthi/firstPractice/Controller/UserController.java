package com.zarthi.firstPractice.Controller;

import com.zarthi.firstPractice.Entity.User;
import com.zarthi.firstPractice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get-user")
    public List<User> getAllUser()
    {
        return userService.getAllUsers();
    }

    @PostMapping("/save-user")
    public User createUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
}
