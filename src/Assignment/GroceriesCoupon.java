package Assignment;

import java.util.Scanner;

public class GroceriesCoupon {
    public static void main(String[] args) {
        final double LEVEL1 = 0.08;
        final double LEVEL2 = 0.1;
        final double LEVEL3 = 0.12;
        final double LEVEL4 = 0.14;
        System.out.println("Please enter the cost of your groceries: ");
        Scanner scanner = new Scanner(System.in);
        double cost = scanner.nextDouble();
        double coupon = 0;
        if(cost>=210){
            coupon = cost*LEVEL4;
        }
        else if(cost>=150){
            coupon = cost*LEVEL3;
        }
        else if(cost>=60){
            coupon = cost*LEVEL2;
        }
        else if(cost>=10){
            coupon = cost*LEVEL1;
        }
        System.out.println("You win a discount coupon of $"+coupon);
    }
}
