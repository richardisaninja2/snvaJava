package day9_feb_09;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {

        exceptionHandling();

        }
    public static void exceptionHandling() throws Exception{
        System.out.println("Input a number");
        try {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = 42 / a;
            System.out.println("a = " + a);
            try { // nested try block
                if (a == 1) {
                    a = a / (a - a);
                } // division by zero
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99; // generate an out-of-bounds exception
                }
            }catch(IndexOutOfBoundsException w){
                System.out.println("please a number that is inbounds");
                exceptionHandling();
            }catch(ArithmeticException e){
                System.out.println("Arithmethmetic exception... dividing by zero");
                exceptionHandling();
            }
        }catch(Exception e){

        }//inner try } //outer try
    }
}
