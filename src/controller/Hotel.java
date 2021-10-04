package controller;

import model.Order;
import model.Room;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    ArrayList<User> userList = new ArrayList<>();
    ArrayList<Room> roomList = new ArrayList<>();
    ArrayList<Order> orders =  new ArrayList<>();

    public void addNewRoom(Room room){
        roomList.add(room);
    }

    public long getAllTotal(){
        long total=0;
        for (Order order: orders
             ) {
            total+=order.getTotalPrice();
        }
        return total;
    }
    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public Hotel(ArrayList<User> userList, ArrayList<Room> roomList) {
        this.userList = userList;
        this.roomList = roomList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
}
