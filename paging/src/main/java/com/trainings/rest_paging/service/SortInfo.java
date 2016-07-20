package com.trainings.rest_paging.service;

public class SortInfo {

    private String field;

    private String direction;

    public String getField() {

        return field;
    }

    public SortInfo setField(String field) {

        this.field = field;
        return this;
    }

    public String getDirection() {

        return direction;
    }

    public SortInfo setDirection(String direction) {

        this.direction = direction;
        return this;
    }
}