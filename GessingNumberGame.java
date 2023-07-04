import java.util.Scanner;

public class GessingNumberGame {


    public static void
    guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100
                * Math.random());

        int K = 5;

        int i, guess, num, count =0 ;


            System.out.println(
                    "A number is chosen"
                            + " between 1 to 100."
                            + "Guess the number"
                            + " within 5 trials.");

            for (i = 0; i < K; i++) {

                System.out.println(
                        "Guess the number:");

                guess = sc.nextInt();

                if (number == guess) {
                    System.out.println(
                            "Congratulations!"
                                    + " You guessed the number.");
                    System.out.println("Press any number for next round , rather then 0:");
                    num= sc.nextInt();
                    if (num != 0)
                    {
                        count++;
                        System.out.println("You are in now round :"+(count));
                        guessingNumberGame();

                    }
                    break;
                } else if (number > guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is "
                                    + "greater than " + guess);
                } else if (number < guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is"
                                    + " less than " + guess);
                }
            }

            if (i == K) {
                System.out.println(
                        "You have exhausted"
                                + " K trials.");
                System.out.println(
                        "The number was " + number);
            }

    }

    // Driver Code
    public static void
    main(String arg[])
    {
        guessingNumberGame();
    }
}
