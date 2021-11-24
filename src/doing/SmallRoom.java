package doing;

import superclasses.Room;

public class SmallRoom extends Room {
    private static final String name = "Маленькая комната";
    public SmallRoom() {
        super(name);
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof SmallRoom;
    }

    @Override
    public String toString() {
        return name;
    }
}
