package doing;

import superclasses.Cake;
import superclasses.Human;

public class Mother extends Human {

    private static final String name = "Мама";

    public Mother() {
        super(name);
    }

    public void doSomething(Object o) {
        if (o instanceof Cake) {
            if (((Cake) o).getReadiness()) {
                System.out.println(this + " вспоминает про " + o + " и уходит за ним на кухню.");
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
