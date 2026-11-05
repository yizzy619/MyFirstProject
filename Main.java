import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ===== Part A: Greeting & Name =====
        // TODO A: Ask for the rider's full name (String) and print a welcome message.

        System.out.println("Enter your full name: ");
        String name = in.nextLine();

        System.out.println("Welcome, "+name);

        // ===== Part B: Trip Inputs =====
        // TODO B: Ask for distance (double) and time (int), then print them.

        System.out.println("what is the desired distance of travel in miles : ");
        double distance = in.nextDouble();
        System.out.println("Miles: " + distance);

        System.out.println("what is your desired time of travel:");
        int minutes = in.nextInt();
        System.out.println("Minutes: " + minutes);

        // ===== Part C: Fare Calculation =====
        // Rates
        final double BASE = 2.50;
        final double PER_MILE = 1.75;
        final double PER_MIN = 0.25;
        // TODO C: Calculate fare using formula and print the result.
double fare = BASE + (distance * PER_MILE) + (minutes * PER_MIN);
System.out.println("Fare: $" + fare);

        // ===== Part D: Casting =====
        // TODO E: cast fare into an int (cashFare)

        int cashFare = (int) fare;;
        System.out.println("Cash Fare: $" + cashFare);

        // Print the value.

        /// ===== Part E: Final Receipt =====
        // TODO E: Print a neat receipt with:
        //  ---- Ride Receipt ----
        //  Name: <name>
        //  Miles: <distance>
        //  Minutes: <minutes>
        //  Exact Fare: $<fare>
        //  Cash Fare : $<cashFare>
        //  ----------------------

        System.out.println();
        System.out.println(" --- Ride Receipt--- ");
        System.out.println("Name: " + name);
        System.out.println("Miles: " +distance);
        System.out.println("Minutes: " + minutes);
        System.out.println("Exact Fare: " + fare);
        System.out.println("Cashe Fare: " + cashFare);

    }
}