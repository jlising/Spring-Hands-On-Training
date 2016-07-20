package com.trainings.jpa.dao.impl;

import com.mysema.query.jpa.impl.JPAQuery;
import com.trainings.commons.entities.Student;
import com.trainings.jpa.dao.StudentJpaDaoCustom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

import static com.trainings.commons.entities.QStudent.student;

/**
 * @author jlising - 4/8/16.
 */
//Should follow Spring naming convention StudentDaoImpl (Without word custom) implements StudentDaoCustom
//http://stackoverflow.com/questions/20777785/org-springframework-data-mapping-propertyreferenceexception-no-property-catch-f
public class StudentJpaDaoImpl implements StudentJpaDaoCustom {
    @Autowired
    EntityManager entityManager;

    public List<Student> getAll() {
        JPAQuery jpaQuery = new JPAQuery(entityManager);
        List<Student> students = jpaQuery.from(student).createQuery(student).getResultList();

        return students;
    }

    public Student getStudentByStudentNo(String studentNo) {
        JPAQuery jpaQuery = new JPAQuery(entityManager);

        Student stud = (Student) jpaQuery.from(student).where(student.student_no.eq(studentNo)).createQuery(student).getSingleResult();

        return stud;
    }
}
