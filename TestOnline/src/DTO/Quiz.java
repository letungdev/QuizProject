/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Time;

/**
 *
 * @author TMK_PLAN4
 */
// dethi
public class Quiz {

    private int quizID;
    private String subjectID;
    private Time time;
    private int noOflev1Ques;
    private int noOflev2Ques;
    private int noOflev3Ques;
    private int status;

    public Quiz() {
    }

    public Quiz(int quizID) {
        this.quizID = quizID;
    }

    public Quiz(int quizID, String subjectID, Time time, int noOflev1Ques,
            int noOflev2Ques, int noOflev3Ques, int status) {
        this.quizID = quizID;
        this.subjectID = subjectID;
        this.time = time;
        this.noOflev1Ques = noOflev1Ques;
        this.noOflev2Ques = noOflev2Ques;
        this.noOflev3Ques = noOflev3Ques;
        this.status = status;
    }

    @Override
    public String toString() {
        return this.quizID + " ";
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getNoOflev1Ques() {
        return noOflev1Ques;
    }

    public void setNoOflev1Ques(int noOflev1Ques) {
        this.noOflev1Ques = noOflev1Ques;
    }

    public int getNoOflev2Ques() {
        return noOflev2Ques;
    }

    public void setNoOflev2Ques(int noOflev2Ques) {
        this.noOflev2Ques = noOflev2Ques;
    }

    public int getNoOflev3Ques() {
        return noOflev3Ques;
    }

    public void setNoOflev3Ques(int noOflev3Ques) {
        this.noOflev3Ques = noOflev3Ques;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
