package com.trainings.commons.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jlising - 4/8/16.
 */
@Entity
@Table(name = "course")
public class Course extends AbstractEntity{

    @Column(name = "COURSE_CODE", nullable = false)
    private String course_code;

    @Column(name = "DEGREE")
    private Boolean degree = true;

    @Column(name = "DESCRIPTION")
    private String description;

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public Boolean isDegree() {
        return degree;
    }

    public void setDegree(Boolean degree) {
        this.degree = degree;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
