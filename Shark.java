package HomeWork_2;

public class Shark extends Animal implements Swimmable, Illable {
    public Shark(String name, String color) {
        super(name, color, 0);
    }

    public Shark(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Я не издаю звуков!");
    }

    @Override
    public int getSwimmingSpeed() {
        return 30;
    }

    @Override
    public void getIll() {
    System.out.println("Людоедство");
    }
}