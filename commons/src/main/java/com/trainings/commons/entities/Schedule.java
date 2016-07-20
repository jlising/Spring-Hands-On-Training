package com.trainings.commons.entities;

import com.trainings.commons.reference.Day;

import javax.persistence.*;
import java.util.Date;

/**
 * @author jlising - 4/8/16.
 */
@Entity
@Table(name = "schedule")
public class Schedule extends AbstractEntity{
    @Column(name = "DAY")
    private Day day;

    @Temporal(TemporalType.TIME)
    @Column(name = "TIME_FROM")
    private Date time_from;

    @Temporal(TemporalType.TIME)
    @Column(name = "TIME_TO")
    private Date to;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ROOM_ID")
    private Room room;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SUBJECT_ID")
    private Subject subject;

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getTime_from() {
        return time_from;
    }

    public void setTime_from(Date time_from) {
        this.time_from = time_from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
