package lab4.doing;

import doing.MainRoom;
import superclasses.Room;

public class SmallHouse extends Room {

    private static final String name = "Маленький Домик";

    public SmallHouse() {
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
        return super.equals(o) && o instanceof SmallHouse;
    }

    @Override
    public String toString() {
        return name;
    }
}
