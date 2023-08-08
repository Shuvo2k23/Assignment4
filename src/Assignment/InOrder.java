package Assignment;

import java.util.Scanner;

public class InOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input three numbers one by one: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if(first<=second && second<=third){
            System.out.println("In order.");
        }
        else if(first>=second && second>=third) {
            System.out.println("In order.");
        }
        else {
            System.out.println("Not in order.");
        }
    }
}
