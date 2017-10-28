/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author TMK_PLAN4
 */
public class UserDTO {

    private int iduser;
    private String name;
    private Date birthday; // import date sql can check lai
    private String address;
    private int yearschool;
    private String phone;
    private String email;
    private String username;
    private String password;
    private String idclass_pj;
    private String permission;

    public UserDTO() {
    }

    public UserDTO(String name,Date birthday, String address, int yearschool, String phone,
            String email, String username, String password, String idclass_pj, String permission) {
        this.name = name;
        this.birthday= birthday;
        this.address = address;
        this.yearschool = yearschool;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
        this.idclass_pj = idclass_pj;
        this.permission = permission;
    }

    @Override
    public String toString() {
        return this.iduser + " , " + this.name + " , " + this.birthday + " , " + this.address
                + " , " + this.yearschool + " ," + this.phone + " , " + this.email + " ," + this.username + " , "
                + this.password + " , " + this.idclass_pj + " , " + this.permission;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearschool() {
        return yearschool;
    }

    public void setYearschool(int yearschool) {
        this.yearschool = yearschool;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdclass_pj() {
        return idclass_pj;
    }

    public void setIdclass_pj(String idclass_pj) {
        this.idclass_pj = idclass_pj;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

}
