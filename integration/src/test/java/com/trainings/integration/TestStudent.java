package com.trainings.integration;

import com.trainings.commons.config.CommonIntegrationConfig;
import com.trainings.commons.config.WebMvcConfig;
import com.trainings.commons.entities.Student;
import com.trainings.integration.config.IntegrationConfig;
import com.trainings.integration.gateway.StudentGateway;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
/**
 * @author jlising - 4/8/16.
 */

@WebAppConfiguration
@ContextConfiguration(classes = {
        WebMvcConfig.class,
        CommonIntegrationConfig.class,
        IntegrationConfig.class}, loader = AnnotationConfigWebContextLoader.class)
public class TestStudent extends AbstractJUnit4SpringContextTests {

    @Autowired
    StudentGateway studentGateway;

    @Test
    public void getStudentByStudentNo(){
        Student student = studentGateway.getStudentByStudentNo("12345");
    }
}
