import java.util.Scanner;

public class CtoF {

    public static void main(String[] args) {

        boolean playing = true;
        Scanner in = new Scanner(System.in);

        double tempF = 0;
        double tempC = 0;
        String trash = "";

        do {

            System.out.println("What is your Temp in C? ");

            if (in.hasNextDouble())
            {
                tempC = in.nextDouble();
                tempF = ((1.8) * tempC) + 32;
                System.out.println("Your Temp in Fahrenheit is: " + tempF + " Degrees");
                playing = false;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + ": incorrect input please try again.");
            }
        }while (playing);
    }
}
