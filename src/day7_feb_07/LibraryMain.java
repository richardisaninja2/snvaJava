package day7_feb_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F.Scott", "12345", "Drama", "available");
        Book book2 = new Book("To kill a mockingbird", "HarperLee", "12344", "Thriller", "available" );
        Book book3 = new Book("The pride and Predjudice", "Jane Austen", "12334", "Satire", "unavailable");
        Book book4 = new Book("Diary of a wimpy kid", "someone", "12335", "Satire", "unavailable");

        Library library = getLibrary(book1, book2, book3);
        library.displayBooks();
        library.displayUsers();


        System.out.println("Hi Welcome to the Library");
        System.out.println("What Would You Like to Do");
        mainMenu(library);
    }
    public static void mainMenu(Library library){
        System.out.println("Correct Entries Are 1,2,3,4,5");
        System.out.println("1: Add Book \n2: remove Book \n3: register Member\n4: Remove Member\n5: Display Available Books\n6: Display Borrowed Books\n7: Display Member Details");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7")){
            nextSteps(input, library);
        }else{

            System.out.println("Incorrect Input");
            mainMenu(library);
        }
    }
    public static void nextSteps(String input, Library library){
        Scanner scanner = new Scanner(System.in);
//        if(input.equals("1")){
//            library.addBook();
//            mainMenu(library);
//        }
        switch(input){
            case "1":
                library.addBook();
                if(scanner.hasNext()){
                    mainMenu(library);
                }

                break;
            case "2":
                library.removeBook();
                if(scanner.hasNext()){
                    mainMenu(library);
                }
                break;

            case "3":
                library.registerMember();
                if(scanner.hasNext()){
                    mainMenu(library);
                }
                break;
            case "4":
                library.removeUser();
                if(scanner.hasNext()){
                    mainMenu(library);
                }
                break;
            case "5":
                library.displayAvailableBooks();
                if(scanner.hasNext()){
                    mainMenu(library);
                }
                break;
            case "6":
                library.displayBorrowedBooks();
                if(scanner.hasNext()){
                    mainMenu(library);
                }
            case "7":
                library.displayUserDetails();
                if(scanner.hasNext()){
                    mainMenu(library);
                }

        }

    }

    private static Library getLibrary(Book book1, Book book2, Book book3) {
        User user1 = new User("bala123", "Bala", "123 bala Lane", "123-456-1234", new ArrayList<>(Arrays.asList("The Great Gatsby", "To Kill a Mockingbird")));
        User user2 = new User("bob345", "Bob", "456 Bob Way", "345-678-1234",  new ArrayList<>(Arrays.asList("The Great Gatsby")));
        User user3 = new User("billy12", "Billy", "678 Billy Drive", "132-432-5342", new ArrayList<>(Arrays.asList("Pride and Prejudice")));

        return new Library(new ArrayList<Book>(Arrays.asList(book1, book2, book3)), new ArrayList<User>(Arrays.asList(user1,user2, user3)) );
    }

}
