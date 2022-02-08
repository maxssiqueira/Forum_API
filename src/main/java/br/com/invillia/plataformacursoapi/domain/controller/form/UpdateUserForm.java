package br.com.invillia.plataformacursoapi.domain.controller.form;

import br.com.invillia.plataformacursoapi.domain.model.User;
import br.com.invillia.plataformacursoapi.domain.repository.UserRepository;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class UpdateUserForm {
    @NotNull @NotEmpty
    private String first_name;
    @NotNull @NotEmpty
    private String last_name;
    @NotNull @NotEmpty
    private String email;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User update(Long id, UserRepository userRepository){

        User user = userRepository.getById(id);
        user.setFirst_name(this.first_name);
        user.setLast_name(this.last_name);
        user.setEmail(this.email);
        return user;

    }
}
