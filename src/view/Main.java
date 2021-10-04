package view;

import controller.Hotel;
import model.Order;
import model.Room;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User cuong = new User("Tien Cuong", "2000", "01");
        User thai = new User("Thai", "2004", "02");
        ArrayList<User> users = new ArrayList<>();
        users.add(cuong);
        users.add(thai);

        Room r1 = new Room("TT0105", "VIP",100 );
        Room r2 = new Room("TT0205", "FAKE",50 );
        Room r3 = new Room("TT0305", "FAKE",70 );
        ArrayList<Room> rooms =new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        Hotel xuanAnh = new Hotel(users, rooms);
        Order orderOfThai = new Order();
        orderOfThai.setUser(thai);
        orderOfThai.setRoom(r1);
        orderOfThai.setCheckin(LocalDate.of(2021, 10, 1));
        orderOfThai.setCheckout(LocalDate.of(2021, 10, 3));
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(orderOfThai);

        xuanAnh.setOrders(orders);
        System.out.println(xuanAnh.getAllTotal());
        Order orderOfCuong = new Order();
        orderOfCuong.setUser(cuong);
        orderOfCuong.setRoom(r3);
        orderOfCuong.setCheckin(LocalDate.of(2021, 10, 4));
        orderOfCuong.setCheckout(LocalDate.of(2021, 10, 8));
        orders.add(orderOfCuong);
        System.out.println(xuanAnh.getAllTotal());
    }
}
