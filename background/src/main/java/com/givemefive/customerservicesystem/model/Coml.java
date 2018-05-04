package com.givemefive.customerservicesystem.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Coml {
    private String comlId;
    private String comlQuestion;
    private String comlSimilarQuestion;
    private String comlAnswer;
    private Date comlCreattime;
    private int comlState;
    private String companyId;
    private String comlEditor;
    private Company companyByCompanyId;

    @Id
    @Column(name = "coml_id")
    public String getComlId() {
        return comlId;
    }

    public void setComlId(String comlId) {
        this.comlId = comlId;
    }

    @Basic
    @Column(name = "coml_question")
    public String getComlQuestion() {
        return comlQuestion;
    }

    public void setComlQuestion(String comlQuestion) {
        this.comlQuestion = comlQuestion;
    }

    @Basic
    @Column(name = "coml_similar_question")
    public String getComlSimilarQuestion() {
        return comlSimilarQuestion;
    }

    public void setComlSimilarQuestion(String comlSimilarQuestion) {
        this.comlSimilarQuestion = comlSimilarQuestion;
    }

    @Basic
    @Column(name = "coml_answer")
    public String getComlAnswer() {
        return comlAnswer;
    }

    public void setComlAnswer(String comlAnswer) {
        this.comlAnswer = comlAnswer;
    }

    @Basic
    @Column(name = "coml_creattime")
    public Date getComlCreattime() {
        return comlCreattime;
    }

    public void setComlCreattime(Date comlCreattime) {
        this.comlCreattime = comlCreattime;
    }

    @Basic
    @Column(name = "coml_state")
    public int getComlState() {
        return comlState;
    }

    public void setComlState(int comlState) {
        this.comlState = comlState;
    }

    @Basic
    @Column(name = "company_id")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "coml_editor")
    public String getComlEditor() {
        return comlEditor;
    }

    public void setComlEditor(String comlEditor) {
        this.comlEditor = comlEditor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coml coml = (Coml) o;

        if (comlState != coml.comlState) return false;
        if (comlId != null ? !comlId.equals(coml.comlId) : coml.comlId != null) return false;
        if (comlQuestion != null ? !comlQuestion.equals(coml.comlQuestion) : coml.comlQuestion != null) return false;
        if (comlSimilarQuestion != null ? !comlSimilarQuestion.equals(coml.comlSimilarQuestion) : coml.comlSimilarQuestion != null)
            return false;
        if (comlAnswer != null ? !comlAnswer.equals(coml.comlAnswer) : coml.comlAnswer != null) return false;
        if (comlCreattime != null ? !comlCreattime.equals(coml.comlCreattime) : coml.comlCreattime != null)
            return false;
        if (companyId != null ? !companyId.equals(coml.companyId) : coml.companyId != null) return false;
        if (comlEditor != null ? !comlEditor.equals(coml.comlEditor) : coml.comlEditor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = comlId != null ? comlId.hashCode() : 0;
        result = 31 * result + (comlQuestion != null ? comlQuestion.hashCode() : 0);
        result = 31 * result + (comlSimilarQuestion != null ? comlSimilarQuestion.hashCode() : 0);
        result = 31 * result + (comlAnswer != null ? comlAnswer.hashCode() : 0);
        result = 31 * result + (comlCreattime != null ? comlCreattime.hashCode() : 0);
        result = 31 * result + comlState;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (comlEditor != null ? comlEditor.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "company_id", nullable = false)
    public Company getCompanyByCompanyId() {
        return companyByCompanyId;
    }

    public void setCompanyByCompanyId(Company companyByCompanyId) {
        this.companyByCompanyId = companyByCompanyId;
    }
}
