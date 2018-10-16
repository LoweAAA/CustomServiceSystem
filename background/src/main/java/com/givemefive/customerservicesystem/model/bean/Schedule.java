package com.givemefive.customerservicesystem.model.bean;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Schedule {
    private String schedule;
    private String scheduleCsId;
    private Date scheduleDate;
    private Integer schedule810;
    private Integer schedule1012;
    private Integer schedule1214;
    private Integer schedule1416;
    private Integer schedule1618;
    private Integer schedule1820;
    private Integer schedule2022;
    private Integer schedule2224;
    private Integer schedule02;
    private Integer schedule24;
    private Integer schedule46;
    private Integer schedule68;
    private CustomerService customerServiceByScheduleCsId;

    @Basic
    @Id
    @Column(name = "schedule")
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Basic
    @Column(name = "schedule_cs_id",insertable = false,updatable = false)
    public String getScheduleCsId() {
        return scheduleCsId;
    }

    public void setScheduleCsId(String scheduleCsId) {
        this.scheduleCsId = scheduleCsId;
    }

    @Basic
    @Column(name = "schedule_date")
    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    @Basic
    @Column(name = "schedule_8_10")
    public Integer getSchedule810() {
        return schedule810;
    }

    public void setSchedule810(Integer schedule810) {
        this.schedule810 = schedule810;
    }

    @Basic
    @Column(name = "schedule_10_12")
    public Integer getSchedule1012() {
        return schedule1012;
    }

    public void setSchedule1012(Integer schedule1012) {
        this.schedule1012 = schedule1012;
    }

    @Basic
    @Column(name = "schedule_12_14")
    public Integer getSchedule1214() {
        return schedule1214;
    }

    public void setSchedule1214(Integer schedule1214) {
        this.schedule1214 = schedule1214;
    }

    @Basic
    @Column(name = "schedule_14_16")
    public Integer getSchedule1416() {
        return schedule1416;
    }

    public void setSchedule1416(Integer schedule1416) {
        this.schedule1416 = schedule1416;
    }

    @Basic
    @Column(name = "schedule_16_18")
    public Integer getSchedule1618() {
        return schedule1618;
    }

    public void setSchedule1618(Integer schedule1618) {
        this.schedule1618 = schedule1618;
    }

    @Basic
    @Column(name = "schedule_18_20")
    public Integer getSchedule1820() {
        return schedule1820;
    }

    public void setSchedule1820(Integer schedule1820) {
        this.schedule1820 = schedule1820;
    }

    @Basic
    @Column(name = "schedule_20_22")
    public Integer getSchedule2022() {
        return schedule2022;
    }

    public void setSchedule2022(Integer schedule2022) {
        this.schedule2022 = schedule2022;
    }

    @Basic
    @Column(name = "schedule_22_24")
    public Integer getSchedule2224() {
        return schedule2224;
    }

    public void setSchedule2224(Integer schedule2224) {
        this.schedule2224 = schedule2224;
    }

    @Basic
    @Column(name = "schedule_0_2")
    public Integer getSchedule02() {
        return schedule02;
    }

    public void setSchedule02(Integer schedule02) {
        this.schedule02 = schedule02;
    }

    @Basic
    @Column(name = "schedule_2_4")
    public Integer getSchedule24() {
        return schedule24;
    }

    public void setSchedule24(Integer schedule24) {
        this.schedule24 = schedule24;
    }

    @Basic
    @Column(name = "schedule_4_6")
    public Integer getSchedule46() {
        return schedule46;
    }

    public void setSchedule46(Integer schedule46) {
        this.schedule46 = schedule46;
    }

    @Basic
    @Column(name = "schedule_6_8")
    public Integer getSchedule68() {
        return schedule68;
    }

    public void setSchedule68(Integer schedule68) {
        this.schedule68 = schedule68;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule schedule1 = (Schedule) o;

        if (schedule != null ? !schedule.equals(schedule1.schedule) : schedule1.schedule != null) return false;
        if (scheduleCsId != null ? !scheduleCsId.equals(schedule1.scheduleCsId) : schedule1.scheduleCsId != null)
            return false;
        if (scheduleDate != null ? !scheduleDate.equals(schedule1.scheduleDate) : schedule1.scheduleDate != null)
            return false;
        if (schedule810 != null ? !schedule810.equals(schedule1.schedule810) : schedule1.schedule810 != null)
            return false;
        if (schedule1012 != null ? !schedule1012.equals(schedule1.schedule1012) : schedule1.schedule1012 != null)
            return false;
        if (schedule1214 != null ? !schedule1214.equals(schedule1.schedule1214) : schedule1.schedule1214 != null)
            return false;
        if (schedule1416 != null ? !schedule1416.equals(schedule1.schedule1416) : schedule1.schedule1416 != null)
            return false;
        if (schedule1618 != null ? !schedule1618.equals(schedule1.schedule1618) : schedule1.schedule1618 != null)
            return false;
        if (schedule1820 != null ? !schedule1820.equals(schedule1.schedule1820) : schedule1.schedule1820 != null)
            return false;
        if (schedule2022 != null ? !schedule2022.equals(schedule1.schedule2022) : schedule1.schedule2022 != null)
            return false;
        if (schedule2224 != null ? !schedule2224.equals(schedule1.schedule2224) : schedule1.schedule2224 != null)
            return false;
        if (schedule02 != null ? !schedule02.equals(schedule1.schedule02) : schedule1.schedule02 != null) return false;
        if (schedule24 != null ? !schedule24.equals(schedule1.schedule24) : schedule1.schedule24 != null) return false;
        if (schedule46 != null ? !schedule46.equals(schedule1.schedule46) : schedule1.schedule46 != null) return false;
        if (schedule68 != null ? !schedule68.equals(schedule1.schedule68) : schedule1.schedule68 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schedule != null ? schedule.hashCode() : 0;
        result = 31 * result + (scheduleCsId != null ? scheduleCsId.hashCode() : 0);
        result = 31 * result + (scheduleDate != null ? scheduleDate.hashCode() : 0);
        result = 31 * result + (schedule810 != null ? schedule810.hashCode() : 0);
        result = 31 * result + (schedule1012 != null ? schedule1012.hashCode() : 0);
        result = 31 * result + (schedule1214 != null ? schedule1214.hashCode() : 0);
        result = 31 * result + (schedule1416 != null ? schedule1416.hashCode() : 0);
        result = 31 * result + (schedule1618 != null ? schedule1618.hashCode() : 0);
        result = 31 * result + (schedule1820 != null ? schedule1820.hashCode() : 0);
        result = 31 * result + (schedule2022 != null ? schedule2022.hashCode() : 0);
        result = 31 * result + (schedule2224 != null ? schedule2224.hashCode() : 0);
        result = 31 * result + (schedule02 != null ? schedule02.hashCode() : 0);
        result = 31 * result + (schedule24 != null ? schedule24.hashCode() : 0);
        result = 31 * result + (schedule46 != null ? schedule46.hashCode() : 0);
        result = 31 * result + (schedule68 != null ? schedule68.hashCode() : 0);
        return result;
    }
/*
    @ManyToOne
    @JoinColumn(name = "schedule_cs_id", referencedColumnName = "cs_id", nullable = false)
    public CustomerService getCustomerServiceByScheduleCsId() {
        return customerServiceByScheduleCsId;
    }

    public void setCustomerServiceByScheduleCsId(CustomerService customerServiceByScheduleCsId) {
        this.customerServiceByScheduleCsId = customerServiceByScheduleCsId;
    }
    */

}
