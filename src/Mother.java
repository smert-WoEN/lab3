public class Mother extends Human{

    private static final String name = "Мама";

    public Mother() {
        super(name);
    }

    void doSomething(Object o, Object o2, Object o3) {
        if (o instanceof Cake && o2 instanceof Room && o3 instanceof Room) {
            if (((Cake) o).getReadiness() && !((Room) o2).getHumanRoom() && ((Room) o3).getHumanRoom()) {
                System.out.println(this + " вспоминает про " + o + o2 + " и " + o3);
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Mother;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode();
    }
}
