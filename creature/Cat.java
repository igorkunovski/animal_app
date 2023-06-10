package creature;

public class Cat extends Pet{

    public Cat(String name, String birth, double weight) {
        super(name, birth, weight);
    }

    public Cat(String name, String birth, double weight, String... command) {
        super(name, birth, weight, command);
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                super.toString() +
                '}';
    }
}
