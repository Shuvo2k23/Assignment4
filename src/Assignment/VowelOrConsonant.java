package Assignment;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String input = scanner.next();
        if(input.length()>1){
            System.out.println("Invalid input.");
        }
        else{
            Character letter = input.charAt(0);
            if (letter>='a') {
                letter = (char)(letter - 32);
            }
            if(letter == 'A' || letter == 'E' || letter == 'I'
            || letter == 'O' || letter == 'U'){
                System.out.println(letter + " is Vowel.");
            }
            else{
                System.out.println(letter + " is Consonant.");
            }
        }

    }
}
