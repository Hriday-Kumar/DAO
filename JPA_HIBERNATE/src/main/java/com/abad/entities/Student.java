package com.abad.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Virendra on 25-06-2020.
 */
@Entity
@Table(name = "Students")
public class Student
{

    @Id
    @Column(name="RollNo")
    private int id;

    @Column(name="FirstName")
    private String firstNm;

    @Column(name="LastName")
    private String lastNm;

    @Column(name="DOB")
    private String dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstNm() {
        return firstNm;
    }

    public void setFirstNm(String firstNm) {
        this.firstNm = firstNm;
    }

    public String getLastNm() {
        return lastNm;
    }

    public void setLastNm(String lastNm) {
        this.lastNm = lastNm;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

}
