public class Kitchen implements Room{

    private boolean humanRoom = false;

    public void setHumanRoom(boolean humanRoom){
        this.humanRoom = humanRoom;
    }

    @Override
    public boolean getHumanRoom() {
        return this.humanRoom;
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public String toString() {
        return "{" + (getHumanRoom() ? "зашел в " : "вышел из ") + "Кухню}";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof MainRoom;
    }
}
