package br.com.invillia.plataformacursoapi.domain.service;

import br.com.invillia.plataformacursoapi.domain.model.User;
import br.com.invillia.plataformacursoapi.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
