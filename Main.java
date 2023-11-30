package HomeWork_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterenaryClinic vetClinic = new VeterenaryClinic();

        vetClinic
                .addAnimal(new Cat("Барсик", "Черный"))
                .addAnimal(new Dog("Бобик", "Рыжий"))
                .addAnimal(new Duck("Дональд", "Белый"))
                .addAnimal(new Bird("Кеша", "Коричневый"))
                .addAnimal(new Parrot("Гоша", "Желтый"))
                .addAnimal(new Fish("Немо", "Золотой"))
                .addAnimal(new Monkey("Никодим", "Страшный"))
                .addAnimal(new Shark("МЭГ", "Синий"));
  
        Doctor doc = new Doctor("Иванов Алексей Сергеевич");
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doc);

        Nurse nurs = new Nurse("Иванова Матрена Ивановна");
        List<Nurse> nurses = new ArrayList<>();
        nurses.add(nurs);

        System.out.println("Все животные:");
        for (Animal a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nБегающие животные:");
        for (Goable g: vetClinic.getRunningAnimals()) {
            System.out.println(g + ", " + "Скорость: " + g.getRunningSpeed());
        }

        System.out.println("\nПлавающие животные:");
        for (Swimmable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + ", " + "Скорость: " + s.getSwimmingSpeed());
        }

        System.out.println("\nЛетающие животные:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + ", " + "Скорость: " + f.getFlightSpeed());
        }

        System.out.println("\nГоворящие животные:");
        for (Speakable sp: vetClinic.getSpeakingAnimals()) {
            System.out.println(sp);
            sp.speak();
        }

        System.out.println("\nБольные животные:");
        for (Illable ill: vetClinic.getIllables()) {
            System.out.println(ill);
            System.out.print("Заболевание: ");
            ill.getIll();
            
        }
        System.out.println("\nГлавный ветиринарный врач:");
        System.out.println(doctors);
        System.out.println();

        System.out.println("\nМедицинская сестра:");
        System.out.println(nurses);
    
    }

}