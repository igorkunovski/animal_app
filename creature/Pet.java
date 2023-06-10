package creature;

import java.util.*;

public abstract class Pet extends Animal{

    double weight;

    public Pet(String name, String birth) {
        super(name, birth);
    }

    public Pet(String name, String birth, double weight) {
        super(name, birth);
        this.weight = weight;
    }

    public Pet(String name, String birth, String... commands) {
        super(name, birth, commands);
        super.addCommand(Arrays.toString(commands));
    }

    public Pet(String name, String birth, double weight, String... command) {
        super(name, birth, command);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +
                "weight=" + weight +
                '}';
    }
}
