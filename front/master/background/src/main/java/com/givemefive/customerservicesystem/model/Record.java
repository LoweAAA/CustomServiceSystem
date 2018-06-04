package com.givemefive.customerservicesystem.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="record")
public class Record {
    private String recordId;
    private String recordContent;
    private Timestamp recordTime;
    private String recordUserId;
    private String recordCsId;
    private User userByRecordUserId;
    private CustomerService customerServiceByRecordCsId;

    @Basic
    @Id
    @Column(name = "record_id", nullable = false, length = 20)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "record_content", nullable = false, length = 100)
    public String getRecordContent() {
        return recordContent;
    }

    public void setRecordContent(String recordContent) {
        this.recordContent = recordContent;
    }

    @Basic
    @Column(name = "record_time", nullable = false)
    public Timestamp getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    @Basic
    @Column(name = "record_user_id", nullable = false, length = 20,insertable = false,updatable = false)
    public String getRecordUserId() {
        return recordUserId;
    }

    public void setRecordUserId(String recordUserId) {
        this.recordUserId = recordUserId;
    }

    @Basic
    @Column(name = "record_cs_id", nullable = false, length = 20,insertable = false,updatable = false)
    public String getRecordCsId() {
        return recordCsId;
    }

    public void setRecordCsId(String recordCsId) {
        this.recordCsId = recordCsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (recordId != null ? !recordId.equals(record.recordId) : record.recordId != null) return false;
        if (recordContent != null ? !recordContent.equals(record.recordContent) : record.recordContent != null)
            return false;
        if (recordTime != null ? !recordTime.equals(record.recordTime) : record.recordTime != null) return false;
        if (recordUserId != null ? !recordUserId.equals(record.recordUserId) : record.recordUserId != null)
            return false;
        if (recordCsId != null ? !recordCsId.equals(record.recordCsId) : record.recordCsId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordId != null ? recordId.hashCode() : 0;
        result = 31 * result + (recordContent != null ? recordContent.hashCode() : 0);
        result = 31 * result + (recordTime != null ? recordTime.hashCode() : 0);
        result = 31 * result + (recordUserId != null ? recordUserId.hashCode() : 0);
        result = 31 * result + (recordCsId != null ? recordCsId.hashCode() : 0);
        return result;
    }
/*
    @ManyToOne
    @JoinColumn(name = "record_user_id", referencedColumnName = "user_id", nullable = false)
    public User getUserByRecordUserId() {
        return userByRecordUserId;
    }

    public void setUserByRecordUserId(User userByRecordUserId) {
        this.userByRecordUserId = userByRecordUserId;
    }

    @ManyToOne
    @JoinColumn(name = "record_cs_id", referencedColumnName = "cs_id", nullable = false)
    public CustomerService getCustomerServiceByRecordCsId() {
        return customerServiceByRecordCsId;
    }

    public void setCustomerServiceByRecordCsId(CustomerService customerServiceByRecordCsId) {
        this.customerServiceByRecordCsId = customerServiceByRecordCsId;
    }
    */
}
