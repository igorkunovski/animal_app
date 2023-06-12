package creature;

public class Camel extends Pack{

    public Camel(String name, String birth, int liftingCapacity, String... commands) {
        super(name, birth, liftingCapacity, commands);
    }

    @Override
    public void voice() {
        System.out.println("Hrrrrrgh");
    }

    @Override
    public String toString() {
        return "Camel " + super.toString();
    }
}
