package com.trainings.commons.entities.security;

import com.trainings.commons.entities.AbstractEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jlising - 4/6/16.
 */
@Entity
@Table(name = "business_objects")
public class BusinessObjects extends AbstractEntity {

    @Column(name = "CODE", length = 255, nullable = false)
    private String code;

    @Column(name = "DESCRIPTION", length = 255, nullable = true)
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "business_objects_permissions",
            inverseJoinColumns = @JoinColumn(name = "PERMISSIONS_ID"),
            joinColumns = @JoinColumn(name = "BUSINESS_OBJECTS_ID"))
    private Set<Permissions> permissions = new HashSet<Permissions>(0);

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

    public Set<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permissions> permissions) {
        this.permissions = permissions;
    }
}
