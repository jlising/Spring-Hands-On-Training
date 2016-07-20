package com.trainings.commons.projection;

import com.mysema.query.annotations.QueryProjection;

/**
 * @author jlising - 4/13/16.
 */
public class StudentProjection {
    private String id;
    private String studentNo;
    private String last_name;

    @QueryProjection
    public StudentProjection(String id, String last_name, String studentNo) {
        this.id = id;
        this.last_name = last_name;
        this.studentNo = studentNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
}
