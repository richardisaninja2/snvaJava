package day11_feb_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx7 {
    public static void main(String[] args) {
        String str = "A wise monkey is a monkey that doesnt monkey with other monkeys";
        String regex = "monkey";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(str);
        System.out.println(mat.replaceAll("donkey"));



        String str1 = "Jon Jonathan Frank Todd Mark";
        Pattern pat1 = Pattern.compile("Jon.*? ");
        Matcher mat1 = pat1.matcher(str1);

        System.out.println("origina sequence "+ str1);
        str1 = mat1.replaceAll("Sam ");

        System.out.println("replaced Sequence: "+str1);
    }
}
