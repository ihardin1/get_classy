import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Scanner;

public class PersonReader {
    public static void main(String[] args){
        JFileChooser chooser = new JFileChooser();
        Scanner inFile;
        String line;
        Path target = new File(System.getProperty("user.dir")).toPath();
        target = target.resolve("src");
        // set the chooser to the project src directory
        chooser.setCurrentDirectory(target.toFile());

        try  // Code that might trigger the exception goes here
        {

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                target = chooser.getSelectedFile().toPath();  // this is a File object not a String filename

                inFile = new Scanner(target);
                System.out.println(String.format("%-6s %-15s %-15s %-10s %-10s","ID#","First Name","Last Name","Title","YOB"));
                System.out.println(String.join("", Collections.nCopies(56,"=")));

                while (inFile.hasNextLine()) {
                    line = inFile.nextLine();
                    String [] components=line.split(",");
                    String formatted=String.format("%-6s %-15s %-15s %-10s %-10s",components[0].trim(),components[1].trim(),components[2].trim(),components[3].trim(),components[4].trim());
                    System.out.println(formatted);
                }

                inFile.close();
            } else   // User did not pick a file, closed the chooser
            {
                System.out.println("Sorry, you must select a file! Terminating!");
                System.exit(0);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Error");
            e.printStackTrace();
        } catch (IOException e) // code to handle this exception
        {
            System.out.println("IOException Error");
            e.printStackTrace();
        }
    }
}
