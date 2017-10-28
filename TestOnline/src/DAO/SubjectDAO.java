/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.SubjectDTO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author TMK_PLAN4
 */
public class SubjectDAO {

    public ResultSet loadData() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_getAllSubject}");
            ResultSet rs = conn.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertSubject(SubjectDTO subjectdto) {

        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_insertSubject(?,?,?)}");
            conn.setString(1, subjectdto.getSubjectID());
            conn.setString(2, subjectdto.getSubjectName());
            conn.setInt(3, subjectdto.getCredits());
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;

        } catch (Exception e) {
            System.out.println("DAO.SubjectDAO.insertSubject() : " + e.getMessage());
        }
        return false;
    }

    public boolean DeleteSubject(SubjectDTO subjectdto) {

        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_deleteSubject(?)}");
            conn.setString(1, subjectdto.getSubjectID());
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;

        } catch (Exception e) {
            System.out.println("DAO.SubjectDAO.DeleteSubject(): " + e.getMessage());
        }
        return false;
    }

    public boolean UpdateSubject(SubjectDTO subjectdto) {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call  ups_updateSubject(?,?,?)}");
            conn.setString(1, subjectdto.getSubjectID());
            conn.setString(2, subjectdto.getSubjectName());
            conn.setInt(3, subjectdto.getCredits());
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;
        } catch (Exception e) {
            System.out.println("DAO.SubjectDAO.UpdateSubject() : " + e.getMessage());
        }
        return false;
    }

    public static String getMaMonHoc(String monHoc) {
        try {
            String sql = "select mamonhoc from MonHoc where tenmonhoc like N'%" + monHoc + "'";
            CallableStatement conn = ConnectionManager.getConnection().prepareCall(sql);
            ResultSet rs = conn.executeQuery();
            String maMon = "";
            if (rs.next()) {
                maMon = rs.getString(1);
                return maMon;
            }
        } catch (SQLException e) {

            return "";

        }

        return "";
    }

    public static ArrayList<String> getArraySubject() {
        try {
            String sql = "select tenmonhoc from MonHoc";

            CallableStatement conn = ConnectionManager.getConnection().prepareCall(sql);
            ResultSet rs = conn.executeQuery();
            ArrayList<String> array = new ArrayList<>();
            while (rs.next()) {

                array.add(rs.getString(1));

            }
            System.out.println(array.size() + "");
            return array;

        } catch (SQLException e) {
            return null;
        }

    }

    public static boolean CheckSubjectIDExists(String subjectID) {
        boolean subjectIDExists = false;
        try {

            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_getSubjectByID(?)}");
            conn.setString("mamonhoc", subjectID);
            ResultSet r1 = conn.executeQuery();
            while (r1.next()) {

                subjectIDExists = true;
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
        }
        return subjectIDExists;
    }

    public static void main(String[] args) {
        System.out.println(SubjectDAO.getArraySubject());
    }

}
