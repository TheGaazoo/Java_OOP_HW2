package HomeWork_2;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human {

    public Doctor(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void heal() {
        System.out.println("Животное вылечено.");
    };

    @Override
    public void getIll() {};

     public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        for (Doctor doctor : doctors) {
            doctors.add((Doctor) doctor);
        }
        return doctors;
    }
    @Override
    public String toString() {
        return String.format("ФИО : %s", this.getName());
    }
}
