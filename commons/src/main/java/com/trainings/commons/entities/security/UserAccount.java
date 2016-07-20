package com.trainings.commons.entities.security;

import com.trainings.commons.entities.AbstractEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jlising - 4/6/16.
 */
@Entity
@Table(name = "user_account")
public class UserAccount extends AbstractEntity{
    @Column(name = "USERNAME", length = 50, unique = true, nullable = false)
    private String username;

    @Column(name = "PASSWORD", length = 255, nullable = false)
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_account_roles",
               inverseJoinColumns = @JoinColumn(name = "ROLES_ID"),
               joinColumns = @JoinColumn(name = "USER_ACCOUNT_ID"))
    private Set<Roles> roles = new HashSet<Roles>(0);

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }
}
