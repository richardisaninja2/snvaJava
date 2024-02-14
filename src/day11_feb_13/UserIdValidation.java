package day11_feb_13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserIdValidation {
    public static void main(String[] args) {
        usernameValidator();

    }
    public static void usernameValidator(){
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
//        String str = "asgsgcge_1!";
        String regex = "^[A-Za-z][A-Za-z0-9_]{7,29}";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(username);

        if(mat.find()){
            System.out.println("valid username");
        }else{
            System.out.println("invalid username");
        }


    }
}
