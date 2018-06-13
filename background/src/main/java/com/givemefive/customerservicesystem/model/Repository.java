package com.givemefive.customerservicesystem.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "repository", schema = "CustomerSurvice", catalog = "")
public class Repository {
    private String repositoryId;
    private String proQuestionId;
    private String repositoryQuestion;
    private String repositoryResponse;
    private String repositoryKeyWords;
    private int repositoryState;
    private Date repositoryCreationTime;
    private int repositoryConsultationTimes;
    private String repositoryEditor;

    public Repository() {
    }


    @Id
    @Column(name = "repository_id",nullable = false)
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    @Basic
    @Column(name = "pro_question_id",insertable = false,updatable = false,nullable = true)
    public String getProQuestionId() {
        return proQuestionId;
    }

    public void setProQuestionId(String proQuestionId) {
        this.proQuestionId = proQuestionId;
    }

    @Basic
    @Column(name = "repository_question",nullable = false)
    public String getRepositoryQuestion() {
        return repositoryQuestion;
    }

    public void setRepositoryQuestion(String repositoryQuestion) {
        this.repositoryQuestion = repositoryQuestion;
    }

    @Basic
    @Column(name = "repository_response",nullable = false)
    public String getRepositoryResponse() {
        return repositoryResponse;
    }

    public void setRepositoryResponse(String repositoryResponse) {
        this.repositoryResponse = repositoryResponse;
    }

    @Basic
    @Column(name = "repository_key_words",nullable = false)
    public String getRepositoryKeyWords() {
        return repositoryKeyWords;
    }

    public void setRepositoryKeyWords(String repositoryKeyWords) {
        this.repositoryKeyWords = repositoryKeyWords;
    }

    @Basic
    @Column(name = "repository_state",nullable = true)
    public int getRepositoryState() {
        return repositoryState;
    }

    public void setRepositoryState(int repositoryState) {
        this.repositoryState = repositoryState;
    }

    @Basic
    @Column(name = "repository_creation_time",nullable = true)
    public Date getRepositoryCreationTime() {
        return repositoryCreationTime;
    }

    public void setRepositoryCreationTime(Date repositoryCreationTime) {
        this.repositoryCreationTime = repositoryCreationTime;
    }

    @Basic
    @Column(name = "repository_consultation_times",nullable = true)
    public int getRepositoryConsultationTimes() {
        return repositoryConsultationTimes;
    }

    public void setRepositoryConsultationTimes(int repositoryConsultationTimes) {
        this.repositoryConsultationTimes = repositoryConsultationTimes;
    }

    @Basic
    @Column(name = "repository_editor",nullable = true)
    public String getRepositoryEditor() {
        return repositoryEditor;
    }

    public void setRepositoryEditor(String repositoryEditor) {
        this.repositoryEditor = repositoryEditor;
    }






    public Repository(String repositoryId,String repositoryQuestion,String repositoryResponse,String repositoryKeyWords){
        this.repositoryId = repositoryId;
        this.repositoryQuestion = repositoryQuestion;
        this.repositoryResponse = repositoryResponse;
        this.repositoryKeyWords = repositoryKeyWords;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Repository that = (Repository) o;

        if (repositoryState != that.repositoryState) return false;
        if (repositoryConsultationTimes != that.repositoryConsultationTimes) return false;
        if (repositoryId != null ? !repositoryId.equals(that.repositoryId) : that.repositoryId != null) return false;
        if (proQuestionId != null ? !proQuestionId.equals(that.proQuestionId) : that.proQuestionId != null)
            return false;
        if (repositoryQuestion != null ? !repositoryQuestion.equals(that.repositoryQuestion) : that.repositoryQuestion != null)
            return false;
        if (repositoryResponse != null ? !repositoryResponse.equals(that.repositoryResponse) : that.repositoryResponse != null)
            return false;
        if (repositoryKeyWords != null ? !repositoryKeyWords.equals(that.repositoryKeyWords) : that.repositoryKeyWords != null)
            return false;
        if (repositoryCreationTime != null ? !repositoryCreationTime.equals(that.repositoryCreationTime) : that.repositoryCreationTime != null)
            return false;
        if (repositoryEditor != null ? !repositoryEditor.equals(that.repositoryEditor) : that.repositoryEditor != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repositoryId != null ? repositoryId.hashCode() : 0;
        result = 31 * result + (proQuestionId != null ? proQuestionId.hashCode() : 0);
        result = 31 * result + (repositoryQuestion != null ? repositoryQuestion.hashCode() : 0);
        result = 31 * result + (repositoryResponse != null ? repositoryResponse.hashCode() : 0);
        result = 31 * result + (repositoryKeyWords != null ? repositoryKeyWords.hashCode() : 0);
        result = 31 * result + repositoryState;
        result = 31 * result + (repositoryCreationTime != null ? repositoryCreationTime.hashCode() : 0);
        result = 31 * result + repositoryConsultationTimes;
        result = 31 * result + (repositoryEditor != null ? repositoryEditor.hashCode() : 0);
        return result;
    }
/*
    @ManyToOne
    @JoinColumn(name = "pro_question_id", referencedColumnName = "pro_question_id")
    public ProductQuestion getProductQuestionByProQuestionId() {
        return productQuestionByProQuestionId;
    }

    public void setProductQuestionByProQuestionId(ProductQuestion productQuestionByProQuestionId) {
        this.productQuestionByProQuestionId = productQuestionByProQuestionId;
    }
    */

}
