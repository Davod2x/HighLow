import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int limit = 51;
        int randnum = rand.nextInt(limit);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Pick a number from 1- 50");
        String userGuess = myObj.nextLine();
        int i =Integer.parseInt(userGuess);

        int a = randnum;

        while (i != randnum)
        {
            if (i > randnum)
            {
                System.out.println("That number is too big guess again");
                myObj.nextLine();
            }
            else
                System.out.println("That number is too big guess again");



    }
}