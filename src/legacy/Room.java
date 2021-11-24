package legacy;

@Deprecated
public interface Room {
    String getHumanInRoom();
    void showHumanInRoom();
    void addHumanInRoom(Object o);
    void deleteHumanFromRoom(Object o);
}
