package lang.print.gaps.task2;
public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;

    void callToFriend() {
        // some code
        System.out.println("Calling a friend...");
    }

    void callByNumber(int number) {
        // some code
        System.out.println("Calling by number: " + number);
    }

    public static void main(String[] args) {
        AdvancedNamingConvention convention = new AdvancedNamingConvention();

        convention.age = 25;
        System.out.println("Age: " + convention.age);

        convention.phoneNumber = 1234567890;
        System.out.println("Phone Number: " + convention.phoneNumber);

        System.out.println("Adult Age: " + ADULT_AGE);

        convention.callToFriend();

        int someNumber = 987654321;
        convention.callByNumber(someNumber);
    }
}
