package br.com.invillia.plataformacursoapi.domain.controller;

import br.com.invillia.plataformacursoapi.domain.dto.UserDto;
import br.com.invillia.plataformacursoapi.domain.model.User;
import br.com.invillia.plataformacursoapi.domain.repository.UserRepository;
import br.com.invillia.plataformacursoapi.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    @GetMapping
    public List<UserDto> listar() {
        if (userRepository.findAll().isEmpty()) {
            return (List<UserDto>) ResponseEntity.noContent();
        }
        List<UserDto> listDto = new ArrayList<>();
        for(User user:userRepository.findAll()){
            listDto.add(new UserDto(user));
        }
        return listDto;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }






}
