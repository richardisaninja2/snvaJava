package day7_feb_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F.Scott", "12345", "Drama", "in-stock");
        Book book2 = new Book("To kill a mockingbird", "HarperLee", "12344", "Thriller", "in-stock" );
        Book book3 = new Book("The pride and Predjudice", "Jane Austen", "12334", "Satire", "borrowed");
        Book book4 = new Book("Diary of a wimpy kid", "someone", "12335", "Satire", "borrowed");

        Library library = getLibrary(book1, book2, book3,book4);
        MembersView membersView = new MembersView(library);
        LoginImpl login = new LoginImpl(library);

//      library.displayBooks();
//      library.displayUsers();
//        LoginInterface login = new LoginImpl(library);
        LoginImpl.askForLogin();
        System.out.println("Hi Welcome to the Library");
        System.out.println("What Would You Like to Do");
    }


    private static Library getLibrary(Book book1, Book book2, Book book3, Book book4) {
        User user1 = new User("bala123", "Bala", "123 bala Lane", "123-456-1234", new ArrayList<>(Arrays.asList("The Great Gatsby", "To Kill a Mockingbird")), new ArrayList<>(Arrays.asList()));
        User user2 = new User("bob345", "Bob", "456 Bob Way", "345-678-1234",  new ArrayList<>(Arrays.asList("The Great Gatsby")), new ArrayList<>(Arrays.asList()));
        User user3 = new User("billy12", "Billy", "678 Billy Drive", "132-432-5342", new ArrayList<>(Arrays.asList("Pride and Prejudice")), new ArrayList<>(Arrays.asList()));

        return new Library(new ArrayList<Book>(Arrays.asList(book1, book2, book3, book4)), new ArrayList<User>(Arrays.asList(user1,user2, user3)) );
    }

}
