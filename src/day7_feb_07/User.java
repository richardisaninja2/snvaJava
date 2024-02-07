package day7_feb_07;

import java.util.ArrayList;

public class User {
    private String userId;
    private String name;
    private String address;
    private String mobileNo;
    private ArrayList<String> booksBorrowed;

    public User(String userId, String name, String address, String mobileNo, ArrayList<String> booksBorrowed){
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.booksBorrowed = booksBorrowed;

    }
    public String userDetails(){
        return " User Details: \nName:" + name +"\nUserId: "+userId+"\nAddress: "+address+"\nMobile Number: "+mobileNo+"\nBooks Borrowed: "+booksBorrowed;
    }

    @Override
    public String toString() {
        return name;
    }
}
