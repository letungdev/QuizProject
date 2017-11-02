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

    private int matk;
    private String mamonhoc;

    public ThamGiaDTO() {
    }

    public ThamGiaDTO(int matk, String mamonhoc) {
        this.matk = matk;
        this.mamonhoc = mamonhoc;
    }

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
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
