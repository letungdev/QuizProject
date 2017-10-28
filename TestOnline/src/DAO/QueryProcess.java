/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DeThi;
import DTO.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author TMK_PLAN4
 */
public class QueryProcess {

    private static Connection conn = ConnectionManager.getConnection();
    private static ResultSet rs = null;
    private static PreparedStatement pst = null;

    public static String testConten() {
        try {
            conn = ConnectionManager.getConnection();
            return "Kết Nối CSDL Thành Công";
        } catch (Exception e) {
            return "Kết Nối CSDL Thất Bại";
        }
    }

    public static ArrayList<String> getArraySubject() {
        try {
            String sql = "select tenmonhoc from MonHoc";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            int i = 0;

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

    public static ResultSet excuteQuery(String sql) {

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String getMaMonHoc(String monHoc) {
        try {
            String sql = "select mamonhoc from MonHoc where tenmonhoc like N'%" + monHoc + "'";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

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

    public static ArrayList<String> getListDeThi(String maMon) {
        ArrayList<String> array = new ArrayList<>();

        try {
            String sql = "select madethi from DeThi where mamonhoc='" + maMon + "'";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                array.add(rs.getString(1));
            }

            return array;

        } catch (SQLException e) {

            return null;
        }

    }

    public static DeThi getDeThi(String maDe) {
        try {

            String sql = "select  total_seconds =\n"
                    + "    DATEPART(SECOND, time) +\n"
                    + "    60 * DATEPART(MINUTE, time) +\n"
                    + "    3600 * DATEPART(HOUR, time),\n"
                    + "	tongdiem,dsmacauhoi,dsradom from   DeThi where madethi ='" + maDe + "'";

            //String sql ="selelec thoigianthi,tongdiem,dsmacauhoi,dsrandom from DeThi where madethi='"+maDe+"'";
            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

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
                q.setLevel(Integer.valueOf(rs.getString("dokho")));
                q.setQuesion(rs.getString("ndcauhoi"));
            }

            return q;
        } catch (SQLException e) {

            return null;
        }
    }

    public static int getCountOfQuestion(String monHoc) {
        try {

            String maMon = getMaMonHoc(monHoc);

            String sql = "select count(macauhoi) from CauHoi where mamonhoc='" + maMon + "'";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            return -1;
        }

        return -1;
    }

// moi 
    public static void main(String[] args) {
        QueryProcess qs = new QueryProcess();
        //  System.out.println(qs.getDeThi(String.valueOf('1')));
        //System.out.println(qs.testConten());
        //System.out.println(qs.getListDeThi(String.valueOf('T')));
        //System.out.println(qs.getArraySubject());
        System.out.println(qs.getCountOfQuestion(String.valueOf("Toán")));

    }
}
