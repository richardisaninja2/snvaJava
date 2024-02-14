package day11_feb_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches(); // match check will be done here

        System.out.println("Testing java against java");
        if(found){
            System.out.println("it matches");
        }else{
            System.out.println("doesnt match");
        }
    }
}
