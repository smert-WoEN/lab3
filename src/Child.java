public class Child extends Human{

    private static final String name = "Малышь";

    public Child() {
        super(name);
    }

    void doSomething(Object o) {
        this.setMentalState(MentalState.CRYING);
        System.out.println(this + " едва плачет.");
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
