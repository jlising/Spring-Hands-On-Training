package com.trainings.rest_paging.dto;

/**
 * @author jlising - 4/8/16.
 */
public class CourseInfo{
    private String id;
    private String course_code;
    private Boolean degree = true;
    private String description;

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public Boolean getDegree() {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
