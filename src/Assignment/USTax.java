package Assignment;

import java.util.Scanner;

public class USTax {
    public static final double LEVEL1 = 0.01;
    public static final double LEVEL2 = 0.02;
    public static final double LEVEL3 = 0.03;
    public static final double LEVEL4 = 0.04;
    public static final double LEVEL5 = 0.05;
    public static final double LEVEL6 = 0.06;

    public static void main(String[] args) {
        System.out.print("Enter income: ");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        double tax = 0;
        double taxable;
        if(income>=500000){
             taxable = income - 500000;
            tax = tax+ taxable*LEVEL6;
        }
        if(income>250000){
            if(income>=500000){
                taxable = 500000 - 250000;
            }
            else{
                taxable = income - 250000;
            }
            tax  = tax + taxable*LEVEL5;
        }
        if(income>100000){
            if(income>=250000){
                taxable = 250000 - 100000;
            }
            else{
                taxable = income - 100000;
            }
            tax  = tax + taxable*LEVEL4;
        }
        if(income>75000){
            if(income>=100000){
                taxable = 100000 - 75000;
            }
            else{
                taxable = income - 75000;
            }
            tax  = tax + taxable*LEVEL3;
        }
        if(income>50000){
            if(income>=75000){
                taxable = 75000 - 50000;
            }
            else{
                taxable = income - 50000;
            }
            tax  = tax + taxable*LEVEL2;
        }
        if(true){
            if(income>=50000){
                taxable = 50000;
            }
            else{
                taxable = income;
            }
            tax  = tax + taxable*LEVEL1;
        }
        System.out.printf("Your payable tax is: %.2f",tax);
    }
}
