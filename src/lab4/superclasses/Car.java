package lab4.superclasses;

public interface Car {
    void moving();
    void stop();
    void setCarState(CarState carState);
    CarState getCarState();
}
