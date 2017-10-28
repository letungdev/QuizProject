/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Sony
 */
public class ThamGiaDTO {

    private String matk;
    private String mamonhoc;

    public ThamGiaDTO() {
    }

    public ThamGiaDTO(String matk, String mamonhoc) {
        this.matk = matk;
        this.mamonhoc = mamonhoc;
    }

    public String getMatk() {
        return matk;
    }

    public void setMatk(String matk) {
        this.matk = matk;
    }

    public String getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(String mamonhoc) {
        this.mamonhoc = mamonhoc;
    }

    @Override
    public String toString() {

        return this.matk + " , " + this.mamonhoc;
    }

}
