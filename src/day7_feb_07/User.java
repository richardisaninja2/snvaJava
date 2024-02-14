package day7_feb_07;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String userId;
    private String name;
    private String address;
    private String mobileNo;
    private String Password = "qwerty";

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private ArrayList<String> booksBorrowed;
    private ArrayList<String> booksReturned;


    public User(String userId, String name, String address, String mobileNo, ArrayList<String> booksBorrowed, ArrayList<String> booksReturned){
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.booksBorrowed = booksBorrowed;
        this.booksReturned = booksReturned;


    }
    User(Library library){

    }
    public String userDetails(){
        return " User Details: \nName:" + name +"\nUserId: "+userId+"\nAddress: "+address+"\nMobile Number: "+mobileNo+"\nBooks Borrowed: "+booksBorrowed+"\nBooks Returned: "+booksReturned;
    }
    public String getUsername(){
        return userId;
    }
    public ArrayList<String> findBooksBorrowed(){
        ArrayList<String> booksBorrowedList = new ArrayList<>();
        for(int i = 0; i<booksBorrowed.size(); i++){
           booksBorrowedList.add( booksBorrowed.get(i));
//            System.out.println(booksBorrowed.get(i));
        }
        return booksBorrowedList;
    }
    public ArrayList<String> findBooksReturned(){
        ArrayList<String> booksReturnedList = new ArrayList<>();
        //            System.out.println(booksReturned.get(i));
        booksReturnedList.addAll(booksReturned);
        return booksReturnedList;
    }

    @Override
    public String toString() {
        return name;
    }
}
