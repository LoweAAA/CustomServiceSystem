package com.givemefive.customerservicesystem.model.bean;

import javax.persistence.*;

@Entity
@Table(name = "cs_evaluation", schema = "CustomerSurvice", catalog = "")
public class CsEvaluation {
    private String csEvaluationId;
    private int csEvaluationGrade;
    private String csEvaluationUserId;
    private String csEvaluationCsId;
    private User userByCsEvaluationUserId;
    private CustomerService customerServiceByCsEvaluationCsId;

    @Basic
    @Id
    @Column(name = "cs_evaluation_id",insertable = false,updatable = false)
    public String getCsEvaluationId() {
        return csEvaluationId;
    }

    public void setCsEvaluationId(String csEvaluationId) {
        this.csEvaluationId = csEvaluationId;
    }

    @Basic
    @Column(name = "cs_evaluation_grade")
    public int getCsEvaluationGrade() {
        return csEvaluationGrade;
    }

    public void setCsEvaluationGrade(int csEvaluationGrade) {
        this.csEvaluationGrade = csEvaluationGrade;
    }

    @Basic
    @Column(name = "cs_evaluation_user_id",insertable = false,updatable = false)
    public String getCsEvaluationUserId() {
        return csEvaluationUserId;
    }

    public void setCsEvaluationUserId(String csEvaluationUserId) {
        this.csEvaluationUserId = csEvaluationUserId;
    }

    @Basic
    @Column(name = "cs_evaluation_cs_id",insertable = false,updatable = false)
    public String getCsEvaluationCsId() {
        return csEvaluationCsId;
    }

    public void setCsEvaluationCsId(String csEvaluationCsId) {
        this.csEvaluationCsId = csEvaluationCsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CsEvaluation that = (CsEvaluation) o;

        if (csEvaluationGrade != that.csEvaluationGrade) return false;
        if (csEvaluationId != null ? !csEvaluationId.equals(that.csEvaluationId) : that.csEvaluationId != null)
            return false;
        if (csEvaluationUserId != null ? !csEvaluationUserId.equals(that.csEvaluationUserId) : that.csEvaluationUserId != null)
            return false;
        if (csEvaluationCsId != null ? !csEvaluationCsId.equals(that.csEvaluationCsId) : that.csEvaluationCsId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = csEvaluationId != null ? csEvaluationId.hashCode() : 0;
        result = 31 * result + csEvaluationGrade;
        result = 31 * result + (csEvaluationUserId != null ? csEvaluationUserId.hashCode() : 0);
        result = 31 * result + (csEvaluationCsId != null ? csEvaluationCsId.hashCode() : 0);
        return result;
    }
/*
    @ManyToOne
    @JoinColumn(name = "cs_evaluation_user_id", referencedColumnName = "user_id", nullable = false)
    public User getUserByCsEvaluationUserId() {
        return userByCsEvaluationUserId;
    }

    public void setUserByCsEvaluationUserId(User userByCsEvaluationUserId) {
        this.userByCsEvaluationUserId = userByCsEvaluationUserId;
    }

    @ManyToOne
    @JoinColumn(name = "cs_evaluation_cs_id", referencedColumnName = "cs_id", nullable = false)
    public CustomerService getCustomerServiceByCsEvaluationCsId() {
        return customerServiceByCsEvaluationCsId;
    }

    public void setCustomerServiceByCsEvaluationCsId(CustomerService customerServiceByCsEvaluationCsId) {
        this.customerServiceByCsEvaluationCsId = customerServiceByCsEvaluationCsId;
    }
    */
}
