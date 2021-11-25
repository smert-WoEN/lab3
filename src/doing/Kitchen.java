package doing;

import superclasses.Room;

public class Kitchen extends Room {
    private static final String name = "Кухня";
    public Kitchen() {
        super(name);
    }

    @Override
    public void doNothing() {

    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Kitchen;
    }

    @Override
    public String toString() {
        return name;
    }
}
