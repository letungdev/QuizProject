/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author TMK_PLAN4
 */
public class TestRoom {
    private String roomID;
    private String roomname;
    private int status;
    public  TestRoom(){}
    public  TestRoom(String roomID, String roomname, int status){
        this.roomID=roomID;
        this.roomname=roomname;
        this.status=status;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
