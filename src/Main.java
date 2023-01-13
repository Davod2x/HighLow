import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int limit = 51;
        int randnum = rand.nextInt(limit);
        int userGuess = -randnum;
        Scanner myObj = new Scanner(System.in);
        //System.out.println("Pick a number from 1- 50");
        //userGuess = myObj.nextLine();
        //int i = Integer.parseInt(userGuess);


        while (userGuess != randnum ) {
            System.out.println("Pick a number from 1- 50");
            userGuess = myObj.nextInt();
            if (userGuess > randnum) {
                System.out.println("That number is too big guess again");
             //   userGuess = myObj.nextLine();
            } if(userGuess < randnum) {
                System.out.println("That number is too small guess again");
              //  userGuess = myObj.nextLine();
            }
            else{
                System.out.println("Correct");
            }
            }
        }

    }


