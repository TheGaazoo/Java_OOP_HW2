package HomeWork_2;

public class Duck extends Animal implements Flyable, Goable, Swimmable, Illable {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Кря-кря!");
    }

    @Override
    public int getFlightSpeed() {
        return 60;
    }

    @Override
    public int getRunningSpeed() {
        return 10;
    }

    @Override
    public int getSwimmingSpeed() {
        return 3;
    }

    @Override
    public void getIll() {
    System.out.println("Шизофрения");
    }
}
