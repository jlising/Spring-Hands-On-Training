package com.trainings.commons.entities.security;

import com.trainings.commons.entities.AbstractEntity;

import javax.persistence.*;

/**
 * @author jlising - 4/6/16.
 */
@Entity
@Table(name = "permissions")
public class Permissions extends AbstractEntity {
        @Column(name = "CODE", length = 255, nullable = false)
    private String code;

    @Column(name = "DESCRIPTION", length = 255, nullable = true)
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
