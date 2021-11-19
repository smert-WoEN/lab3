public class Child extends Human{

    private static final String name = "Малышь";

    public Child() {
        super(name);
    }

    void doSomething(Object o, Object o2, Object o3) {
        this.setMentalState(MentalState.CRYING);
        if (o instanceof Room) {
            if (((Room) o).getHumanRoom()){
                System.out.println(this + o.toString() + " едва плачет.");
            }
        }
        //System.out.println(this + " едва плачет.");
        this.setMentalState(MentalState.DISCOURAGED);
        System.out.println(this + " обескуражен.");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Child;
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }
}
