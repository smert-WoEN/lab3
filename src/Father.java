public class Father extends Human{

    private static final String name = "Папа";

    public Father() {
        super(name);
    }
    @Override
    void doSomething(Object o, Object o2, Object o3) {
        if (o instanceof Phone && o2 instanceof Room && o3 instanceof Room) {
            if (!((Room) o2).getHumanRoom() && ((Room) o3).getHumanRoom()) {
                System.out.println(this + " идет говорить по " + o + o2 + o3 + ".");
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Father;
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }
}
