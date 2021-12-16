package lab4.superclasses;

public interface DayTime {

    void setDayTime(DayTimeMode dayTimeMode);
    DayTimeMode getDayTime();

    enum DayTimeMode{
        NIGHT("Ночь"),
        DAY("День");

        public final String label;

        DayTimeMode(String label){
            this.label = label;
        }
    }
}
