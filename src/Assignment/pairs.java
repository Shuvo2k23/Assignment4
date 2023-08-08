package Assignment;

import java.util.Scanner;

public class pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input four numbers one by one: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        if(first == second && third == fourth){
            System.out.println("two pairs.");
        }
        else if(first== third && second == fourth){
            System.out.println("two pairs.");
        }
        else if(first == fourth && second == third){
            System.out.println("two pairs.");
        }
        else{
            System.out.println("not two pairs.");
        }
    }
}
