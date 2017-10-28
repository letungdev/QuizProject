/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author TMK_PLAN4
 */
public class Question {

    private String id;
    private String quesion;
    private String answ1;
    private String answ2;
    private String answ3;
    private String answ4;
    private int level;
    private String maMon;
    private String dapan;
    private int thoigianthi;
    private int matk;

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public String getDapan() {
        return dapan;
    }

    public void setDapan(String dapan) {
        this.dapan = dapan;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getQuesion() {
        return quesion;
    }

    public void setQuesion(String quesion) {
        this.quesion = quesion;
    }

    public String getAnsw1() {
        return answ1;
    }

    public void setAnsw1(String answ1) {
        this.answ1 = answ1;
    }

    public String getAnsw2() {
        return answ2;
    }

    public void setAnsw2(String answ2) {
        this.answ2 = answ2;
    }

    public String getAnsw3() {
        return answ3;
    }

    public void setAnsw3(String answ3) {
        this.answ3 = answ3;
    }

    public String getAnsw4() {
        return answ4;
    }

    public void setAnsw4(String answ4) {
        this.answ4 = answ4;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getThoigianthi() {
        return thoigianthi;
    }

    public void setThoigianthi(int thoigianthi) {
        this.thoigianthi = thoigianthi;
    }

    public Question() {
    }

    public Question(String quesion,int level , String maMon, String answ1, String answ2, String answ3, String answ4, String dapan, int matk) {
        this.quesion = quesion;
        this.answ1 = answ1;
        this.answ2 = answ2;
        this.answ3 = answ3;
        this.answ4 = answ4;
        this.level = level;
        this.maMon = maMon;
        this.dapan = dapan;
        this.matk = matk;
    }

}
