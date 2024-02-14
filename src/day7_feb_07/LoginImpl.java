package day7_feb_07;

import java.util.Scanner;

public class LoginImpl{
    static Library library;
    LoginImpl(Library library){
        LoginImpl.library = library;
    }

    public static void askForLogin() {

        System.out.println("Hello Welcome to the Library");
        System.out.println("Please Login to View Your Menu");
        System.out.println("What Would you Like To Login As?");
        System.out.println("input `librarian` for librarian and anything else for member");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine().toLowerCase();

//        String password = scanner.nextLine();
        if(username.contains("librarian")){
            checkLoginLibrarian();
        }else{
            checkLoginMember();
        }
    }
    public static void checkLoginLibrarian(){
        //get all users
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input username");
        String usernameInput = scanner.nextLine();
        System.out.println("Please input password");
        String passwordInput = scanner.nextLine();

        String librarianUsername = "librarian123";
        String librarianPassowrd = "qwerty";

        if(usernameInput.equals(librarianUsername.toLowerCase()) && passwordInput.equals(librarianPassowrd)){
            //Hello Member
            System.out.println("Welcome Librarian");
            LibrarianView.mainMenu(library);
            //insert librarian view
        }else{
                checkLoginLibrarian();
//            checkLoginLibrarian(username,password);
        }
    }
    public static void checkLoginMember(){
//        String memberUsername = "member123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input username");
        String usernameInput = scanner.nextLine();
        System.out.println("Please input password");
        String passwordInput = scanner.nextLine();

        String memberPassoword = "qwerty";
        String member = "";
        for(User user: library.getUsers()){
            if(passwordInput.toLowerCase().equals(memberPassoword) && usernameInput.equals(user.getUsername().toLowerCase())){
                //Hello Member
                member = user.toString();
                System.out.println("Hello "+member);
                MembersView.mainMenu(library, member);

            }else{
                System.out.println("Username not valid... Please try again");
                askForLogin();
            }
        }
    }
}
