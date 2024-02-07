package day7_feb_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library(ArrayList<Book> books, ArrayList<User> users){
        this.books = books;
        this.users = users;
    }
    public void displayBooks(){
        System.out.println("Library Books");
        for(Book book: books){
            System.out.println(book.display());
        }
        System.out.println();
    }

    public void displayAvailableBooks(){
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).toString().equals("available")){
                System.out.println(books.get(i));
            }
        }
    }
    public void displayBorrowedBooks(){
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).toString().contains("unavailable")){
                System.out.println(books.get(i));
            }
        }

    }
    public void addBook(){
        System.out.println("Enter book name to add");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter book name");
        String name = scanner.nextLine();
        System.out.println("enter book author");
        String author = scanner.nextLine();
        System.out.println("enter book isbn");
        String isbn = scanner.nextLine();
        System.out.println("enter book genre");
        String genre = scanner.nextLine();
        String availability = "available";

        Book newBook = new Book(name, author, isbn, genre, availability);
        books.add(newBook);

        System.out.println("Here are all the books");
        displayBooks();
    }
    public void removeBook(){

        System.out.println("input book to remove");
        Scanner scanner = new Scanner(System.in);

        String bookToRemove = scanner.nextLine();
           for(int i = 0; i<books.size(); i++){
               if(books.get(i).toString().toLowerCase().equals(bookToRemove)){
                   books.remove(i);
               }
           }
            displayBooks();
    }
    public void removeUser(){

        System.out.println("input user to remove");
        Scanner scanner = new Scanner(System.in);

        String userToRemove = scanner.nextLine();
        for(int i = 0; i<users.size(); i++){
            if(users.get(i).toString().toLowerCase().equals(userToRemove)){
                users.remove(i);
            }
        }
        displayUsers();
    }

    public void displayUserDetails(){

        System.out.println("Enter Users Name");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine().toLowerCase();
        for(User member: users){
            if(member.toString().toLowerCase().equals(user)){
                System.out.println(member.userDetails());
            }

        }
    }
    public void registerMember(){
        System.out.println("Enter Username");
        Scanner scanner = new Scanner(System.in);
        String userId = scanner.nextLine();
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        System.out.println("Phone Number");
        String phoneNumber = scanner.nextLine();
        System.out.println("enter the names of books borrowed.. press 'n' then enter when done");
        ArrayList<String> booksBorrowed = new ArrayList<>();
        String borrowed = scanner.nextLine();



        User newUser = new User(userId, name, address, phoneNumber, askForBook( booksBorrowed));
        users.add(newUser);
        System.out.println("Here are all the users");
        displayUsers();
    }
    //fix so it saves more than 1
    public static ArrayList<String> askForBook(ArrayList<String> booksBorrowed){
        Scanner scanner = new Scanner(System.in);
        String borrowed = scanner.nextLine();
        if(borrowed.equals("n")){
            return booksBorrowed;
        }
        else{
            booksBorrowed.add(borrowed);
            askForBook(booksBorrowed);
        }


        return booksBorrowed;
    }

    public void displayUsers(){
        System.out.println("Library Users");
        for(User user: users){
            System.out.println(user.userDetails());
        }
        System.out.println();
    }
}
