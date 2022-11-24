package pe.edu.upe.backendllamitavet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upe.backendllamitavet.models.UserModel;
import pe.edu.upe.backendllamitavet.services.UserService;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUser(){
        return userService.getUser();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);
        if (ok){
            return "User with id: " + id + " was deleted";
        }else{
            return "Can´t delete user with id: " + id;
        }
    }

}