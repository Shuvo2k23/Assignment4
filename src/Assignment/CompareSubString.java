package Assignment;

import java.util.Scanner;

public class CompareSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.next();
        String first = input.substring(0,input.length()/2);
        String last;
        if(input.length()%2==0) {
            last = input.substring(input.length() / 2, input.length());
        }
        else{
             last = input.substring((input.length() / 2)+1, input.length());
        }
        //System.out.println(first+" and "+last);
        if(first.equals(last)){
            System.out.println("“first and second half same");
        }
        else{
            System.out.println("first and second half different");
        }
    }
}
