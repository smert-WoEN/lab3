package lab4.doing;

import superclasses.Human;
import superclasses.MentalState;

public class People extends Human {
    private final String name;

    public People(String name) {
        super(name);
        this.name = name;
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
        return super.equals(o) && o instanceof People;
    }
}
