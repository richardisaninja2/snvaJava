package day7_feb_07;

import java.util.Scanner;

public class LibrarianView {

    public static void mainMenu(Library library){

        System.out.println("1: Add a Book \n2: Remove Book \n3: Register Member \n4: Remove Member\n5: Display a Book\n6: Display All Books \n7: Display Available Books\n8: Display Borrowed Books\n9: Display A Members Details\n10: display all members\n11: Exit");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7") || input.equals("8") || input.equals("9") || input.equals("10") || input.equals("11")){
            LibrarianView.nextStepsLibrarian(input, library);
        }else{
            System.out.println("Incorrect Input");
            mainMenu(library);
        }
    }
    public static void nextStepsLibrarian(String input, Library library){
        Scanner scanner = new Scanner(System.in);
//        if(input.equals("1")){
//            library.addBook();
//            mainMenu(library);
//        }
        switch(input){
            case "1":
                library.addBook();
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    LibrarianView.mainMenu(library);
                }

                break;
            case "2":
                library.removeBook();
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    LibrarianView.mainMenu(library);
                }
                break;

            case "3":
                library.registerMember();
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    LibrarianView.mainMenu(library);
                }
                break;
            case "4":
                library.removeUser();
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    LibrarianView.mainMenu(library);
                }
                break;
            case "5":
                library.displaySingleBookDetails();
                //find a way to make the method run again if book not found
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()) {
                    LibrarianView.mainMenu(library);
                }
                break;
            case "6":
                //display all books
                library.displayBooks();
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()) {
                    LibrarianView.mainMenu(library);
                }
                break;
            case "7":
                library.displayAvailableBooks();
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    LibrarianView.mainMenu(library);
                }
                break;
            case "8":
                library.displayBorrowedBooks();
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    LibrarianView.mainMenu(library);
                }
            case "9":
                library.displayUserDetails();
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    LibrarianView.mainMenu(library);
                }
            case "10":
                library.displayUsers();
                System.out.println("Press enter to go back to the menu");
                if(scanner.nextLine().isEmpty()){
                    LibrarianView.mainMenu(library);
                }
            case "11":
                //password change
                System.exit(0);

        }

    }
}
