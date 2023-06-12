package creature;

public class Dog extends Pet{

    public Dog(String name, String birth, double weight, String... command) {
        super(name, birth, weight, command);
    }

    @Override
    public void voice() {
        System.out.println("Wowf");
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}
