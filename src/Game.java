import javax.sound.midi.Soundbank;
import java.sql.PseudoColumnUsage;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {

    private String[][] choiceArr = {
            {"0", "1", "2"},
            {"3", "4", "5"},
            {"6", "7", "8"},
    };

    private String firstPlayerChoice;
    private String secondPlayerChoice;
    private String playersChoiceArr[] = {firstPlayerChoice, secondPlayerChoice};


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
        String playersArr[]={firstPlayerName,secondPlayerName};
        System.out.println("Can i do Toss ? (Y/N)");
        String tossDecison = sc.nextLine();
        String tossWinPlayer;
        int tossNo = 0;
        if (tossDecison.equalsIgnoreCase("Y")) {
            tossNo = (Math.random() <= 0.5) ? 1 : 2;
            switch (tossNo) {
                case 1 -> {
                    System.out.println(firstPlayerName + " won the toss.");
                    tossWinPlayer = firstPlayerChoice;
                }
                case 2 -> {
                    System.out.println(secondPlayerName + " won the toss.");
                    tossWinPlayer = secondPlayerChoice;
                }
            }
        } else if (tossDecison.equalsIgnoreCase("N")) {
            System.out.println("Toss canceled.");
            return;
        } else {
            System.out.println("You entered wrong input.");
            return;
        }
        System.out.println("Hey winner which option Do you want to choose: X or O ");
        String choiceChar = sc.nextLine();
        if (choiceChar.equalsIgnoreCase("O")) {
            for (int i = 0; i < playersChoiceArr.length; i++) {
                if ((tossNo - 1) == i) {
                    playersChoiceArr[i] = "O";
                } else {
                    playersChoiceArr[i] = "X";
                }
            }
        } else if (choiceChar.equalsIgnoreCase("X")) {
            for (int i = 0; i < playersChoiceArr.length; i++) {
                if ((tossNo - 1) == i) {
                    playersChoiceArr[i] = "X";
                } else {
                    playersChoiceArr[i] = "O";
                }
            }
        } else {
            System.out.println("You chose wrong option!");
        }
        System.out.println(firstPlayerName + " has chosen - " + playersChoiceArr[0]);
        System.out.println(secondPlayerName + " has chosen - " + playersChoiceArr[1]);
        System.out.println("Lets play this game........");

        int choice;
        int turns[]={0,1};
        System.out.println(playersChoiceArr[tossNo-1]);
        while (true){
            for (int i = 0; i < choiceArr.length; i++) {
                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0 -> {
                            System.out.print("    " + choiceArr[i][j] + "   ");
                        }
                        case 1 -> {
                            System.out.print("|   " + choiceArr[i][j] + "   |");
                        }
                        case 2 -> {
                            System.out.print("   " + choiceArr[i][j] + "    ");
                        }
                    }
                }
                System.out.println();
                if (i == 0 || i == 1) {
                    System.out.println("--------+-------+---------");
                }

            }
            System.out.println(playersArr[tossNo-1]+" Enter indexing No: ");
            choice = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < choiceArr.length; i++) {
                for (int j = 0; j <choiceArr.length ; j++) {
                    if(choiceArr[i][j].equalsIgnoreCase(String.valueOf(choice))){

                        choiceArr[i][j]=playersChoiceArr[0];
                    }
                }
            }

        }



    }

}
