package day7_feb_07;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class MembersView {
    static Library library;

    MembersView(Library library){
        MembersView.library = library;
    }
    public static void mainMenu(Library library, String user){
        System.out.println("Correct Entries Are 1,2,3,4,5,6,7");

        System.out.println("1: Display a book \n2: Display all books \n3: search book \n4: View number of books borrowed\n5: View books borrowed and Returned\n6: Membership details \n7: Change Password \n8: Exit");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7") || input.equals("8")){
            MembersView.nextStepsMember(input, library, user);
        }else{
            System.out.println("Incorrect Input");
            mainMenu(library, user);
        }
    }

    public static void numberOfBooksBorrowed(String user){
        System.out.println("Books Borrowed----");
        ArrayList<String> booksBorrowed = new ArrayList<>();
        int numberOfBooksBorrowed = 0;
        for(User person: library.getUsers()){
            if(person.toString().equalsIgnoreCase(user)){
               booksBorrowed = person.findBooksBorrowed();
            }
        }
        numberOfBooksBorrowed = booksBorrowed.size();
        System.out.println(numberOfBooksBorrowed+" Books Borrowed:");
        for(String books: booksBorrowed){
            System.out.println(books);
        }
    }
    public static void numberOfBooksBorroweAndReturned(String user){
        System.out.println("Books Borrowed and Returned----");
        numberOfBooksBorrowed(user);
        ArrayList<String> booksReturned = new ArrayList<>();
        int numberOfBooksReturned= 0;
        for(User person: library.getUsers()){
            if(person.toString().equalsIgnoreCase(user)){
                booksReturned = person.findBooksReturned();
            }
        }
        numberOfBooksReturned = booksReturned.size();
        System.out.println(numberOfBooksReturned+" Books Returned:----");
        for(String books: booksReturned){
            System.out.println(books);
        }
    }
    public static void membershipDetails(String user){
        for(User person: library.getUsers()){
            if(person.toString().equalsIgnoreCase(user)){
                System.out.println(person.userDetails());
                System.out.println("Password: "+person.getPassword());
            }
        }
    }
    public static void changePassword(String user){
        System.out.println("What would you like to change your password to?");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        for(User person: library.getUsers()){
            if(person.toString().equalsIgnoreCase(user)){
                person.setPassword(password);
                System.out.println(person.userDetails());
                System.out.println("Password: "+person.getPassword());
            }
        }
    }
    public static void nextStepsMember(String input, Library library, String user){
        Scanner scanner = new Scanner(System.in);
        switch(input){
            case "1":
                library.displaySingleBookDetails();
                //display a book
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){

                    mainMenu(library, user);
                }
                break;
            case "2":
                library.displayBooks();
                //display all books
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    mainMenu(library, user);
                }
                break;
            case "3":
                library.searchBook();
                //search based on genre/ isbn/ author/ year of publication
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    mainMenu(library, user);
                }
                break;
            case "4":
                //number of books borrowed
                numberOfBooksBorrowed(user);
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    mainMenu(library, user);
                }
                break;
            case "5":
                //number of books borrowed and returned
                numberOfBooksBorroweAndReturned(user);
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    mainMenu(library, user);
                }
                break;
            case "6":

                //membership details
                membershipDetails(user);
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    mainMenu(library, user);
                }
                break;
            case "7":
                //password change
                changePassword(user);
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    mainMenu(library, user);
                }
                break;
            case "8":
                //password change
                System.exit(0);
        }
    }
}
