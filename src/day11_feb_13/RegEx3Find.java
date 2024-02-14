package day11_feb_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3Find {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Hello");
        Matcher mat = pat.matcher("Hello World!! Hello Sam");

        while(mat.find()){
            System.out.println("Hello found at "+mat.start());
        }
    }
}
