package Assignment;

import java.util.Scanner;

public class CompareThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();
        System.out.print("Input third number: ");
        int third = scanner.nextInt();
        if(first == second && second == third){
            System.out.println("all the same.");
        }
        else{
            System.out.println("all different.");
        }
    }
}
