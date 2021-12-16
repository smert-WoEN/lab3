package lab4.superclasses;

public enum LadderState {
    UP("Поднята"),
    DOWN("Опущена");

    public final String later;

    LadderState(String later){
        this.later = later;
    }
}
