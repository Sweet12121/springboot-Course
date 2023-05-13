package com.springboot.springbootCourse.UsersAPP;


import com.springboot.springbootCourse.Exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService service;
    public UserController(UserDaoService service){
        this.service = service;
    }
 //GET /Users
    @GetMapping("/users")
    public List<User> retriveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retriveAllUsers(@PathVariable int id){
        User user = service.findOne(id);

        if(user==null)
            throw new UserNotFoundException("id:" +id);
        return user;
    }

    //POST/User

    @PostMapping("/users")

    public ResponseEntity<User> createUser(@Valid @RequestBody User user){

      User savedUser =service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    // Delete/users

    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable int id){
        service.deleteById(id);
     return (User) ResponseEntity.status(HttpStatus.OK);
    }
}
