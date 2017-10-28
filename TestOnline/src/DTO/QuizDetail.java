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
public class QuizDetail {

    private int quizID;
    private int questionID;
    private String ndcauhoi;
    private String dapanA;
    private String dapanB;
    private String dapanC;
    private String dapanD;
    private int thoigianthi;
    private float tongdiem;

    public QuizDetail() {
    }

    /*
    public QuizDetail(int quizID, int questionID) {
        this.quizID = quizID;
        this.questionID = questionID;
    }
     */
    @Override
    public String toString() {

        return this.ndcauhoi + ", " + this.dapanA + ", " + this.dapanB + ", " + this.dapanC + ", " + this.dapanD;
    }

    public QuizDetail(String ndcauhoi, String dapanA, String dapanB, String dapanC, String dapanD) {
        this.ndcauhoi = ndcauhoi;
        this.dapanA = dapanA;
        this.dapanB = dapanB;
        this.dapanC = dapanC;
        this.dapanD = dapanD;
    }

    public String getNdcauhoi() {
        return ndcauhoi;
    }

    public void setNdcauhoi(String ndcauhoi) {
        this.ndcauhoi = ndcauhoi;
    }

    public String getDapanA() {
        return dapanA;
    }

    public void setDapanA(String dapanA) {
        this.dapanA = dapanA;
    }

    public String getDapanB() {
        return dapanB;
    }

    public void setDapanB(String dapanB) {
        this.dapanB = dapanB;
    }

    public String getDapanC() {
        return dapanC;
    }

    public void setDapanC(String dapanC) {
        this.dapanC = dapanC;
    }

    public String getDapanD() {
        return dapanD;
    }

    public void setDapanD(String dapanD) {
        this.dapanD = dapanD;
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public int getThoigianthi() {
        return thoigianthi;
    }

    public void setThoigianthi(int thoigianthi) {
        this.thoigianthi = thoigianthi;
    }

    public float getTongdiem() {
        return tongdiem;
    }

    public void setTongdiem(float tongdiem) {
        this.tongdiem = tongdiem;
    }

}
