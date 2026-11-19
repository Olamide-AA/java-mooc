package Archive;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Archive> archives = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("An empty input will stop the program");

            System.out.print("Enter Archive Identifier: ");
            String identifier = reader.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.print("Enter Archive Name: ");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive archive = new Archive(identifier, name);
            if (!(archives.contains(archive))) {
                archives.add(archive);
            }

        }

        for (Archive archive : archives) {
            System.out.println(archive);
        }
    }
}
