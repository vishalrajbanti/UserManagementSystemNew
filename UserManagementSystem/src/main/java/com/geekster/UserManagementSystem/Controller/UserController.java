package com.geekster.UserManagementSystem.Controller;

import com.geekster.UserManagementSystem.Model.User;
import com.geekster.UserManagementSystem.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    // add a user
    @PostMapping("user")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    // get a user by id
    @GetMapping("user/id/userid/{Id}")
    public User getUser(@PathVariable Long Id) {
        return userService.getUser(Id);
    }

    // get all user
    @GetMapping("users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    //update username by usind userId
    @PutMapping("user/id/{id}")
    public User updateUserInfo(@PathVariable Long id, @RequestBody @Valid User myUser){
        return userService.updateUserInfo(id,myUser);
    }

    // delete all user
    @DeleteMapping("users")
    public String deleteUsers() {
        return userService.deleteUsers();
    }
}