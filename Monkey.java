package HomeWork_2;


public class Monkey extends Animal implements Goable, Swimmable, Illable {
    public Monkey(String name, String color) {
        super(name, color,8);
    }

    public Monkey(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("УУУааааУУУУ!");
    }

    @Override
    public int getRunningSpeed() {
        return 25;
    }
    
    @Override
    public int getSwimmingSpeed() {
        return 5;
    }

     @Override
    public void getIll() {
    System.out.println("Алкоголизм");
    }
}
