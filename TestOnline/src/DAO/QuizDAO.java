/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DeThi;
import DTO.Quiz;
import DTO.QuizDetail;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TMK_PLAN4
 */
public class QuizDAO {

    public ResultSet loadAllQuiz() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_getALLQuiz}");
            ResultSet rs = conn.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(QuizDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static ArrayList<Quiz> getListQuestion() {

        ArrayList<Quiz> listquiz = new ArrayList<Quiz>();
        try {
            String sql = "select * from DeThi";
            CallableStatement conn = ConnectionManager.getConnection().prepareCall(sql);
            ResultSet rs = conn.executeQuery();

            while (rs.next()) {

                Quiz quiz = new Quiz();
                quiz.setQuizID(rs.getInt("madethi"));
                quiz.setSubjectID(rs.getString("mamonhoc"));
                quiz.setTime(rs.getTime("time"));
                quiz.setNoOflev1Ques(rs.getInt("socaudokho1"));
                quiz.setNoOflev1Ques(rs.getInt("socaudokho2"));
                quiz.setNoOflev1Ques(rs.getInt("socaudokho3"));

                listquiz.add(quiz);
            }

            return listquiz;

        } catch (SQLException e) {
            return null;

        }

    }

    public static ArrayList<String> getListDeThiRandom(String maMon) {
        ArrayList<String> array = new ArrayList<>();

        try {
            String sql = "select top 1 madethi from DeThi where mamonhoc='" + maMon + "' ORDER BY NEWID() ";
            CallableStatement conn = ConnectionManager.getConnection().prepareCall(sql);
            ResultSet rs = conn.executeQuery();

            while (rs.next()) {

                array.add(rs.getString(1));
            }

            return array;

        } catch (SQLException e) {

            return null;
        }

    }

    public static Quiz getDeThiRandom(String maMon) {

        try {
            String sql = "select top 1 madethi from DeThi where mamonhoc='" + maMon + "' ORDER BY NEWID() ";
            CallableStatement conn = ConnectionManager.getConnection().prepareCall(sql);
            ResultSet rs = conn.executeQuery();

            while (rs.next()) {

                int made = rs.getInt("madethi");
                Quiz quiz = new Quiz(made);
                return quiz;
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static DeThi getDeThi(String maDe) {
        try {

            String sql = "select  total_seconds =\n"
                    + "    DATEPART(SECOND, time) +\n"
                    + "    60 * DATEPART(MINUTE, time) +\n"
                    + "    3600 * DATEPART(HOUR, time),\n"
                    + "	tongdiem,dsmacauhoi,dsradom from   DeThi where madethi ='" + maDe + "'";

            CallableStatement conn = ConnectionManager.getConnection().prepareCall(sql);
            ResultSet rs = conn.executeQuery();

            DeThi deThi = new DeThi();
            while (rs.next()) {

                deThi.setMaDe(maDe);
                deThi.setTime(rs.getLong(1));
                deThi.setTongCau(rs.getString("dsmacauhoi").trim().split(";").length);
                deThi.setTongDiem(rs.getInt("tongdiem"));
                deThi.setDsCauHoi(rs.getString("dsmacauhoi").trim());
                deThi.setDsRandom(rs.getString("dsradom").trim());

            }
            return deThi;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

  /*  public static QuizDetail getQuizdetail(String maDe) {
        try {

            String sql = "{call ups_getQuizListBymadethi ('" + maDe + "')}";

            CallableStatement conn = ConnectionManager.getConnection().prepareCall(sql);
            ResultSet rs = conn.executeQuery();

            QuizDetail quizdetail = new QuizDetail();
            while (rs.next()) {

                quizdetail.setQuizID(maDe);
                quizdetail.setThoigianthi(rs.getInt("thoigianthi"));
                quizdetail.setNdcauhoi(rs.getString("ndcauhoi"));
                quizdetail.setDapanA(rs.getString("phuonganA"));
                quizdetail.setDapanB(rs.getString("phuonganB"));
                quizdetail.setDapanC(rs.getString("phuonganC"));
                quizdetail.setDapanD(rs.getString("phuonganD"));
                quizdetail.setQuestionID(rs.getInt("macauhoi"));

            }
            return quizdetail;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

*/
    public static int getQuizIDRandom(String mamonhoc) {

        return 0;
    }

    public static void main(String[] args) {
        // System.out.println(QuizDAO.getDeThiRandom(String.valueOf('T')));
     //   System.out.println(QuizDAO.getQuizDetail("1"));
    }

}
