package superclasses;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Room {
    private final String name;

    ArrayList<String> humanInRoom = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Room(String name) {
        this.name = name;
    }

    public String getHumanInRoom() {
        return "" + humanInRoom;
    }

    public void showHumanInRoom() {
        System.out.println("В " + getName() + " " + getHumanInRoom());
    }

    public void addHumanInRoom(Object o) {
        if (o instanceof Human){
            humanInRoom.add(o.toString());
            System.out.println(o + " зашел в " + getName());
        }
    }

    public void deleteHumanFromRoom(Object o) {
        if (o instanceof Human){
            humanInRoom.remove(o.toString());
            System.out.println(o + " вышел из " + this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(getHumanInRoom(), room.getHumanInRoom());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
