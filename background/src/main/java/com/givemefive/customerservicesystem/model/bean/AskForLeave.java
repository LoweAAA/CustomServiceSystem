package com.givemefive.customerservicesystem.model.bean;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ask_for_leave", schema = "CustomerSurvice", catalog = "")
public class AskForLeave {
    private int id;
    private String csName;
    private Date aflTime;
    private String note;
    private String result;
    private String review;

    public AskForLeave() {
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cs_name", nullable = false, length = 255)
    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    @Basic
    @Column(name = "afl_time", nullable = false)
    public Date getAflTime() {
        return aflTime;
    }

    public void setAflTime(Date aflTime) {
        this.aflTime = aflTime;
    }

    @Basic
    @Column(name = "note", nullable = false, length = 255)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "result", nullable = true, length = 255)
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "review", nullable = true, length = 255)
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }


    public AskForLeave(String csName,Date date,String note){
        this.csName = csName;
        this.aflTime = date;
        this.note = note;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AskForLeave that = (AskForLeave) o;

        if (id != that.id) return false;
        if (csName != null ? !csName.equals(that.csName) : that.csName != null) return false;
        if (aflTime != null ? !aflTime.equals(that.aflTime) : that.aflTime != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (review != null ? !review.equals(that.review) : that.review != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id;
        result1 = 31 * result1 + (csName != null ? csName.hashCode() : 0);
        result1 = 31 * result1 + (aflTime != null ? aflTime.hashCode() : 0);
        result1 = 31 * result1 + (note != null ? note.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (review != null ? review.hashCode() : 0);
        return result1;
    }
}
