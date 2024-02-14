package day11_feb_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx6 {
    public static void main(String[] args) {
        String str = "A wise monkey is a monkey that doesnt monkey with other monkeys";
        String regex = "monkey";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(str);

        if(mat.find()){
            System.out.println("found a match");
        }else{
            System.out.println("a match not found");
        }
        while(mat.find()){
            System.out.println(mat.group() + " is matched from "+mat.start()+ " to "+ mat.end());
        }
    }
}
