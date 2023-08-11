package Assignment;

import java.util.Scanner;

public class PayCheck {
    public static void main(String[] args) {
        final double OVERTIME_BONUS = 1.5;
        System.out.print("Enter your salary per hour: ");
        Scanner scanner = new Scanner(System.in);
        double per_hour = scanner.nextDouble();
        System.out.println("How many work per week: ");
        double workHour = scanner.nextDouble();
        double totalSalary;
        if(workHour<=40){
            totalSalary = workHour*per_hour;
        }
        else{
            totalSalary = workHour*40;
            totalSalary = totalSalary + (workHour-40)*OVERTIME_BONUS*workHour;
        }
        System.out.println("Total salary: "+totalSalary);
    }
}
