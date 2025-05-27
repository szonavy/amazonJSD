package secondmodul.firsttask;

import java.util.Scanner;

public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        Scanner keyboard = new Scanner(System.in);
        int subChoice = 0;

        int dayOfTheWeek = 1;

        System.out.println("********** MENU *****************");
        System.out.println("These are the choices for week of the day.");
        System.out.println("Please enter only values from 1-7:");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
        System.out.println("3. WEDNESDAY");
        System.out.println("4. THURSDAY");
        System.out.println("5. FRIDAY");
        System.out.println("6. SATURDAY");
        System.out.println("7. SUNDAY");
        System.out.println("***********************************");

        System.out.println();
        dayOfTheWeek = keyboard.nextInt();



        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");
                System.out.println("*********** SUB MENU FOR MONDAY ******");
                System.out.println("* 1. Yes, I had my breakfast");
                System.out.println("* 2. No, I would like one");
                System.out.println(" **************************************");
                subChoice = keyboard.nextInt();
                if(subChoice == 1){
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                }else if(subChoice == 2){
                    System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                }else{
                    System.out.println("NO such choice available");
                }
                break;
            case 2:
                System.out.println("TUESDAY: It is back to work.....");
                break;
            case 3:
                System.out.println("WEDNESDAY: It is back to work.....");
                break;
            case 4:
                System.out.println("THURSDAY: It is back to work.....");
                break;
            case 5:
                System.out.println("FRIDAY: It is back to work.....");
                break;
            case 6:
                System.out.println("SATURDAY: It is back to work.....");
                break;
            case 7:
                System.out.println("SUNDAY: It is back to work.....");
                break;
            default:    System.out.println("Not valid.");


        }


        /** TODO 11: Display appropriate response to Toni, based on value in **/
        /**          variable subChoice using if, if-else, else **/
        /**
         1. When subChoice has value of 1 display -
         Good. Now you have a catchup meeting at 9AM Prepare your notes

         2. When subChoice has value of 2 display -
         Lets us divert on Highway 54 and have a Burger on the drive in

         3. When subChoice has any other value then 1 or 2 display -
         NO such choice available
         **/


    } //end of main method

}
