/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Sony
 */
public class ResultDto {
    private int matk;
    private float tongdiem;
    private int madethi;
    private Date ngayThi;

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public float getTongdiem() {
        return tongdiem;
    }

    public void setTongdiem(float tongdiem) {
        this.tongdiem = tongdiem;
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(Date ngayThi) {
        this.ngayThi = ngayThi;
    }

    @Override
    public String toString() {
        return "ResultDto{" + "matk=" + matk + ", tongdiem=" + tongdiem + ", madethi=" + madethi + ", ngayThi=" + ngayThi + '}';
    }

   

    public ResultDto() {
    }

    public int getMadethi() {
        return madethi;
    }

    public void setMadethi(int madethi) {
        this.madethi = madethi;
    }

    public ResultDto(int matk, float tongdiem, int madethi, Date ngayThi) {
        this.matk = matk;
        this.tongdiem = tongdiem;
        this.madethi = madethi;
        this.ngayThi = ngayThi;
    }
 
}
