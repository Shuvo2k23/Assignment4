package Assignment;

import java.util.Scanner;

public class Grade {
    private double numberGrade;
    public double getNumericGrade(String input){
        Character grade = input.charAt(0);
        Character sign;

        if(grade=='A'){
            numberGrade = 4;
        }
        else if(grade == 'B'){
            numberGrade = 3;
        }
        else if(grade == 'C'){
            numberGrade = 2;
        }
        else if (grade == 'D'){
            numberGrade = 1;
        }
        else{
            numberGrade = 0;
        }
        if(input.length()>1){
            sign = input.charAt(1);
            if(sign =='+' && grade!='A'){
                numberGrade = numberGrade +0.3;
            }
            else if(sign == '-'){
                numberGrade = numberGrade - 0.3;
            }
        }
        return numberGrade;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input letter grade: ");
        String input = scanner.next();
        Grade grade = new Grade();
        double numberGrade = grade.getNumericGrade(input);
        System.out.println("Numarical grade: "+numberGrade);
    }
}
