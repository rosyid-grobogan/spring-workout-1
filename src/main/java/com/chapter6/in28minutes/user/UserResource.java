package com.chapter6.in28minutes.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;

    //GET /users
    // retrieveAllUsers()
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // GET /users/{id}
    //retrieveUser(int id)
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){

            User user = service.findOne(id);
            if(user == null){
                throw new UserNotFoundException("id :"+ id);
            }

            return user;
    }

    // input - details of user
    // output - CREATED & Return the created URI
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);
        // CREATED
        // /users/4   savedUser.getId()
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand( savedUser.getId() ).toUri();

        return ResponseEntity.created(location).build();

    }

    @DeleteMapping("/users/{id}")
    public User deleteById(@PathVariable int id){

        User user = service.deleteById(id);
        if(user == null){
            throw new UserNotFoundException("id :"+ id);
        }

        return user;
    }
}
