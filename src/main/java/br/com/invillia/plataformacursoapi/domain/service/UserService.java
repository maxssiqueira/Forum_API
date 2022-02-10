package br.com.invillia.plataformacursoapi.domain.service;

import br.com.invillia.plataformacursoapi.domain.controller.dto.UserDto;
import br.com.invillia.plataformacursoapi.domain.controller.form.UpdateUserForm;
import br.com.invillia.plataformacursoapi.domain.model.User;
import br.com.invillia.plataformacursoapi.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        User userExist = userRepository.findByEmail(user.getEmail());
        if(userExist != null && userRepository.equals(user)){
            throw new BusinessException("there is already a user with that email");
        }
        return userRepository.save(user);
    }
    public ResponseEntity searchAllUsers(){
        if (userRepository.findAll().isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        List<UserDto> listDto = new ArrayList<>();
        for(User user:userRepository.findAll()){
            listDto.add(new UserDto(user));
        }
        return ResponseEntity.ok(listDto);
    }

    public ResponseEntity updateUser(Long id, UpdateUserForm form){
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()){
            User user = form.update(id, userRepository);
            return ResponseEntity.ok(new UserDto(user));
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity removeUser(Long id){Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()){
            userRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();

    }


}
