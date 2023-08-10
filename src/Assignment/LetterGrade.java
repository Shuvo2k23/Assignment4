package Assignment;

import java.util.Scanner;

public class LetterGrade {
    private String letterGrade;
    public String getLetterGrade(double grade){
        if(grade==4){
            letterGrade = "A";
        }
        else if (grade==3.7){
            letterGrade = "A-";
        }
        else if(grade==3.3){
            letterGrade = "B+";
        }
        else if(grade==3){
            letterGrade = "B";
        }
        else if(grade>=2.7){
            letterGrade = "B-";
        }
        else if(grade==2.3){
            letterGrade = "C+";
        }
        else if(grade==2){
            letterGrade = "C";
        }
        else if(grade>=1.7){
            letterGrade = "C-";
        }
        else if(grade==1.3){
            letterGrade = "D+";
        }
        else if(grade==1){
            letterGrade = "D";
        }
        else if(grade>=0.7){
            letterGrade = "D-";
        }
        else if(grade ==0){
            letterGrade = "F";
        }
        return letterGrade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numaric grade(0.0-4.0): ");
        double input = scanner.nextDouble();
        LetterGrade letterGrade1 = new LetterGrade();
        System.out.println("The letter grade is: "+letterGrade1.getLetterGrade(input));
    }

}
