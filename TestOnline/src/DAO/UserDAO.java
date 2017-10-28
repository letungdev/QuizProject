/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Authentication;
import DTO.Constants;
import DTO.UserDTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TMK_PLAN4
 */
public class UserDAO {
    

    public ResultSet loaddata() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_getAllUserLopKhoa }");
            ResultSet rs = conn.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet loadpermission() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_getPermission }");
            ResultSet rs = conn.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
public String login(String user, String pass) {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_login(?,?)}");
            
            conn.setString("username", user);
            conn.setString("pass", pass);
             ResultSet rs = conn.executeQuery();
             return rs.toString();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public UserDTO getDataByUserName(String username) {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call getUserByUserName(?)}");
            if (null != username) {
                conn.setString(1, username);
            } else {
                Logger.getLogger("User Name is null!");
            }
            ResultSet rs = conn.executeQuery();
            while (rs.next()) {
                String name = rs.getString("ten");
                Date birthday = rs.getDate("ngaysinh");
                String address = rs.getString("diachi");
                Integer yearschool = rs.getInt("namhoc");
                String phone = rs.getString("sdt");
                String email = rs.getString("email");
                String pass = rs.getString("pass");
                String classID = rs.getString("malophoc");
                String permission = rs.getString("quyen");
                UserDTO userdto = new UserDTO(name, birthday, address, yearschool, phone, email, username, pass, classID, permission);
                return userdto;
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean inserUser(UserDTO user) {

        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_insertUser (?,?,?,?,?,?,?,?,?,?)}");

            conn.setString(1, user.getName());
            conn.setDate(2, user.getBirthday()); // Date
            conn.setString(3, user.getAddress());
            conn.setInt(4, user.getYearschool());//int
            conn.setString(5, user.getPhone());
            conn.setString(6, user.getEmail());
            conn.setString(7, user.getUsername());
            conn.setString(8, Authentication.md5(user.getPassword()));
            conn.setString(9, user.getIdclass_pj());
            conn.setString(10, user.getPermission());

            int result = conn.executeUpdate();
            conn.close();
            return result > 0;

        } catch (Exception e) {
            System.out.println("btnInsertUser : " + e.getMessage());
        }
        return false;
    }

    public boolean deleteUser(UserDTO user) {

        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_deleteUser (?)}");
            conn.setInt(1, user.getIduser()); //int
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;

        } catch (Exception e) {
            System.out.println(" btnDeleteUser : " + e.getMessage());
        }
        return false;
    }

    public boolean updateUser(UserDTO user) {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_updateUser (?,?,?,?,?,?,?,?,?,?,?)}");
            conn.setString(2, user.getName());
            conn.setDate(3, user.getBirthday()); // Date
            conn.setString(4, user.getAddress());
            conn.setInt(5, user.getYearschool());//int
            conn.setString(6, user.getPhone());
            conn.setString(7, user.getEmail());
            conn.setString(8, user.getUsername());
            conn.setString(9, user.getPassword());
            conn.setString(10, user.getIdclass_pj());
            conn.setString(11, user.getPermission());
            conn.setInt(1, user.getIduser());
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;
        } catch (Exception e) {
            System.out.println("btnEditUser :" + e.getMessage());
        }
        return false;
    }

    public static boolean CheckUsernameExists(String username) {
        boolean usernamExits = false;
        Connection cnn = ConnectionManager.getConnection();
        try {
            CallableStatement conn = cnn.prepareCall("select*from TaiKhoan where username=?");
            conn.setString(1, username);
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
        UserDAO userdao = new UserDAO();

        // System.out.println(userdao.getALLUser());
//        UserDTO cntn = new UserDTO ("Nguyen Thien Quan",Date.valueOf("2017-06-05"),"TP.HCM",2017,"0983997248","Quan@gmail","quan","123456","KHTN","DHT1","student");
//        System.out.println("DAO.UserDAO.main()"+userdao.inserUser(cntn));
        System.out.println(UserDAO.CheckUsernameExists("ng"));
    }
}
