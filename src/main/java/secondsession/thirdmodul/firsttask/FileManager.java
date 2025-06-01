package secondsession.thirdmodul.firsttask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileManager {

    // Define the copyFile method with two parameters: sourcePath and targetPath
    private static void copyFile(String sourcePath, String targetPath) {

        // Convert the sourcePath string into a Path object
        Path source = Paths.get(sourcePath);
        // TODO: Convert the targetPath string into a Path object
        Path target = Paths.get(targetPath);



        // Use a try-catch block to handle potential I/O exceptions
        try {

            Files.createDirectories(target.getParent());//target.getParent() → ez visszaadja a szülő mappát, tehát: backup/user_data/log.txt → backup/user_data
            //theat directoryrol beszelunk, letrehozza a teljes mappa utvonalat, ha nem letezik
            // TODO: Copy the source file to the target location, replacing any existing file
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);// ha a cel file mar letezik, nyugodtan irjuk felul az uj file tartalmaval.
            // ha ez a replace_existing nem lenne, akkor hibat dobna

            // TODO: Print a message indicating that the file has been successfully copied
            System.out.println("File copied from" + source + " to " + target);

        } catch (IOException e) {

            // TODO: If an IOException occurs, print an error message with the exception's message
            System.out.println("Source file not found.");

            // Print the stack trace of the exception for debugging purposes
            e.printStackTrace();
        }
    }

    // Main method to test the copyFile function
    public static void main(String[] args) {
        // Specify the source and target file paths
        String sourceFile = "./source_folder/textFile1.txt";
        String targetFile = "./target_folder/textFile1.txt";

        // Call the copyFile method with the specified source and target paths
        copyFile(sourceFile, targetFile);
    }
}
