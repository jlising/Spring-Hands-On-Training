package com.trainings.rest_paging.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jlising - 4/8/16.
 */
public class StudentInfo{
    private String id;
    private String student_no;
    private String first_name;
    private String middle_name;
    private String last_name;

    private AddressInfo address;
    Set<CourseInfo> courses = new HashSet<CourseInfo>(0);

    public AddressInfo getAddress() {
        return address;
    }

    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    public Set<CourseInfo> getCourses() {
        return courses;
    }

    public void setCourses(Set<CourseInfo> courses) {
        this.courses = courses;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getStudent_no() {
        return student_no;
    }

    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }

    //Constructor for ConstructExpression.create
    public StudentInfo(String id) {
        this.id = id;
    }
}
