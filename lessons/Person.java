package lessons;

//A class defines the attributes and behaviors of objects that are created from it
public class Person {
    // Instance variables || Object fields || Object attributes
    private String name;
    private SimpleDate birthday;
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

    // A constructor can use another constructor
    public Person(String name, int day, int month, int year) {
        SimpleDate date = new SimpleDate(day, month, year);
        this(name, date, 0.0, 0.0);
    }

    public Person(String name, SimpleDate birthday, double height, double weight) {
        this.name = name;
        this.birthday = birthday;
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

    public void sack() {
        this.isEmployed = false;
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }

    public String returnDominantHand() {
        return this.dominantHand;
    }

    public boolean olderThan(Person compared) {
        if (this.birthday.before(compared.getBirthday())) {
            return true;
        }

        return false;

        // or return more directly:
        // return this.birthday.before(compared.getBirthday());
    }

    public String printEmploymentStatus() {
        String employed;
        if (isEmployed) {
            employed = " is employed";
        } else {
            employed = " is not employed";
        }
        return employed;
    } // String representation of an object

    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
