import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {
        // Cteate a new Scanner obj to take user input
        // Put the parameter System.in
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "I will tell you a story, but I need some information first.\nWhat is the main character called?");

        String name = sc.nextLine();

        System.out.println("What is their job?");

        String job = sc.nextLine();

        System.out.println("How old is " + name + "?");

        // Convert user input to int
        int age = Integer.valueOf(sc.nextLine());

        System.out.println("Here is the story:\n" +
                "Once upon a time there was a" + age + "year old " + name + ", who was a " + job + ".\n" +
                "On the way to work, " + name + " reflected on life.\nPerhaps Bob will not be a " + job
                + " forever.");

    }
}