package com.trainings.commons.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jlising - 4/8/16.
 */
@Entity
@Table(name = "address")
public class Address extends AbstractEntity{
    @Column(name = "ADDRESS1")
    private String address1;

    @Column(name = "ADDRESS2")
    private String address2;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ZIP")
    private String zip;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
