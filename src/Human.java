public abstract class Human {

    private final String name;

    private MentalState mentalState = MentalState.NORMAL;

    public String getName() {
        return name;
    }

    public MentalState getMentalState(){
        return mentalState;
    }

    public void setMentalState(MentalState mentalState){
        this.mentalState = mentalState;
    }

    Human(String name) {
        this.name = name;
    }

    abstract void doSomething(Object o);

    @Override
    public String toString() {
        return "Человек с именем" + getName() + " и настроением" + getMentalState();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return this.getMentalState() == human.getMentalState();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + mentalState.hashCode();
        return result;
    }
}
