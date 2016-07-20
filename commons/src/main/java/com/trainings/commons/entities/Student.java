package com.trainings.commons.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jlising - 4/8/16.
 */
@Entity
@Table(name = "student")
public class Student extends AbstractEntity{

    @Column(name = "STUDENT_NO", nullable = false, unique = true)
    private String student_no;

    @Column(name = "FIRST_NAME", nullable = false)
    private String first_name;

    @Column(name = "MIDDLE_NAME")
    private String middle_name;

    @Column(name = "LAST_NAME", nullable = false)
    private String last_name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_courses",
               inverseJoinColumns = @JoinColumn(name = "COURSE_ID"),
               joinColumns = @JoinColumn(name = "STUDENT_ID"))
    Set<Course> courses = new HashSet<Course>(0);

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
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

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
