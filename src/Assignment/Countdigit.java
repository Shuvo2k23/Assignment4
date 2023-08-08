package Assignment;

import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        input = scan.nextInt();
        if(input<0){
            input = input *(-1);
        }
        int count = 0;
        if(input>=1000000000){
            count = 10;
        }
        else if(input>=100000000){
            count = 9;
        }
        else  if(input>=10000000){
            count = 8;
        }
        else  if(input>=1000000){
            count = 7;
        }
        else  if(input>=100000){
            count = 6;
        }
        else  if(input>=10000){
            count = 5;
        }
        else  if(input>=1000){
            count = 4;
        }
        else  if(input>=100){
            count = 3;
        }
        else  if(input>=10){
            count = 2;
        }
        else  if(input>=0){
            count = 1;
        }
        System.out.println(input+ " has "+ count + " digits.");
    }
}
