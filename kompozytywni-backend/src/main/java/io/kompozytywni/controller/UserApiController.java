package io.kompozytywni.controller;

import io.kompozytywni.model.KompozytywniUser;
import io.kompozytywni.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserApiController implements UserApi {

    @Autowired
    private UserRepository userRepository;

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);
    private final HttpServletRequest request;

    @Autowired
    public UserApiController(HttpServletRequest request) {
        this.request = request;
    }

    public @ResponseBody ResponseEntity<List<KompozytywniUser>> getUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Void> createUser(KompozytywniUser body) {
        userRepository.save(body);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteUser(String username) {
        userRepository.deleteByUsername(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public @ResponseBody ResponseEntity<KompozytywniUser> getUserByName(String username) {
        return new ResponseEntity<>(userRepository.findByUsername(username), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUser(String username, KompozytywniUser body) {
        KompozytywniUser user = userRepository.findByUsername(username);
        user.setFirstName(body.getFirstName());
        user.setLastName(body.getLastName());
        user.setUsername(body.getUsername());
        user.setEmail(body.getEmail());
        user.setPassword(body.getPassword());
        user.setUserRole(body.getUserRole());
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<String> loginUser(String username, String password) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> logoutUser() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
