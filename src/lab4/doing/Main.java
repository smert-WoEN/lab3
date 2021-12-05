package lab4.doing;

import lab4.superclasses.Car;
import superclasses.Ringable;

public class Main {
    public static void main(String[] args) {

        Ringable ringFireCar = new FireCar();
        Car fireCar = new FireCar();

        fireCar.moving();
        ringFireCar.ring();
    }
}
