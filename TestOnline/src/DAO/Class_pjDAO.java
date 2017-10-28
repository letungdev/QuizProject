/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Class_pjDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TMK_PLAN4
 */
public class Class_pjDAO {

    public ResultSet LoadataClass_pj() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_getAllClass_pj}");
            ResultSet rs = conn.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("DAO.Class_pjDAO.LoadataClass_pj(): "+e.getMessage());
        }
        return null;
    }

    public ResultSet getClassByClassID() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_getClassbyClassID}");
            ResultSet rs = conn.executeQuery();
            return rs;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean InsertClass_pj(Class_pjDTO class_pj) {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call  ups_insertClass_pj (?,?)}");
            conn.setString(1, class_pj.getIdclass_pj());
            conn.setString(2, class_pj.getNameclass_pj());
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;
        } catch (Exception e) {
            System.out.println("Insert Class : " + e.getMessage());
        }
        return false;
    }

    public boolean DeleteClass_pj(Class_pjDTO class_pj) {

        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_deleteClass_pj(?)}");
            conn.setString(1, class_pj.getIdclass_pj());
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;

        } catch (Exception e) {
            System.out.println("DAO.Class_pjDAO.DeleteClass_pj() : " + e.getMessage());
        }
        return false;
    }

    public boolean UpdateClass_pj(Class_pjDTO class_pj) {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call  ups_updateClass_pj(?,?)}");
            conn.setString(1, class_pj.getIdclass_pj());
            conn.setString(2, class_pj.getNameclass_pj());
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;

        } catch (Exception e) {
            System.out.println("DAO.Class_pjDAO.UpdateClass_pj(): " + e.getMessage());
        }
        return false;
    }

    public static String getMaLophoc(String tenlop) {
        try {
            String sql = "select malophoc from lophoc where tenlop like N'%" + tenlop + "'";
            CallableStatement conn = ConnectionManager.getConnection().prepareCall(sql);
            ResultSet rs = conn.executeQuery();
            String malophoc = "";
            if (rs.next()) {
                malophoc = rs.getString(1);
                return malophoc;
            }
        } catch (SQLException e) {

            return "";

        }

        return "";
    }
    public static boolean CheckClassIDExists(String classID) {
        boolean usernamExits = false;
        Connection cnn = ConnectionManager.getConnection();
        try {
            CallableStatement conn = cnn.prepareCall("select*from lophoc where malophoc=?");
            conn.setString(1, classID);
            ResultSet r1 = conn.executeQuery();
            if (r1.next()) {
                usernamExits = true;
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
        }
        return usernamExits;
    }

    public static void main(String[] args) {
        Class_pjDAO dao = new Class_pjDAO();
        System.out.println(Class_pjDAO.getMaLophoc("Đại học Địa lý 1"));
    }

}
