package br.com.invillia.plataformacursoapi.domain.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "course_lesson")
public class CourseLesson {

    @Id
    @Column(name = "course_lesson_id")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "duration", nullable = false)
    private Double duration;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @ManyToOne
    private Course course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
