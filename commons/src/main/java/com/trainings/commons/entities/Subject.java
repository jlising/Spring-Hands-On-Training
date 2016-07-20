package com.trainings.commons.entities;

import javax.persistence.*;

/**
 * @author jlising - 4/8/16.
 */
@Entity
@Table(name = "subject")
public class Subject extends AbstractEntity{

    @Column(name = "SUBJECT_CODE", unique = true)
    private String subject_code;

    @Column(name = "MAJOR")
    private Boolean major = true;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "COURSE_ID")
    private Course course;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isMajor() {
        return major;
    }

    public void setMajor(Boolean major) {
        this.major = major;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
