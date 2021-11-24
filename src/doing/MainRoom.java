package doing;

import superclasses.Room;

public class MainRoom extends Room {
    private static final String name = "Главная комната";
    public MainRoom() {
        super(name);
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof MainRoom;
    }

    @Override
    public String toString() {
        return name;
    }
}
