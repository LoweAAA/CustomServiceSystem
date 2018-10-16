package com.givemefive.customerservicesystem.model.bean;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "coml", schema = "CustomerSurvice", catalog = "")
public class Coml {
    private int comlId;
    private String comlQuestion;
    private String comlSimilarQuestion;
    private String comlAnswer;
    private Date comlCreattime;
    private Integer comlState;
    private String companyName;
    private String comlEditor;

    @Id
    @Column(name = "coml_id", nullable = false)
    public int getComlId() {
        return comlId;
    }

    public void setComlId(int comlId) {
        this.comlId = comlId;
    }

    @Basic
    @Column(name = "coml_question", nullable = false, length = 1000)
    public String getComlQuestion() {
        return comlQuestion;
    }

    public void setComlQuestion(String comlQuestion) {
        this.comlQuestion = comlQuestion;
    }

    @Basic
    @Column(name = "coml_similar_question", nullable = false, length = 10000)
    public String getComlSimilarQuestion() {
        return comlSimilarQuestion;
    }

    public void setComlSimilarQuestion(String comlSimilarQuestion) {
        this.comlSimilarQuestion = comlSimilarQuestion;
    }

    @Basic
    @Column(name = "coml_answer", nullable = false, length = 1000)
    public String getComlAnswer() {
        return comlAnswer;
    }

    public void setComlAnswer(String comlAnswer) {
        this.comlAnswer = comlAnswer;
    }

    @Basic
    @Column(name = "coml_creattime", nullable = true)
    public Date getComlCreattime() {
        return comlCreattime;
    }

    public void setComlCreattime(Date comlCreattime) {
        this.comlCreattime = comlCreattime;
    }

    @Basic
    @Column(name = "coml_state", nullable = true)
    public Integer getComlState() {
        return comlState;
    }

    public void setComlState(Integer comlState) {
        this.comlState = comlState;
    }

    @Basic
    @Column(name = "company_name", nullable = false, length = 20)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "coml_editor", nullable = true, length = 20)
    public String getComlEditor() {
        return comlEditor;
    }

    public void setComlEditor(String comlEditor) {
        this.comlEditor = comlEditor;
    }


    public void build(String comlQuestion,String comlSimilarQuestion,String comlAnswer,String companyName,String editor){
        this.comlQuestion = comlQuestion;
        this.comlSimilarQuestion = comlSimilarQuestion;
        this.comlAnswer = comlAnswer;
        this.companyName = companyName;
        this.comlEditor = editor;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coml coml = (Coml) o;

        if (comlId != coml.comlId) return false;
        if (comlQuestion != null ? !comlQuestion.equals(coml.comlQuestion) : coml.comlQuestion != null) return false;
        if (comlSimilarQuestion != null ? !comlSimilarQuestion.equals(coml.comlSimilarQuestion) : coml.comlSimilarQuestion != null)
            return false;
        if (comlAnswer != null ? !comlAnswer.equals(coml.comlAnswer) : coml.comlAnswer != null) return false;
        if (comlCreattime != null ? !comlCreattime.equals(coml.comlCreattime) : coml.comlCreattime != null)
            return false;
        if (comlState != null ? !comlState.equals(coml.comlState) : coml.comlState != null) return false;
        if (companyName != null ? !companyName.equals(coml.companyName) : coml.companyName != null) return false;
        if (comlEditor != null ? !comlEditor.equals(coml.comlEditor) : coml.comlEditor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = comlId;
        result = 31 * result + (comlQuestion != null ? comlQuestion.hashCode() : 0);
        result = 31 * result + (comlSimilarQuestion != null ? comlSimilarQuestion.hashCode() : 0);
        result = 31 * result + (comlAnswer != null ? comlAnswer.hashCode() : 0);
        result = 31 * result + (comlCreattime != null ? comlCreattime.hashCode() : 0);
        result = 31 * result + (comlState != null ? comlState.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (comlEditor != null ? comlEditor.hashCode() : 0);
        return result;
    }
}
