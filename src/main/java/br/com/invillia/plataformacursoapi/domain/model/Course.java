package br.com.invillia.plataformacursoapi.domain.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "user")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    private Category category;

    @Column(name = "number_of_lessons", nullable = false)
    private Integer number_of_lessons;

    @Column(name = "workload", nullable = false)
    private Double workload;

    @Column(name = "description", nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "has_certificate", nullable = false)
    private boolean has_certificate = false;

    @Column(name = "evaluation", nullable = false)
    private Double evaluation;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @OneToMany(mappedBy = "course")
    private List<CourseLesson> courseLesson;

    @ManyToOne
    private User user;

    public List<CourseLesson> getCourseLesson() {
        return courseLesson;
    }

    public void setCourseLesson(List<CourseLesson> courseLesson) {
        this.courseLesson = courseLesson;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getNumber_of_lessons() {
        return number_of_lessons;
    }

    public void setNumber_of_lessons(Integer number_of_lessons) {
        this.number_of_lessons = number_of_lessons;
    }

    public Double getWorkload() {
        return workload;
    }

    public void setWorkload(Double workload) {
        this.workload = workload;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isHas_certificate() {
        return has_certificate;
    }

    public void setHas_certificate(boolean has_certificate) {
        this.has_certificate = has_certificate;
    }

    public Double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Double evaluation) {
        this.evaluation = evaluation;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
