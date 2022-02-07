package br.com.invillia.plataformacursoapi.domain.dto;

import br.com.invillia.plataformacursoapi.domain.model.User;

public class UserDto {
    private String first_name;
    private String last_name;
    private String email;


    public UserDto(User user) {
        this.first_name = user.getFirst_name();
        this.last_name = user.getLast_name();
        this.email = user.getEmail();
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }
}
