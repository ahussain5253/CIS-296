import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner file;

        try {
            file = new Scanner(new File("input.txt"));
            String input;

            while (file.hasNext()) {
                input = file.nextLine();

                String[] stringArray = input.split(" ");

                if (stringArray.length == 3) {
                    RegularPolygon polygon = new RegularPolygon(Integer.parseInt(stringArray[0]), Double.parseDouble(stringArray[2]), 0, 0);
                    System.out.println(polygon.getNumSides() + " " + polygon.getSide() + " (" + polygon.getX() + "," + polygon.getY() + ") " + polygon.perimeter() + " " + polygon.area());
                }
                else if (stringArray.length == 7) {
                    RegularPolygon polygon = new RegularPolygon(Integer.parseInt(stringArray[0]), Double.parseDouble(stringArray[2]), Double.parseDouble(stringArray[4]) , Double.parseDouble(stringArray[6]));
                    System.out.println(polygon.getNumSides() + " " + polygon.getSide() + " (" + polygon.getX() + "," + polygon.getY() + ") " + polygon.perimeter() + " " + polygon.area());
                }
            } // end while loop

            file.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Cannot find file");
            System.out.println(ex.getMessage());
        } // end try-catch
    } // end main
}