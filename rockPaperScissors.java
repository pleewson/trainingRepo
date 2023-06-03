import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        Random rn = new Random();

        int computer = rn.nextInt(3)+1;
        int player = 0;


        String computerVal;
           System.out.println("Rock, paper, scissors  3.2.1...");
        String playerVal = scan.next().toLowerCase();



        if(playerVal.equals("rock")){
            player = 1;
        }else if (playerVal.equals("paper")){
            player = 2;
        }else if (playerVal.equals("scissors")){
            player = 3;
        }else{
            System.out.println("incorrect input");
        }

        switch (computer) {
            case 1:
                computerVal = "Rock";
                break;
            case 2:
                computerVal = "Paper";
                break;
            case 3:
                computerVal = "Scissors";
                break;
            default: computerVal = "error";
            break;
        }


       //rock = 1;
        //paper = 2;
          //scissors = 3;

        if(player == 1 && computer == 3){
            System.out.println("Player - Rock" + "  Computer - " + computerVal);
            System.out.println("Player won!");
        }else if (player == 1 && computer == 1){
            System.out.println("Player - Rock"  + "  Computer - " + computerVal);
            System.out.println("Draw!");
        }else if (player == 1 && computer == 2) {
            System.out.println("Player - Rock" +  "  Computer - " + computerVal);
            System.out.println("Computer won!");

        }else if (player == 2 && computer == 1){
            System.out.println("Player - Paper" + "  Computer - " + computerVal);
            System.out.println("Player won!");
        }else if (player == 2 && computer == 2){
            System.out.println("Player - Paper" + "  Computer - " + computerVal);
            System.out.println("Draw!");
        }else if (player == 2 && computer == 3){
            System.out.println("Player - Paper" + "  Computer - " + computerVal);
            System.out.println("Computer won!");

        }else if (player == 3 && computer == 2){
            System.out.println("Player - Scissors" + "  Computer - " + computerVal);
            System.out.println("Player won");
        }else if (player == 3 && computer == 3){
            System.out.println("Player - Scissors" + "  Computer - " + computerVal);
            System.out.println("Draw!");
        }else if (player == 3 && computer == 1){
            System.out.println("Player - Scissors" + "  Computer - " + computerVal);
            System.out.println("Computer won");
        }
    }
}


//rock      1             1>3>2>1
//paper     2
//scissors  3