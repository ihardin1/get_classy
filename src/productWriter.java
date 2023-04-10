import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class productWriter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Product> item = new ArrayList<>();

        while (SafeInput.getYNConfirm(in, "Add a product ?")) {
            System.out.print("ID Number: ");
            String ID = in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Description: ");
            String description = in.nextLine();
            System.out.print("Cost: ");
            double cost = in.nextDouble();

            item.add(new Product(ID, name, description, cost));
        }

        String textFileName = SafeInput.getNonZeroLenString(in, "\nEnter text file name");

        try {
            PrintWriter writer = new PrintWriter(textFileName);

            for(Product var : item) {
                writer.println(var.toCSV());
            }
            writer.close();
            System.out.println("Data file written!");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

