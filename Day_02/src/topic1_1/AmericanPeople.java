package topic1_1;

public class AmericanPeople extends People {

    public AmericanPeople() {
    }

    public AmericanPeople(double height, double weight) {
        super(height, weight);
    }

    public void americanBoxing() {
        System.out.println("Boxing");
    }

    @Override
    public void speakHello() {
        System.out.println("Hi~");
    }

    @Override
    public void averageHeight() {
        System.out.println("The average height of American is: " + height + "cm");

    }

    @Override
    public void averageWeight() {
        System.out.println("The average weight of American is: " + weight + "kg");

    }
}
