package Assignment;

import java.util.Scanner;

public class CheckFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a floating point number: ");
        float input = scanner.nextFloat();
        if(input == 0.0){
            System.out.println("The number is Zero.");
        }
        else if(input<0.0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive.");
        }
    }
}
