package com.trainings.jaxb;

import com.trainings.jaxb.config.JaxbConfig;
import com.trainings.jaxb.dto.Contact;
import com.trainings.jaxb.dto.Employee;
import com.trainings.jaxb.processor.Processor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jlising - 4/8/16.
 */

@WebAppConfiguration
@ContextConfiguration(classes = {
        JaxbConfig.class}, loader = AnnotationConfigWebContextLoader.class)
public class TestJaxb extends AbstractJUnit4SpringContextTests {

    @Autowired
    Processor processor;

    @Test
    public void testProcessor(){
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Jess Lising");
        emp.setSalary(100);

        List<Contact> contacts = new ArrayList<Contact>();

        contacts.add(new Contact(1, "One"));
        contacts.add(new Contact(2, "Two"));
        emp.setContact(contacts);

        try {
            processor.convertFromObjectToXML(emp, "Employee.xml");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
