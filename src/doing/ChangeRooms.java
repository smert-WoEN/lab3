package doing;

import superclasses.ChangeRoom;
import superclasses.Human;
import superclasses.Room;

public class ChangeRooms implements ChangeRoom {

    @Override
    public void changeRoom(Human human, Room room1, Room room2) {
        if (human != null && room1 != null && room2 != null){
            room1.deleteHumanFromRoom(human);
            room2.addHumanInRoom(human);
        }
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ChangeRoom;
    }

    @Override
    public String toString() {
        return "смена комнаты";
    }
}
