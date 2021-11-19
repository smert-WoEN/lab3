public class Father extends Human{

    private static final String name = "Папа";

    public Father() {
        super(name);
    }
    @Override
    void doSomething(Object o) {
        if (o instanceof Phone) {
            System.out.println(this.toString() + " идет говорить по " + o.toString() + ".");
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
