package day11_feb_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5 {
    public static void main(String[] args) {
        //splits up the string and returns the substring that match the pattern
        Pattern pat2 = Pattern.compile("[a-z]+");
        Matcher mat2 = pat2.matcher("Z ZZ ZZZ Zebra hello world java");
        while(mat2.find()){
            System.out.println("Match: "+mat2.group());
        }
    }

}
