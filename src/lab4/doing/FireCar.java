package lab4.doing;

import lab4.superclasses.Car;
import superclasses.Ringable;

public class FireCar implements Car, Ringable {

    @Override
    public void moving() {
        System.out.println(this + " едет по улице");
    }

    @Override
    public void ring() {
        System.out.println(this + " сигналит сиреной");
    }

    @Override
    public String toString() {
        return "Пожарная машина";
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FireCar;
    }
}
