package br.com.invillia.plataformacursoapi.domain.repository;

import br.com.invillia.plataformacursoapi.domain.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
