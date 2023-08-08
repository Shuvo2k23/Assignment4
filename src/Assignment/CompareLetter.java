package Assignment;

import java.util.Scanner;

public class CompareLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.next();
        if(input.charAt(0)==input.charAt(input.length()-1)){
            System.out.println("first and last letter same.");
        }
        else{
            System.out.println("first and last letter different.");
        }
    }
}
