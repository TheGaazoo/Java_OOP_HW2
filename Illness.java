package HomeWork_2;

public class Illness {
    public String illnessName;

    public Illness(String illnessName) {
        this.illnessName = illnessName;
    }
    public void heal(){
        System.out.println("Выпить лекарство");
    }

    @Override
    public String toString() {
        return illnessName;
    }
}
