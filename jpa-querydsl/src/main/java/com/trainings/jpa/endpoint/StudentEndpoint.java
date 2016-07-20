package com.trainings.jpa.endpoint;

import com.trainings.commons.entities.Student;
import com.trainings.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * @author jlising - 4/11/16.
 */
@MessageEndpoint
public class StudentEndpoint {

    @Autowired
    StudentService studentService;

    @ServiceActivator(inputChannel = "getStudentChannel", requiresReply = "true")
    public Student getStudentByStudentNo(String studentNo){
        return studentService.getStudentByStudentNo(studentNo);
    }
}
