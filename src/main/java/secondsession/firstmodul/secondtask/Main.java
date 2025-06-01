package secondsession.firstmodul.secondtask;

import java.io.*;
import java.util.Scanner;

public class Main {
    //TODO 3: add a static method here. Use textFileWrite() as name, it won't return any value.
    //Inside the method, declare an object of Person class and use the toString() method to obtain
    //the string representation
    public static void textFileWrite() { // mivel a main is static ezert csak static metodusokat hovhat meg kozvetlenul
        Person person = new Person("John", 30, 132.8);
        String personData = person.toString();


        //TODO 4: create object of FileWriter class, it points to file1.txt
        //call the write() method of FileWriter to save the data of the Person object in the file
        //TODO 5: put the file writing code in try block, and catch the IO exception
        {
            try {
                FileWriter writer = new FileWriter("file1.txt");//ha nincs true parameter akkor felulirja, amugy appendeli
                writer.write(personData);
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred while writing the file.");
                e.printStackTrace();
            }
        }
    }
    //TODO 6: Define printWrite() method, a static method that doesn’t return any data.
    public static void printWrite(){
        //TODO 7: Take inputs from the user with Scanner class, for name, age and weight.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter weight: ");
        double weight = sc.nextDouble();
        //  Instantiate Person object with the inputs
        sc.nextLine();

        Person person = new Person(name,age,weight);
        //TODO 8: Declare object of PrintWriter class, which refers to file2.txt file in the current folder.
        //   Call its println() method, to write the object string returned by toString() method
        try {
            PrintWriter writer = new PrintWriter("file2.txt");
            writer.println(person.toString());
            writer.close();
            System.out.println("Data written to file2.txt");

            //TODO 9: Put the code in try catch block for IOException
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        //  sc.close();
    }

    //TODO 11: Open a FileOutputStream object, pointing towards file3.txt file
    public static void writeBytesToFile() {
        //TODO 10: Declare a byte array to store a list of numbers.
        byte[] numbers = {10,20,30,40,50};
        {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("file3.txt");//raw byte iras

                for(byte n: numbers){//byteonkenti iras
                    fileOutputStream.write(n);

                }
                //alternativa: fileOutputStream.write(numbers)->ezzel is bele helet irni nem kell ciklus
                fileOutputStream.close();
                System.out.println("Bytes successfully written to file3.txt.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to file3.txt.");
                e.printStackTrace();
            }

        }
    }

    public static void writeBinaryPerson(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter weight:");
        double weight = Double.parseDouble(sc.nextLine());

        Person person = new Person(name, age,weight);

        try {
            //ez a 2 kombo lehetove teszi a kulonfele tipusok (int, double, String) binaris menteset
            FileOutputStream fileOutputStream = new FileOutputStream("file4.txt"); // ->filera ir
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream); // ->egy csonagolas, ami tipus-specifikus irast tesz lehetove

            //ezek binarisok, nem olvashatoak szovegesen filemegnyitaskor
            dataOutputStream.writeUTF(person.name);
            dataOutputStream.writeInt(person.age);
            dataOutputStream.writeDouble(person.weight);

            dataOutputStream.close();
            System.out.println("Binary data written to file4.dat");
        } catch (IOException e) {
            System.out.println("Error writing binary file:");
            e.printStackTrace();
        }
        sc.close();
    }


//TODO 12: call the write() method of FileOutputStream object to print each element in the array.
// Use for loop for the purpose
//TODO 13: Place all the file activity inside the try-catch block.

//TODO 14: Declare an object of DataOutputStream class.
// Use object of FileOutputStream class as argument to its constructor.
// The FileOutputStream object refers to file4.dat
//TODO 15: Use Scanner class to read name, age, and weight.
// Instantiate a Person object from the inputs.
//TODO 16: Call writeUTF(), writeInt(), and writeDouble() methods of DataOutputStream object
// to write respectively the name, age and weight attributes of the Person object.
//TODO 17: Place the entire file writing code in try-catch block

    public static void main(String[] args) throws Exception{
        textFileWrite();
        printWrite();
        writeBytesToFile();
        writeBinaryPerson(); // TODO 19: meghívás
//TODO 18: call the static methods from main() method
    }
}
