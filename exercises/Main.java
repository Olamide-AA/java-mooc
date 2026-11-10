public class Main {
    public static void main(String[] args) {
        Person ada = new Person("Ada", 19);

        // Java changes ada to ada.toString at runtime
        System.out.println(ada);

        ada.growOlder();
        ada.sack();

        System.out.println(ada);
    }

}
