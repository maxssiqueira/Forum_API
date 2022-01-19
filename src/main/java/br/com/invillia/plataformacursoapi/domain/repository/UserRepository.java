package br.com.invillia.plataformacursoapi.domain.repository;

import br.com.invillia.plataformacursoapi.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
