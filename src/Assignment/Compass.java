package Assignment;

import java.util.Scanner;

public class Compass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double THETA = 22.5;
        System.out.println("Enter angle from north(0-360): ");
        double angle = scan.nextDouble();
        if(angle<=THETA){
            System.out.println("N");
        }
        else if(angle>THETA && angle<THETA*3){
            System.out.println("NE");
        }
        else if(angle>=3*THETA && angle<=5*THETA){
            System.out.println("E");
        }
        else if(angle>5*THETA && angle<7*THETA){
            System.out.println("SE");
        }
        else if(angle>=7*THETA && angle<=9*THETA){
            System.out.println("S");
        }
        else if(angle>9*THETA && angle<11*THETA){
            System.out.println("SW");
        }
        else if(angle>=11*THETA && angle<=13*THETA){
            System.out.println("W");
        }
        else if(angle>13*THETA && angle<15*THETA){
            System.out.println("NW");
        }
        else if(angle>=15){
            System.out.println("N");
        }
    }
}
