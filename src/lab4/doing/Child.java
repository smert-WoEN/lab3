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
    public String doSomethingWithHuman(Human human) throws ChildCheckingException {
        try {
            if (human.getClass() == Karloson.class) {
                dayTime.setDayTime(lab4.superclasses.DayTime.DayTimeMode.NIGHT);
                this.setMentalState(MentalState.NORMAL);
                System.out.println(dayTime);
                System.out.println(this + " и " + human + " взялись за руки и побрели к домику");
            } else {
                this.setMentalState(MentalState.CRYING);
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException err) {
            throw new ChildCheckingException(human + " это не Карлосон", err);
        }
        return "";
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
}
