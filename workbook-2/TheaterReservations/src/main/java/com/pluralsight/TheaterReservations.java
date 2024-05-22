import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        // Prompt the user for the date of the show
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateString = scanner.nextLine();

        // Prompt the user for the number of tickets
        System.out.print("How many tickets would you like? ");
        int numTickets = scanner.nextInt();

        // Format the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Get last name and first name from full name
        String[] nameParts = fullName.split(" ");
        String lastName = nameParts[nameParts.length - 1];
        String firstName = fullName.substring(0, fullName.length() - lastName.length()).trim();

        // Print confirmation message
        if (numTickets == 1) {
            System.out.println("1 ticket reserved for " + dateFormat.format(date) + " under " + lastName + ", " + firstName);
        } else {
            System.out.println(numTickets + " tickets reserved for " + dateFormat.format(date) + " under " + lastName + ", " + firstName);
        }
    }
}
