import javax.sound.midi.Soundbank;
import java.sql.PseudoColumnUsage;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {

    private char[][] choiceArr = {
            {'0', '1', '2'},
            {'3', '4', '5'},
            {'6', '7', '8'},
    };

    private String playerOneChoice;
    private String playerTwoChoice;


    Scanner sc;

    public Game() {
        this.sc = new Scanner(System.in);
    }


    public void start() {
        System.out.println("==========*** Welcome to the Tic Tac Toe ***==========");
        System.out.println("This is two player game.");
        System.out.println("Either of them can Who win Toss can choose: ");
        System.out.println(" X  or  O ");
        System.out.println("Enter First Player Name:");
        String firstPlayerName = sc.nextLine();
        System.out.println("Enter Second player Name:");
        String secondPlayerName = sc.nextLine();
        System.out.println("Can i do Toss ? (Y/N)");
        String tossDecison = sc.nextLine();
        int tossNo = 0;
        if (tossDecison.equalsIgnoreCase("Y")) {
            tossNo = (Math.random() <= 0.5) ? 1 : 2;
            switch (tossNo) {
                case 1 -> System.out.println(firstPlayerName + " won the toss.");
                case 2 -> System.out.println(secondPlayerName + " won the toss.");
            }
        } else if (tossDecison.equalsIgnoreCase("N")) {
            System.out.println("Toss canceled.");
        } else {
            System.out.println("You entered wrong input.");
        }
        System.out.println("Which Option Do you want to choose: X or O ");
        String choiceChar = sc.nextLine();
        if (choiceChar.equalsIgnoreCase("O")) {

        }


//        for (int i = 0; i < choiceArr.length; i++) {
//            for (int j = 0; j < 3; j++) {
//                switch (j){
//                    case 0 ->{
//                        System.out.print("    "+choiceArr[i][j]+"   ");
//                    }
//                    case 1 ->{
//                        System.out.print("|   "+choiceArr[i][j]+"   |");
//                    }
//                    case 2->{
//                        System.out.print("   "+choiceArr[i][j]+"    ");
//                    }
//                }
//            }
//            System.out.println();
//            if(i==0 || i==1){
//                System.out.println("--------+-------+---------");
//            }
//
//        }


    }

}
