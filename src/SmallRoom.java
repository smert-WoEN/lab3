import java.util.ArrayList;
import java.util.Objects;

public class SmallRoom implements Room{
    private final String name = "Маленькую комната";

    ArrayList<String> humanInRoom = new ArrayList<>();
    @Override
    public String getHumanInRoom() {
        return "" + humanInRoom;
    }

    @Override
    public void showHumanInRoom() {
        System.out.println("в " + this + " " + getHumanInRoom());
    }

    @Override
    public void addHumanInRoom(Object o) {
        if (o instanceof Human) {
            humanInRoom.add(o.toString());
            System.out.println(o + " зашел в " + this);
        }
    }

    @Override
    public void deleteHumanFromRoom(Object o) {
        if (o instanceof Human){
            humanInRoom.remove(o.toString());
            System.out.println(o + " вышел из " + this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MainRoom)) return false;
        MainRoom mainRoom = (MainRoom) o;
        return Objects.equals(getHumanInRoom(), mainRoom.getHumanInRoom());
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
