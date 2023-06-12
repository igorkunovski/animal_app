package creature;

public abstract class Pet extends Animal{

    private double weight;

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
        return super.toString() +  "; weight: " + getWeight() + " kg";
    }
}
