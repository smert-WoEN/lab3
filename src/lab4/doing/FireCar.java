package lab4.doing;

import lab4.superclasses.Car;
import lab4.superclasses.CarState;
import superclasses.Ringable;


public class FireCar implements Car {

    private CarState carState = CarState.STOP;

    @Override
    public void moving() {
        this.setCarState(CarState.MOVING);
        System.out.print(this + " едет по улице, ");
        Ringable fireRing = new Ringable() {
            @Override
            public String toString() {
                return "Сирена";
            }

            @Override
            public void ring() {
                System.out.println("сигналит " + this);
            }

        };
        fireRing.ring();
    }

    @Override
    public void stop() {
        this.setCarState(CarState.STOP);
        System.out.println(this + " остановилась у подъезда");
    }

    @Override
    public void setCarState(CarState carState) {
        this.carState = carState;
    }
    @Override
    public CarState getCarState() {
        return carState;
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
