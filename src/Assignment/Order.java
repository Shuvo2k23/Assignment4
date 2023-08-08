package Assignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input three numbers one by one: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if(first<=second && second<=third){
            System.out.println("Increasing.");
        }
        else if(first>=second && second>=third) {
            System.out.println("Decreasing.");
        }
        else {
            System.out.println("Neither.");
        }
    }
}
