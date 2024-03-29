package HomeWork_2;

public class Bird extends Animal implements Flyable {
    public Bird(String name, String color) {
        super(name, color,2);
    }

    public Bird(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Eeeaw!");
    }

    @Override
    public int getFlightSpeed() {
        return 80;
    }
}
