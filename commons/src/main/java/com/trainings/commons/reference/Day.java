package com.trainings.commons.reference;

/**
 * @author jlising - 4/8/16.
 */
public enum Day {
    SUNDAY(7),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    private int dayNo;

    Day(int dayNo) {
        this.dayNo = dayNo;
    }
}
