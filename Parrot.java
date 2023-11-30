package HomeWork_2;

public class Parrot extends Animal implements Speakable, Flyable, Goable {
    public Parrot(String name, String color) {
        super(name, color,2);
    }

    public Parrot(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Я попугай, я умею разговаривать! I kill you Motherfucker!");
    }

    @Override
    public int getFlightSpeed() {
        return 40;
    }

    @Override
    public int getRunningSpeed() {
        return 1;
    }
}

