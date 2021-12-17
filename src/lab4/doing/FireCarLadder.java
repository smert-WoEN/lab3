package lab4.doing;

import lab4.superclasses.Car;
import lab4.superclasses.CarState;
import lab4.superclasses.Ladder;
import lab4.superclasses.LadderState;

public class FireCarLadder implements Ladder {

    private LadderState ladderState = LadderState.DOWN;

    @Override
    public void extendLadder(Car car){
        if (getLadderState() == LadderState.DOWN)
            upLadder(car);
        else {
            System.out.println(this + " выдвинута");
        }
    }

    @Override
    public void upLadder(Car car) {
        if (car.getCarState() == CarState.MOVING)
            throw new FireCarLadderCheckingException(car + " едет, " + this + " невозможно поднять");
        else {
            this.setLadderState(LadderState.UP);
            System.out.println(this + " поднята");
        }
    }

    @Override
    public LadderState getLadderState() {
        return ladderState;
    }

    @Override
    public void setLadderState(LadderState ladderState) {
        this.ladderState = ladderState;
    }

    @Override
    public String toString() {
        return "пожарная лестница";
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FireCarLadder;
    }

    public static class FireCarLadderCheckingException extends IllegalArgumentException {
        public FireCarLadderCheckingException() {
            super();
        }

        public FireCarLadderCheckingException(String message) {
            super(message);
        }

        public FireCarLadderCheckingException(String errorMessages, Throwable err) {
            super(errorMessages, err);
        }

        public FireCarLadderCheckingException(Throwable cause) {
            super(cause);
        }
    }
}
