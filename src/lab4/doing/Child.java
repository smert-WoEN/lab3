package lab4.doing;

import lab4.superclasses.HumanMoreDoing;
import superclasses.Human;
import superclasses.MentalState;

public class Child extends HumanMoreDoing {

    private static final String name = "Малыш";

    public lab4.superclasses.DayTime dayTime = new DayTime();
    public Child() {
        super(name);
    }

    @Override
    public void doSomethingFirst(Object o) {
        this.setMentalState(MentalState.FULL);
        System.out.println(this + " сыт проделками");
    }

    @Override
    public void doSomethingSecond(Object o) {
        this.setMentalState(MentalState.LISTEN);
        System.out.println(this + " услышал");
    }

    @Override
    public void doSomethingThird(Object o) {
        this.setMentalState(MentalState.THINK);
        System.out.println(this + " подумал и пожалел " + o + " захотелось вернуться домой");
    }

    @Override
    public void doSomethingWithHuman(Human human) {
        dayTime.setDayTime(lab4.superclasses.DayTime.DayTimeMode.NIGHT);
        System.out.println(dayTime);
        System.out.println(this + " и " + human + " взялись за руки и побрели к домику");
    }

    @Override
    public void doSomething(Object o) {
        this.setMentalState(MentalState.LISTEN);
        System.out.println(this + " услышал");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof doing.Child;
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    public class DayTime implements lab4.superclasses.DayTime {

        DayTimeMode dayTimeMode = DayTimeMode.DAY;

        @Override
        public void setDayTime(DayTimeMode dayTimeMode) {
            this.dayTimeMode = dayTimeMode;
        }

        @Override
        public DayTimeMode getDayTime() {
            return dayTimeMode;
        }

        @Override
        public String toString() {
            return "время дня " + dayTimeMode;
        }

        @Override
        public boolean equals(Object o) {
            return o instanceof DayTime;
        }

        @Override
        public int hashCode() {
            return 17 * dayTimeMode.hashCode();
        }

    }

    public static class ChildCheckingException extends Exception {

        public ChildCheckingException() {
            super();
        }

        public ChildCheckingException(String message) {
            super(message);
        }

        public ChildCheckingException(String errorMessage, Throwable err) {
            super(errorMessage, err);
        }

        public ChildCheckingException(Throwable cause) {
            super(cause);
        }
    }
}
