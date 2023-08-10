package Assignment;

import java.util.Scanner;

public class Card {
    public String getDescription(String input){
        Character notation = input.charAt(0);
        if(notation == 'A' && input.length()==1){
            return "Ace";
        }
        else if(notation == 'J' && input.length()==1){
            return "Jack";
        }
        else if(notation == 'Q' && input.length()==1){
            return "Queen";
        }
        else if(notation == 'K' && input.length()==1){
            return "King";
        }
        else if(notation == 'D' && input.length()==1){
           return "Diamonds";
        }
        else if(notation == 'H' && input.length()==1){
            return "Hearts";
        }
        else if(notation == 'S' && input.length()==1){
            return "Spiders";
        }
        else if(notation == 'C' && input.length()==1){
            return "Club";
        }
        else if(notation>='2' && notation<='9' && input.length()==1){
            return input;
        }
        else if(input.equals("10")){
            return input;
        }
        else {
            return "Unknown";
        }

    }
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the card notation: ");
        input = scanner.next();
        Card card = new Card();
        System.out.println(card.getDescription(input));

    }
}
