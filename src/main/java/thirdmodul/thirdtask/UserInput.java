package thirdmodul.thirdtask;

import java.util.Scanner;

public class UserInput {
    public String obtainBMISystem() {

        System.out.println("Welcome to the BMI calculator app!");
        System.out.print("Please select the preferred BMI calculation system (Imperial/Metric):");

        Scanner input = new Scanner(System.in);
        String bmiSystem = input.next();

        if (!(bmiSystem.equalsIgnoreCase("Imperial") ||
                bmiSystem.equalsIgnoreCase("Metric"))) {
            return "";
        }

        return bmiSystem;
    }


    public double obtainWeight(String bmiSystem) {
        double weight = 0;
        boolean isInvalidInput = true;
        while (isInvalidInput) {

            Scanner input = new Scanner(System.in);
            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL":
                    System.out.print("Enter weight in Pounds:");
                    break;

                case "METRIC":

                    System.out.print("Enter weight in Kilos:");
                    break;

                case "":
                    System.out.println("Please Enter a valid BMI System as input");
                    break;
            }

            if (input.hasNextDouble()) {
                weight = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Please enter a valid weight");
                weight = 0;
            }
        }

        return weight;
    }

    public double obtainHeight(String bmiSystem) {
        double height = 0;
        boolean isInvalidInput = true;


        while (isInvalidInput) {

            Scanner input = new Scanner(System.in);

            switch (bmiSystem.toUpperCase()) {

                case "IMPERIAL":

                    System.out.print("Enter height in Inches:");
                    break;

                case "METRIC":

                    System.out.print("Enter height in Meters:");
                    break;

                case "":

                    System.out.println("Please Enter a valid BMI System as input");
                    break;
            }


            if (input.hasNextDouble()) {

                height = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Please enter a valid height");
                height = 0;
            }
        }
        return height;

    }
}
