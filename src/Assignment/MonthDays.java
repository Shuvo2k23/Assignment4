package Assignment;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        System.out.println(" Enter a month (1 for January, 2 for February, etc.): ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input==2){
            System.out.println("28 days.");
        }
        else if(input%2==0 || input ==7){
            System.out.println("31 days.");
        }
        else{
            System.out.println("30 days.");
        }
    }
}
