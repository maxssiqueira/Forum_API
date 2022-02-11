package br.com.invillia.plataformacursoapi.domain.service;

import br.com.invillia.plataformacursoapi.domain.controller.dto.CourseDto;
import br.com.invillia.plataformacursoapi.domain.model.Course;
import br.com.invillia.plataformacursoapi.domain.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public ResponseEntity searchAllCourses(){

        List<Course> query = courseRepository.findAll();
       if (query.isEmpty()){
           return ResponseEntity.noContent().build();
       }
        List<CourseDto> listDto = new ArrayList<>();
       for(Course course:query){
           listDto.add(new CourseDto(course));
       }
       return ResponseEntity.ok(listDto);
    }
 }
