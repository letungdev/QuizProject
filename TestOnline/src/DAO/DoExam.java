/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Quiz;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TMK_PLAN4
 */
public class DoExam {

    public Quiz getDeThiByMamonhoc(String mamonhoc) {
        Connection cnn = ConnectionManager.getConnection();
        try {
            CallableStatement cst = cnn.prepareCall("{call ups_getRandomQuizIDBySubjectID (?)}");
            if (null != mamonhoc) {
                cst.setString("mamonhoc", mamonhoc);
            } else {
                Logger.getLogger("QuizID is null!!");
            }
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                int quizID = rs.getInt("madethi");
                UserInformation.quizID=quizID;
                Quiz quiz = new Quiz(quizID);
                return quiz;

            }
            cst.close();
            cnn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DoExam.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (null != cnn) {
                try {
                    cnn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DoExam.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;

    }

    public static void main(String[] args) {
        DoExam doexam = new DoExam();
        System.out.println(doexam.getDeThiByMamonhoc("JS"));
    }
}
