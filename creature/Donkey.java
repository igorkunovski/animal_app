package creature;

public class Donkey extends Pack{

    public Donkey(String name, String birth, int liftingCapacity) {
        super(name, birth, liftingCapacity);
    }

    public Donkey(String name, String birth, int liftingCapacity, String... commands) {
        super(name, birth, liftingCapacity, commands);
    }

    @Override
    public void voice() {
        System.out.println("Iiiaaaghh");
    }

    @Override
    public String toString() {
        return "Donkey{" +
                super.toString() + '}';
    }
}
