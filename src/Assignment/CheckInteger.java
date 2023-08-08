package Assignment;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        input = scan.nextInt();
        if(input<0){
            System.out.println(input+" is a negative number.");
        }
        else if(input == 0){
            System.out.println(input+" is Zero.");

        }
        else{
            System.out.println(input+" is a positive number.");
        }
    }
}
