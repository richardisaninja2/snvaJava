package day11_feb_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {
    public static Boolean isValidMobileNo(String str){
        //(0/1) -> 001 or 1 country code
        //6676767

        //{10} 10 digits total
        Pattern pat = Pattern.compile("(0/1)?[6-9][0-9]{9}");
        Matcher mat = pat.matcher(str);
        return(mat.find() && mat.group().equals(str));


    }
    public static void main(String[] args) {
        String str = "7979797979";
        if(isValidMobileNo(str)){
            System.out.println("valid mobile no");
        }else{
            System.out.println("invalid mobile no");
        }
    }
}
