package lab4.doing;

import superclasses.Human;
import superclasses.MentalState;

public class Fille extends Human {
    private static final String name = "Филле";

    public Fille() {
        super(name);
    }

    @Override
    public void doSomething(Object o) {
        this.setMentalState(MentalState.ENTERED);
        System.out.println(this + " входит");
        this.setMentalState(MentalState.ASKING);
        System.out.println(this + " спросил");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Fille;
    }
}