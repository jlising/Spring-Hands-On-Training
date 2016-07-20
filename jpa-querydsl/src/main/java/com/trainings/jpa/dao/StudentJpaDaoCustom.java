package com.trainings.jpa.dao;

import com.trainings.commons.entities.Student;

import java.util.List;

/**
 * @author jlising - 4/8/16.
 */
public interface StudentJpaDaoCustom {
    List<Student> getAll();
    Student getStudentByStudentNo(String studentNo);
}
