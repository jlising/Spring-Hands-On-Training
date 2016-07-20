package com.trainings.rest.controller;

import com.trainings.commons.projection.StudentProjection;
import com.trainings.jpa.service.StudentService;
import com.trainings.rest_paging.dto.StudentInfo;
import com.trainings.rest_paging.service.MapperUtil;
import com.trainings.rest_paging.service.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jlising - 4/13/16.
 */
@RestController
@RequestMapping(value = "paging/", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class TestPagingController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public StudentInfo getStudent(@RequestParam String studentNo, Pageable pageable) {
        return MapperUtil.mapDTO(studentService.getStudentByStudentNo(studentNo), StudentInfo.class);
    }

    @RequestMapping(value = "/student/all", method = RequestMethod.GET)
    public PageInfo<StudentInfo> getAll(Pageable pageable){
        return studentService.getAll(pageable);
    }

    @RequestMapping(value = "/student/constructor-expression", method = RequestMethod.GET)
    public Page<StudentInfo> disaplaySpecificColumnUsingConstructorExpression(Pageable pageable){
        return studentService.disaplaySpecificColumnUsingConstructorExpression(pageable);
    }

    @RequestMapping(value = "/student/query-projection", method = RequestMethod.GET)
    public Page<StudentProjection> disaplaySpecificColumnUsingQueryProjection(Pageable pageable){
        return studentService.disaplaySpecificColumnUsingQueryProjection(pageable);
    }
}
