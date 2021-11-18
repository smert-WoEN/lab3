public enum MentalState {
    NORMAL("Спокоен"),
    DISCOURAGED("Обескуражен"),
    CRYING("Плачет");

    public final String label;

    MentalState(String label) {
        this.label = label;
    }
}
