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
public class SubjectDTO {

    private String subjectID;
    private String subjectName;
    private int credits;
    private int status;

    public SubjectDTO() {
    }

    public SubjectDTO(String subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }

    public SubjectDTO(String subjectID, String subjectName, int credit) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.credits = credit;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
