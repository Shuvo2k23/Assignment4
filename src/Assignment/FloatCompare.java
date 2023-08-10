package Assignment;

import java.util.Scanner;

public class FloatCompare {
    public static void main(String[] args) {
        double first,second,third;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three numbers: ");
        first = scanner.nextDouble();
        second = scanner.nextDouble();
        third = scanner.nextDouble();
        double maximum = Math.max(first,Math.max(second,third));
        System.out.println("The largest number is "+maximum);
    }
}
