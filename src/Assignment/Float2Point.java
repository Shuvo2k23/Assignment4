package Assignment;

import java.util.Scanner;

public class Float2Point {
    public static void main(String[] args) {
        double first,second;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter two numbers: ");
        first = scanner.nextDouble();
        second = scanner.nextDouble();
        if(Math.abs(first-second)<=.001){
            System.out.println("They are the same up to two decimal places");
        }
        else{
            System.out.println("They are different.");
        }
    }
}
