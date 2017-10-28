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
public class Class_pjDTO {
    private String idclass_pj;
    private String nameclass_pj;
    private int status;
    public Class_pjDTO(){}
    public Class_pjDTO(String nameclass_pj){
    this.nameclass_pj = nameclass_pj;
    }
    public  Class_pjDTO(String idclass_pj, String nameclass_pj)
    {
        this.idclass_pj=idclass_pj;
        this.nameclass_pj= nameclass_pj;
    }
    @Override
    public  String toString(){
    
    return this.nameclass_pj;
    
    }
    public String getIdclass_pj() {
        return idclass_pj;
    }

    public void setIdclass_pj(String idclass_pj) {
        this.idclass_pj = idclass_pj;
    }

    public String getNameclass_pj() {
        return nameclass_pj;
    }

    public void setNameclass_pj(String nameclass_pj) {
        this.nameclass_pj = nameclass_pj;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
    
    
}
