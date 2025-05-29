package firtsession.firstmodul.firstfinaltest;

public class Main {
    public static void main(String[] args) {
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int numberOfTicket = 8;
        double price = 10.57;
        double cost = numberOfTicket * price;

        String userName = firstName+lastName;
        userName = userName.toLowerCase();

        String convertTitle = movieTitle.toUpperCase();

        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: " + userName);
        System.out.println("Movie: " + convertTitle);
        System.out.println("Number of tickets: " + numberOfTicket);
        System.out.println("Price per ticket: $" + price);
        System.out.println("Total price of tickets: $" + cost);
        System.out.println("\nThank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");

    }
}
