package io.kompozytywni.controller;

import io.kompozytywni.model.KompozytywniUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@RequestMapping
public interface UserApi {

    @RequestMapping(value = "/users",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<KompozytywniUser>> getUsers();

    @RequestMapping(value = "/user",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createUser(@Valid @RequestBody KompozytywniUser body);

    @RequestMapping(value = "/user/{username}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@PathVariable("username") String username);

    @RequestMapping(value = "/user/{username}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<KompozytywniUser> getUserByName(@PathVariable("username") String username);

    @RequestMapping(value = "/user/login",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> loginUser(@NotNull @Valid @RequestParam(value = "username", required = true) String username, @NotNull @Valid @RequestParam(value = "password", required = true) String password);

    @RequestMapping(value = "/user/logout",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> logoutUser();

    @RequestMapping(value = "/user/{username}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@PathVariable("username") String username, @Valid @RequestBody KompozytywniUser body);
}
