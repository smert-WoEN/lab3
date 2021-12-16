package lab4.superclasses;

public enum CarState {
    MOVING("Едет"),
    STOP("Стоит");

    public final String label;

    CarState(String label){
        this.label = label;
    }
}
