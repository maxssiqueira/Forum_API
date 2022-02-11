package br.com.invillia.plataformacursoapi.domain.controller.dto;

import br.com.invillia.plataformacursoapi.domain.model.Category;
import br.com.invillia.plataformacursoapi.domain.model.Course;

public class CourseDto {

    private String name;
    private Category category;
    private Integer number_of_lessons;
    private Double workload;
    private String description;

    public CourseDto(Course course) {
        this.name = course.getName();
        this.category = course.getCategory();
        this.number_of_lessons = course.getNumber_of_lessons();
        this.workload = course.getWorkload();
        this.description = course.getDescription();
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public Integer getNumber_of_lessons() {
        return number_of_lessons;
    }

    public Double getWorkload() {
        return workload;
    }
}
