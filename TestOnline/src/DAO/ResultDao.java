/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ResultDto;
import java.sql.CallableStatement;

/**
 *
 * @author Sony
 */
public class ResultDao {

    public boolean addResult(ResultDto resultDto) {

        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_insertResult (?,?,?,?)}");
            conn.setInt(1, resultDto.getMatk());
            conn.setInt(2, resultDto.getMadethi());
            conn.setFloat(3, resultDto.getTongdiem());
            conn.setDate(4, resultDto.getNgayThi());
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;

        } catch (Exception e) {
            System.out.println("err insert{} : " + e.getMessage());
        }
        return false;
    }

}
