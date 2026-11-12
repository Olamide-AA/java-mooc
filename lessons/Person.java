package lessons;

//A class defines the attributes and behaviors of objects that are created from it
public class Person {
    // Instance variables || Object fields || Object attributes
    private String name;
    private int age;
    private boolean isEmployed;
    private double height;
    private double weight;
    private String dominantHand;

    /*
     * A constructor is a method created after instance variable
     * This method is used to define the parameters a new object gets
     * It is useful for passing in a value for instance variable as a new object is
     * created
     */
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.isEmployed = true;
        this.height = height;
        this.weight = weight;
        this.dominantHand = "undecided";
    }

    /*
     * Method
     * Static is for method that does not belong to an object
     * Can use static if all variables a method uses are recieved from parameters
     */

    public void setDominantHand(String dominantHand) {
        this.dominantHand = dominantHand;
    }

    public double calculateBMI() {
        return this.weight / ((this.height / 100) * (this.height / 100));
    }

    public void growOlder() {
        this.age += 1;
    }

    public void sack() {
        this.isEmployed = false;
    }

    public int returnAge() {
        return this.age;
    }

    public String returnDominantHand() {
        return this.dominantHand;
    }

    // String representation of an object
    public String toString() {
        return this.name + ", age " + this.age + this.printEmploymentStatus();
    }

    public String printEmploymentStatus() {
        String employed;
        if (isEmployed) {
            employed = " is employed";
        } else {
            employed = " is not employed";
        }
        return employed;
    }
}
