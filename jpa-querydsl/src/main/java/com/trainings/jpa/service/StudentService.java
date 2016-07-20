package com.trainings.jpa.service;

import com.trainings.commons.entities.Student;
import com.trainings.rest_paging.dto.StudentInfo;
import com.trainings.commons.projection.StudentProjection;
import com.trainings.rest_paging.service.PageInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author jlising - 4/8/16.
 */
public interface StudentService {
    List<Student> getAll();
    Student getStudentByStudentNo(String studentNo);
    PageInfo<StudentInfo> getAll(Pageable pageable);

    Page<StudentInfo> disaplaySpecificColumnUsingConstructorExpression(Pageable pageable);
    Page<StudentProjection> disaplaySpecificColumnUsingQueryProjection(Pageable pageable);
}
