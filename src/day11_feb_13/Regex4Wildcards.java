package day11_feb_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4Wildcards {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("ZZ+");
        Matcher mat = pat.matcher("Z ZZ ZZZZZ ZZZZZZ");
        while(mat.find()){
            System.out.println("Match: "+mat.group());
        }

        //starts with an e and ends with a d
        //gets the whole string
        Pattern pat1 = Pattern.compile("e.+d");
        Matcher mat1 = pat1.matcher("end extend ");
        while(mat1.find()){
            System.out.println("Match: "+mat1.group());
        }

        //splits up the string and returns the substring that match the pattern
        Pattern pat2 = Pattern.compile("e.+?d");
        Matcher mat2 = pat2.matcher("end extend ");
        while(mat2.find()){
            System.out.println("Match: "+mat2.group());
        }
    }
}
