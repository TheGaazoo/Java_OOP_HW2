package HomeWork_2;


public class Cat extends Animal implements Goable, Illable {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Мяу!");
    }

    @Override
    public int getRunningSpeed() {
        return 25;
    }
    @Override
    public void getIll() {
    System.out.println("Ожирение");
    }
}
