/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TMK_PLAN4
 */
public class LoginDAO {

    public ResultSet getData() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_login(?,?)}");
            ResultSet rs = conn.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {

    }
 
}
