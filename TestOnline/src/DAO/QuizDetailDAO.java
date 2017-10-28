/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.QuizDetail;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TMK_PLAN4
 */
public class QuizDetailDAO {

    public ResultSet loadAllQuizDetail() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_getAllCTDethi}");
            ResultSet rs = conn.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(QuizDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    // get list question by quiz ID
    public List<QuizDetail> getQuizdetail(int quizID) {
        Connection cnn = ConnectionManager.getConnection();
        try {
            CallableStatement cst = cnn.prepareCall("{call ups_getQuizListBymadethi(?)}");
            cst.setInt("madethi", quizID);
            ResultSet rs = cst.executeQuery();
            List<QuizDetail> list = new ArrayList<QuizDetail>();
            while (rs.next()) {
                QuizDetail q = new QuizDetail(rs.getString("ndcauhoi"),
                        rs.getString("phuonganA"),
                        rs.getString("phuonganB"),
                        rs.getString("phuonganC"),
                        rs.getString("phuonganD"));

                list.add(q);
            }
            cst.close();
            return list;

        } catch (Exception e) {
            Logger.getLogger(QuizDetailDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (null != cnn) {
                try {
                    cnn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuizDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return null;
    }

    public void insertQuizDetail(QuizDetail quizdto) {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_inserDethi(?,?)}");
            conn.setInt(1, quizdto.getQuizID());
            conn.setInt(2, quizdto.getQuestionID());
            conn.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuizDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        QuizDetailDAO dao = new QuizDetailDAO();
        System.out.println(dao.getQuizdetail(2));
    }
}
