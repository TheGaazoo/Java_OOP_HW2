package HomeWork_2;

import java.util.ArrayList;
import java.util.List;


public class Nurse extends Human {

    public Nurse(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void kill() {};

    @Override
    public void getIll() {};

 
    public List<Nurse> getNurses() {
        List<Nurse> nurses = new ArrayList<>();
        for (Nurse nurse : nurses) {
            nurse.add((Nurse) nurse);
        }
        return nurses;
    }
    private void add(Nurse nurse) {
    }


    @Override
    public String toString() {
        return String.format("ФИО : %s", this.getName());
    }
}
