package com.givemefive.customerservicesystem.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "customer_service", schema = "CustomerSurvice", catalog = "")
public class CustomerService {
    private String csId;
    private String csName;
    private String csAccount;
    private String csPassword;
    private String csContactInformation;
    private String csCompanyId;
    private Collection<CsEvaluation> csEvaluationsByCsId;
    private Company companyByCsCompanyId;
    private Collection<Record> recordsByCsId;
    private Collection<Schedule> schedulesByCsId;

    @Id
    @Column(name = "cs_id", nullable = false, length = 20)
    public String getCsId() {
        return csId;
    }

    public void setCsId(String csId) {
        this.csId = csId;
    }

    @Basic
    @Column(name = "cs_name", nullable = false, length = 20)
    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    @Basic
    @Column(name = "cs_account", nullable = false, length = 20)
    public String getCsAccount() {
        return csAccount;
    }

    public void setCsAccount(String csAccount) {
        this.csAccount = csAccount;
    }

    @Basic
    @Column(name = "cs_password", nullable = false, length = 20)
    public String getCsPassword() {
        return csPassword;
    }

    public void setCsPassword(String csPassword) {
        this.csPassword = csPassword;
    }

    @Basic
    @Column(name = "cs_contact_information", nullable = false, length = 20)
    public String getCsContactInformation() {
        return csContactInformation;
    }

    public void setCsContactInformation(String csContactInformation) {
        this.csContactInformation = csContactInformation;
    }

    @Basic
    @Column(name = "cs_company_ID", nullable = false, length = 20)
    public String getCsCompanyId() {
        return csCompanyId;
    }

    public void setCsCompanyId(String csCompanyId) {
        this.csCompanyId = csCompanyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerService that = (CustomerService) o;

        if (csId != null ? !csId.equals(that.csId) : that.csId != null) return false;
        if (csName != null ? !csName.equals(that.csName) : that.csName != null) return false;
        if (csAccount != null ? !csAccount.equals(that.csAccount) : that.csAccount != null) return false;
        if (csPassword != null ? !csPassword.equals(that.csPassword) : that.csPassword != null) return false;
        if (csContactInformation != null ? !csContactInformation.equals(that.csContactInformation) : that.csContactInformation != null)
            return false;
        if (csCompanyId != null ? !csCompanyId.equals(that.csCompanyId) : that.csCompanyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = csId != null ? csId.hashCode() : 0;
        result = 31 * result + (csName != null ? csName.hashCode() : 0);
        result = 31 * result + (csAccount != null ? csAccount.hashCode() : 0);
        result = 31 * result + (csPassword != null ? csPassword.hashCode() : 0);
        result = 31 * result + (csContactInformation != null ? csContactInformation.hashCode() : 0);
        result = 31 * result + (csCompanyId != null ? csCompanyId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "customerServiceByCsEvaluationCsId")
    public Collection<CsEvaluation> getCsEvaluationsByCsId() {
        return csEvaluationsByCsId;
    }

    public void setCsEvaluationsByCsId(Collection<CsEvaluation> csEvaluationsByCsId) {
        this.csEvaluationsByCsId = csEvaluationsByCsId;
    }

    @ManyToOne
    @JoinColumn(name = "cs_company_ID", referencedColumnName = "company_id", nullable = false)
    public Company getCompanyByCsCompanyId() {
        return companyByCsCompanyId;
    }

    public void setCompanyByCsCompanyId(Company companyByCsCompanyId) {
        this.companyByCsCompanyId = companyByCsCompanyId;
    }

    @OneToMany(mappedBy = "customerServiceByRecordCsId")
    public Collection<Record> getRecordsByCsId() {
        return recordsByCsId;
    }

    public void setRecordsByCsId(Collection<Record> recordsByCsId) {
        this.recordsByCsId = recordsByCsId;
    }

    @OneToMany(mappedBy = "customerServiceByScheduleCsId")
    public Collection<Schedule> getSchedulesByCsId() {
        return schedulesByCsId;
    }

    public void setSchedulesByCsId(Collection<Schedule> schedulesByCsId) {
        this.schedulesByCsId = schedulesByCsId;
    }
}
