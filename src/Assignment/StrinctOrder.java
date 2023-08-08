package Assignment;

import java.util.Scanner;

public class StrinctOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write S for strict or L for lenient");
        String type = scanner.next();
        System.out.print("Input three numbers one by one: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        if(type.equals("L")){
            if(first<=second && second<=third){
                System.out.println("Increasing.");
            }

            else if(first>=second && second>=third){
                System.out.println("Decreasing.");
            }
            else {
                System.out.println("Neither.");
            }
        }
        else{
            if(first<second && second<third){
                System.out.println("Increasing.");
            }

            else if(first>second && second>third){
                System.out.println("Decreasing.");
            }
            else {
                System.out.println("Neither.");
            }
        }
    }
}
