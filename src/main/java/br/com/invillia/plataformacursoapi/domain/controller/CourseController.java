package br.com.invillia.plataformacursoapi.domain.controller;

import br.com.invillia.plataformacursoapi.domain.repository.CourseRepository;
import br.com.invillia.plataformacursoapi.domain.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseService courseService;

    public ResponseEntity getAllCourses(){
        return courseService.searchAllCourses();
    }

}
