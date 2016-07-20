package com.trainings.rest.controller;

import com.trainings.commons.entities.Student;
import com.trainings.integration.gateway.StudentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by jlising on 1/25/16.
 */
@RestController
@RequestMapping(value = "integration/", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class TestIntegrationController {
    @Autowired
    StudentGateway studentGateway;

    @RequestMapping(value = "student/{studentNo}", method = GET)
    public Student getStudentByStudentNo(@PathVariable String studentNo){
        return studentGateway.getStudentByStudentNo(studentNo);
    }
}
