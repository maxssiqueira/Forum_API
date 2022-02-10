package br.com.invillia.plataformacursoapi.domain.controller;

import br.com.invillia.plataformacursoapi.domain.controller.dto.UserDto;
import br.com.invillia.plataformacursoapi.domain.controller.form.UpdateUserForm;
import br.com.invillia.plataformacursoapi.domain.model.User;
import br.com.invillia.plataformacursoapi.domain.repository.UserRepository;
import br.com.invillia.plataformacursoapi.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return userService.searchAllUsers();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<?> putUser(@PathVariable Long id, @RequestBody @Valid UpdateUserForm form){
        return userService.updateUser(id, form);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> deleteUser (@PathVariable Long id){
       return userService.removeUser(id);
    }
}
