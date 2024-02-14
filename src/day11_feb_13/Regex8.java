package day11_feb_13;

import java.util.regex.Pattern;

public class Regex8 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[ ,.]");
        String strs[] = pat.split("hello world,how are you today.?");
        for(int ctr = 0; ctr<strs.length; ctr++){
            System.out.println("Token "+ctr + " :"+strs[ctr]);
        }
    }
}
