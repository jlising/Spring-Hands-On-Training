package com.trainings.jpa;

import com.trainings.commons.config.CommonDaoConfig;
import com.trainings.commons.config.WebMvcConfig;
import com.trainings.commons.entities.Student;
import com.trainings.jpa.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author jlising - 4/8/16.
 */
@WebAppConfiguration
@ContextConfiguration(classes = {WebMvcConfig.class, CommonDaoConfig.class}, loader = AnnotationConfigWebContextLoader.class)
public class TestStudent extends AbstractJUnit4SpringContextTests {

    @Autowired
    StudentService studentService;

    @Test
    public void testGetAll(){
        List<Student> students = studentService.getAll();
        //Assert.assertTrue(student.getStudent_no().equals("12345"));
    }

    @Test
    public void getStudentByStudentNo(){
        Student student = studentService.getStudentByStudentNo("12345");
    }
}
