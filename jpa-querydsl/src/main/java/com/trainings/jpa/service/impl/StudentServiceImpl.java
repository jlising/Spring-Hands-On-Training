package com.trainings.jpa.service.impl;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.ConstructorExpression;
import com.trainings.commons.entities.Student;
import com.trainings.commons.projection.QStudentProjection;
import com.trainings.jpa.dao.StudentJpaDao;
import com.trainings.jpa.service.StudentService;
import com.trainings.rest_paging.dto.StudentInfo;
import com.trainings.commons.projection.StudentProjection;
import com.trainings.rest_paging.service.MappableService;
import com.trainings.rest_paging.service.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

import static com.trainings.commons.entities.QStudent.student;

/**
 * @author jlising - 4/8/16.
 */
@Service
public class StudentServiceImpl extends MappableService<StudentInfo, Student> implements StudentService{
    @Autowired
    StudentJpaDao studentDao;

    @Autowired
    EntityManager entityManager;

    public List<Student> getAll() {
        return studentDao.getAll();
    }

    public Student getStudentByStudentNo(String studentNo){
        return studentDao.getStudentByStudentNo(studentNo);
    }

    public PageInfo<StudentInfo> getAll(Pageable pageable){
        JPAQuery jpaQuery = new JPAQuery(entityManager);

        JPAQuery countQuery = jpaQuery.clone(entityManager);
        Long count = countQuery.from(student).count();


        List<Student> students = jpaQuery.from(student)
                                         .offset(pageable.getOffset())
                                         .limit(pageable.getPageSize())
                                         .createQuery(student).getResultList();


        return toPageInfo(new PageImpl<Student>(students, new PageRequest(pageable.getPageNumber(), pageable.getPageSize(), pageable.getSort()), count));
    }

    public Page<StudentInfo> disaplaySpecificColumnUsingConstructorExpression(Pageable pageable) {
        JPAQuery jpaQuery = new JPAQuery(entityManager);

        JPAQuery countQuery = jpaQuery.clone(entityManager);
        Long count = countQuery.from(student).count();

        List<StudentInfo> students = jpaQuery.from(student)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .list(ConstructorExpression.create(StudentInfo.class, student.id));


        return new PageImpl<StudentInfo>(students, new PageRequest(pageable.getPageNumber(), pageable.getPageSize(), pageable.getSort()), count);
    }

    public Page<StudentProjection> disaplaySpecificColumnUsingQueryProjection(Pageable pageable) {
        JPAQuery jpaQuery = new JPAQuery(entityManager);

        JPAQuery countQuery = jpaQuery.clone(entityManager);
        Long count = countQuery.from(student).count();

        List<StudentProjection> students = jpaQuery.from(student)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .list(new QStudentProjection(student.id, student.last_name ,student.student_no));


        return new PageImpl<StudentProjection>(students, new PageRequest(pageable.getPageNumber(), pageable.getPageSize(), pageable.getSort()), count);
    }
}