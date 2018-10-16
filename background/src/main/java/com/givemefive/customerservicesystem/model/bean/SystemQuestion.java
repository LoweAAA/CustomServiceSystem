package com.givemefive.customerservicesystem.model.bean;

import javax.persistence.*;

@Entity
@Table(name = "system_question", schema = "CustomerSurvice", catalog = "")
public class SystemQuestion {
    private int systemQuestionId;
    private String questionState;
    private String questionAnswer;

    public SystemQuestion() {
    }

    @Id
    @Column(name = "system_question_id", nullable = false)
    public int getSystemQuestionId() {
        return systemQuestionId;
    }

    public void setSystemQuestionId(int systemQuestionId) {
        this.systemQuestionId = systemQuestionId;
    }

    @Basic
    @Column(name = "question_state", nullable = false, length = 255)
    public String getQuestionState() {
        return questionState;
    }

    public void setQuestionState(String questionState) {
        this.questionState = questionState;
    }

    @Basic
    @Column(name = "question_answer", nullable = false, length = 255)
    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }



    public SystemQuestion(Integer id,String Question,String Answer){
        this.systemQuestionId = id;
        this.questionState = Question;
        this.questionAnswer = Answer;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemQuestion that = (SystemQuestion) o;

        if (systemQuestionId != that.systemQuestionId) return false;
        if (questionState != null ? !questionState.equals(that.questionState) : that.questionState != null)
            return false;
        if (questionAnswer != null ? !questionAnswer.equals(that.questionAnswer) : that.questionAnswer != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemQuestionId;
        result = 31 * result + (questionState != null ? questionState.hashCode() : 0);
        result = 31 * result + (questionAnswer != null ? questionAnswer.hashCode() : 0);
        return result;
    }
}
