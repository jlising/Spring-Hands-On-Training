package com.trainings.commons.entities;

import com.trainings.commons.reference.RoomType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jlising - 4/8/16.
 */
@Entity
@Table(name = "room")
public class Room extends AbstractEntity{
    @Column(name = "ROOM_NO", nullable = false)
    private String room_no;

    @Column(name = "PAX", nullable = false)
    private int pax;

    @Column(name = "TYPE", nullable = false)
    private RoomType type;

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }
}
