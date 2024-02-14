package day7_feb_07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
            System.out.println(book.toString());
        }
        System.out.println();
    }
    public void displayAvailableBooks(){
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).toString().contains("in-stock")){
                System.out.println(books.get(i));
            }
        }
    }
    public void displayBorrowedBooks(){
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).toString().contains("borrowed")){
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

        System.out.println("");
        System.out.println("input book to remove");
        System.out.println("Books you can remove are");
        for(Book books: books){
            System.out.println(books.toString());
        }
        Scanner scanner = new Scanner(System.in);

        String bookToRemove = scanner.nextLine().toLowerCase();
           for(int i = 0; i<books.size(); i++){
               if(books.get(i).toString().toLowerCase().contains(bookToRemove)){
                   books.remove(i);
                   break;
               }else{
                   System.out.println("Book Not Found.. Please Try Again ----");
                   removeBook();
               }
           }
            displayBooks();
    }
    public void searchBook(){
        System.out.println("What book or books are you searching for?");
        System.out.println("You can search based on genre/ISBN, author, or year of publication");
        Scanner scanner = new Scanner(System.in);
        String bookSearched = scanner.nextLine().toLowerCase();
        int booksFound = 0;
        ArrayList<String> bookResults = new ArrayList<>();

        for(Book book: books){
            if(book.bookDetails().toLowerCase().contains(bookSearched)){
                System.out.println(book.bookDetails());
                System.out.println("-------------------------------");
                bookResults.add(book.bookDetails());
                booksFound += 1;
            }
        }
        if(booksFound < 1){
            System.out.println("Sorry your search didn't have any results");
        }
//        for (String results: bookResults){
//            System.out.println(results);
//        }

    }
    public void displaySingleBookDetails(){
        System.out.println("Which book would you like details for?");
        for(Book book: books){
            System.out.println(book.toString());
        }
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine().toLowerCase();
        for(int i = 0; i<books.size(); i++){
            if(!books.get(i).toString().toLowerCase().contains(book)){
                System.out.println("Book Not Found Please Try Again----");
                displaySingleBookDetails();
            }
            if(books.get(i).toString().toLowerCase().contains(book) && book.split(" ").length > 1){
                System.out.println(books.get(i).bookDetails());
                break;
            }
            //find a way to make the method run again if book not found
        }


    }
    public void removeUser(){

        System.out.println("input user to remove");
        System.out.println("Available members to remove are");
        for(int i = 0; i<users.size(); i++){
            System.out.println(users.get(i));
        }
        Scanner scanner = new Scanner(System.in);

        String userToRemove = scanner.nextLine().toLowerCase();
        for(int i = 0; i<users.size(); i++){
            if(users.get(i).toString().toLowerCase().equals(userToRemove)){
                users.remove(i);
                break;
            }else{
                System.out.println("Member Not Found.. Please Try Again ----");
                removeUser();
            }
        }
        displayUsers();
    }

    public void displayUserDetails(){

        System.out.println("Enter Users Name");
        System.out.println("Users Available:");
        for(int i = 0; i<users.size(); i++){
            System.out.println(users.get(i).toString());
        }
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine().toLowerCase();
        for(User member: users){
            System.out.println(member.toString());
            if(member.toString().equalsIgnoreCase(user)){
                System.out.println(member.userDetails());
                break;
            }else{
                System.out.println("Member Not Found.. Please Try Again ----");
                displayUserDetails();
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

        ArrayList<String> booksBorrowed = new ArrayList<>();





        User newUser = new User(userId, name, address, phoneNumber, askForBook( booksBorrowed), returnedBooks());
        users.add(newUser);
        System.out.println("Here are all the users");
        for(User users: users){
            System.out.println(users.toString());
        }
    }
    public static ArrayList<String> returnedBooks(){
        System.out.println("enter the names of books returned.. press 'n' then enter when done");
        ArrayList<String> booksBorrowed = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String borrowed = scanner.nextLine();
        ArrayList<String> returned = new ArrayList<>();
        while(!borrowed.equals("n")){
            borrowed = scanner.nextLine();
            returned.add(borrowed);
        }


        return returned;
    }
    //fix so it saves more than 1
    public static ArrayList<String> askForBook(ArrayList<String> booksBorrowed){
        System.out.println("enter the names of books borrowed.. press 'n' then enter when done");
        Scanner scanner = new Scanner(System.in);
        String borrowed = scanner.nextLine();
        while(!borrowed.equals("n")){
            booksBorrowed.add(borrowed);
            borrowed = scanner.nextLine();

        }


        return booksBorrowed;
    }

    public void displayUsers(){
        System.out.println("Library Users:");
        for(User user: users){
            System.out.println(user.toString());
        }
    }
    public ArrayList<User> getUsers(){
        //        System.out.println(usersArrayList);
        return new ArrayList<>(users);
    }
    public ArrayList<String> getUserId(){
        ArrayList<String> userUserId = new ArrayList<>();
        for(User user: users){
            userUserId.add(user.getUsername());
        }
        return getUserId();
    }
}
