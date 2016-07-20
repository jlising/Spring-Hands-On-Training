package com.trainings.integration.gateway;

import com.trainings.commons.entities.Student;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * Created by jlising on 1/26/16.
 */
@MessagingGateway
public interface StudentGateway {

    @Gateway(requestChannel = "getStudentChannel")
    Student getStudentByStudentNo(String studentNo);
}
