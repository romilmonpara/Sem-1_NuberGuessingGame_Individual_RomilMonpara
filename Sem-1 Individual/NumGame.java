import java.util.*;

class Game {
    Scanner sc = new Scanner(System.in);

    int number;
    int gnum;
    int countGuess = 0;

    Game() {
        Random ran = new Random();
        this.number = ran.nextInt(100); 
    }

    void inputNumber() {
        System.out.println("Enter your Guess :");
        gnum = sc.nextInt();

        while (gnum > 100 || gnum < 0) {
            System.out.println("\nPlease Enter Number between Between 1 to 100.");
            gnum = sc.nextInt();
        }
    }

    boolean checkCorrect() {
        countGuess++;
        
        if(number == gnum) {
            System.out.println("Yes you guessed it right, it was " + number);
            System.out.println("You guessed in " + countGuess + " attempts.");
            return true;
        } else if(gnum < number) {
            System.out.println("Try higher. . .");
        } else if(gnum > number) {
            System.out.println("Try lower. . .");
        }
        return false;
    }

}

public class NumGame {
    public static void main(String args[]) {
		System.out.println("\n=========================================\n");
		System.out.println("Welcome to Number Guessing Game.");
		System.out.println("\nEnter Number Between 1 to 100.");
		
        Game x = new Game();
        boolean b = false;

        while(!b) {
            x.inputNumber();
            b = x.checkCorrect();
        }
        
		System.out.println("\n=========================================");
    }
}