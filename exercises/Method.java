import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many times should the special text be printed?");
        int count = Integer.valueOf(reader.nextLine());
        int start = 0;
        while (start < count) {
            printText();
            start += 1;
        }

        printFromNumberToOne(count);

        System.out.println(divide(3, 2));

        printTriangle(4);

        // Remember to always close my scanner
        reader.close();
    }

    /*
     * Custom methods
     * are written outside the main method within the class
     * definition
     */

    public static void printText() {
        System.out.println("In a hole in the ground, there lived a method");
    }

    public static void printFromNumberToOne(int number) {
        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }

    public static double divide(int numerator, int denominator) {
        return (double) numerator / denominator;
    }

    public static void printStars(int start, int count) {
        while (start < count) {
            System.out.print("*");
            start++;
        }
        System.out.println();
    }

    public static void printSquares(int length) {
        for (int i = 0; i < length; i++) {
            printStars(0, length);
        }
    }

    public static void printTriangle(int size) {
        for (int i = size - 1; i > -1; i--) {
            printStars(0, size - i);
        }
    }
}