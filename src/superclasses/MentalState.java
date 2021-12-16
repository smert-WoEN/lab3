package superclasses;

public enum MentalState {
    NORMAL("Спокоен"),
    DISCOURAGED("Обескуражен"),
    CRYING("Плачет"),
    LISTEN("Слушает"),
    ASKING("Спрашивает"),
    ENTERED("Входит"),
    FULL("Сыт"),
    THINK("Думает"),
    LAUGHS("Смеется");

    public final String label;

    MentalState(String label) {
        this.label = label;
    }
}
