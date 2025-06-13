package thirdsession.secondtask;

import thirdsession.secondtask.controller.SeatBooking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Take input using Scanner class
        Scanner keyboard = new Scanner(System.in);
        // Create an object of SeatBooking class
        SeatBooking bookingManager = new SeatBooking();

        while (true) {
            System.out.println("\n1. Add Booking\n2. Cancel Booking\n3. Update Booking\n4. Display Bookings\n5. Exit");
            System.out.print("Choose an option: ");
            // Choose an option
            int choice = -1;
            try {
                choice = keyboard.nextInt();
                keyboard.nextLine(); // Consume newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                keyboard.nextLine(); // Clear invalid input
                continue; // Skip the rest of the loop iteration
            }

            switch (choice) {
                case 1:
                    // TODO 16: add New Seats
                    // use a print statement to instruct the user to enter a seat number for booking.
                    System.out.println("Please enter the seat number:");
                    // take the seat number input from the user.
                    String seatNumber = keyboard.nextLine();
                    // pass the seat number to the addNewBooking method to add the
                    bookingManager.addNewBooking(seatNumber);
                    break;
                case 2:
                    // TODO 17: remove Booking
                    // print a message instructing the user to enter the seat number they wish to cancel.
                    System.out.println("Please write the cancellation requested seat number:  ");
                    // take the seat number input from the user.
                    String removeSeat = keyboard.nextLine();
                    // call the cancelBooking method with the provided seat number to cancel the booking.
                    bookingManager.cancelBooking(removeSeat);
                    break;
                case 3:
                    // TODO 18: update booking
                    // prompt users to enter the old seat number they want to update.
                    System.out.println("Please enter your current seat number:");
                    // take the old seat number input from the user.
                    String currentSeatNumber = keyboard.nextLine();
                    // prompt the user to enter the new seat number.
                    System.out.println("Please enter your new seat number: ");
                    // take the new seat number input from the user.
                    String newSeatNumber = keyboard.nextLine();
                    // call the updateBooking method with the old and new seat numbers to update the booking.
                    bookingManager.updateBooking(currentSeatNumber,newSeatNumber);
                    break;
                case 4:
                    // display the all bookings
                    // check if the bookedSeatsList is empty, inform the user that no bookings have been made yet
                    // iterate through the list of booked seats, Check if the seat is booked and not cancelled
                    // display the seat number and booking date
                    bookingManager.displayBookings();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    keyboard.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

}
