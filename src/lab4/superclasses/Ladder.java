package lab4.superclasses;

public interface Ladder {
    void extendLadder(Car car);
    void upLadder(Car car);
    LadderState getLadderState();
    void setLadderState(LadderState ladderState);
}
