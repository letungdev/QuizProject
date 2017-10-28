/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Question;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TMK_PLAN4
 */
public class QuestionDAO {

    private static Connection conn = ConnectionManager.getConnection();
    private static ResultSet rs = null;
    private static PreparedStatement pst = null;

    public ResultSet loadData() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_getAllQuestion }");
            ResultSet rs = conn.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void inserQuestion(Question ques) {
        try {

            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_insertQuestion (?,?,?,?,?,?,?,?,?)}");
            conn.setString(1, ques.getQuesion());
            conn.setInt(2, ques.getLevel());
            conn.setString(3, ques.getMaMon());
            conn.setString(4, ques.getAnsw1());
            conn.setString(5, ques.getAnsw2());
            conn.setString(6, ques.getAnsw3());
            conn.setString(7, ques.getAnsw4());
            conn.setString(8, ques.getDapan());
            conn.setInt(9, ques.getMatk());

            conn.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int createQuestion(Question question) {
        try {

            String sql = "insert into CauHoi( ndcauhoi, dokho, mamonhoc, phuonanA, phuonanB, phuonanC, phuonanD,dapan,matk) "
                    + "values (?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);
            pst.setString(1, question.getQuesion());
            pst.setInt(2, question.getLevel());
            pst.setString(3, question.getMaMon());
            pst.setString(4, question.getAnsw1());
            pst.setString(5, question.getAnsw2());
            pst.setString(6, question.getAnsw3());
            pst.setString(7, question.getAnsw4());
            pst.setString(8, question.getDapan());
            pst.setInt(9, question.getMatk());

            int result = pst.executeUpdate();

            return result;

        } catch (SQLException ex) {
            Logger.getLogger(QueryProcess.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public void deleteQuestion(String id) {

        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("delete CauHoi where maCauHoi ='" + id + "' ");
            conn.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateQuestion(Question ques) {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_updateQuestion (?,?,?,?,?,?,?,?,?)}");
            conn.setString("ndcauhoi", ques.getQuesion());
            conn.setInt("dokho", ques.getLevel());
            conn.setString("mamonhoc", ques.getMaMon());
            conn.setString("phuonganA", ques.getAnsw1());
            conn.setString("phuonganB", ques.getAnsw2());
            conn.setString("phuonganC", ques.getAnsw3());
            conn.setString("phuonganD", ques.getAnsw4());
            conn.setString("dapan", ques.getDapan());
            conn.setString("macauhoi", ques.getId());

            conn.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Question getQuestion(String maCauHoi) {
        try {
            String sql = "select * from CauHoi where macauhoi ='" + maCauHoi + "'";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();
            Question q = new Question();
            if (rs.next()) {

                q.setAnsw1(rs.getString("phuonganA"));
                q.setAnsw2(rs.getString("phuonganB"));
                q.setAnsw3(rs.getString("phuonganC"));
                q.setAnsw4(rs.getString("phuonganD"));
                q.setId(maCauHoi);
                q.setLevel(rs.getInt("dokho"));
                q.setQuesion(rs.getString("ndcauhoi"));
            }

            return q;
        } catch (SQLException e) {

            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(QuestionDAO.getQuestion("1002").getAnsw4());
    }

}
