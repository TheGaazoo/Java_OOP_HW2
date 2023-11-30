package HomeWork_2;

import java.util.ArrayList;
import java.util.List;

public class VeterenaryClinic {
    private final List<Animal> animals;
    public VeterenaryClinic(Human headPhysician) {
        this.animals = new ArrayList<>();
    }
    public VeterenaryClinic() { this(null); }

    public List<Animal> getAllAnimals() { return this.animals; }

    public List<Goable> getRunningAnimals() {
        List<Goable> runningAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Goable) runningAnimals.add((Goable) a);

        return runningAnimals;
    }

    public List<Swimmable> getSwimmingAnimals() {
        List<Swimmable> swimmingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Swimmable) swimmingAnimals.add((Swimmable) a);

        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }

    public List<Illable> getIllables() {
        List<Illable> illAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Illable) illAnimals.add((Illable) a);

        return illAnimals;
    }

    public List<Speakable> getSpeakingAnimals() {
        List<Speakable> speakingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Speakable) speakingAnimals.add((Speakable) a);

        return speakingAnimals;
    }

    public VeterenaryClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

}