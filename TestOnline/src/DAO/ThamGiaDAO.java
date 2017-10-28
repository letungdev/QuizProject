/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author Sony
 */
public class ThamGiaDAO {

    public ResultSet loadDataThamgia() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("ups_getAllThamGia");
            ResultSet rs = conn.executeQuery();
            return  rs;       
            
        } catch (Exception e) {
            System.out.println("DAO.ThamGiaDAO.loadDataThamgia(): " + e.getMessage());
        }

        return null;
    }
    public static void main(String[] args) {
//        System.out.println(ThamGiaDAO.loadDataThamgia());
    }

}
