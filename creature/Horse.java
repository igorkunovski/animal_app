package creature;

public class Horse extends Pack{

    public Horse(String name, String birth, int liftingCapacity, String... commands) {
        super(name, birth, liftingCapacity, commands);
    }

    @Override
    public void voice() {
        System.out.println("Agggggh");
    }

    @Override
    public String toString() {
        return "Horse " + super.toString();
    }
}
