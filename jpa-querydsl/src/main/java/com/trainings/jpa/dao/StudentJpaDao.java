package com.trainings.jpa.dao;

import com.trainings.commons.dao.BaseJpaDao;
import com.trainings.commons.entities.Student;

/**
 * @author jlising - 4/8/16.
 */
public interface StudentJpaDao extends BaseJpaDao<Student, String>, StudentJpaDaoCustom {
}
