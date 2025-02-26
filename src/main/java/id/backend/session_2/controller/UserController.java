package id.backend.session_2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.backend.session_2.dto.UserPutRequestDTO;
import id.backend.session_2.dto.UserGetRequestDTO;
import id.backend.session_2.dto.UserPostRequestDTO;
import id.backend.session_2.service.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    //endpoint get user by id
    @GetMapping("/{id}")
    public UserGetRequestDTO getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    //endpoint get all user
    @GetMapping
    public List<UserGetRequestDTO> getAllUsers(){
        return userService.getAllUser();
    }

    //endpoint create new user
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserGetRequestDTO createUser(@Valid @RequestBody UserPostRequestDTO userDto){
        return userService.createUser(userDto);
    }

    //endpoint update
    @PatchMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserGetRequestDTO updateUser(@PathVariable int id, @RequestBody UserPutRequestDTO userDto){
        return userService.updateUser(id, userDto);
    }

    //endpoint delete user
    @DeleteMapping("/{id}")
    public Map<String, Object>deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
}
