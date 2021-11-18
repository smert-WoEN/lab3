import java.util.Objects;

public class SweetCake implements Cake{

    private boolean readiness = false;

    public void setReadiness(boolean readiness) {
        this.readiness = readiness;
    }

    @Override
    public boolean getReadiness() {
        return this.readiness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SweetCake)) return false;
        SweetCake sweetCake = (SweetCake) o;
        return getReadiness() == sweetCake.getReadiness();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReadiness());
    }

    @Override
    public String toString() {
        return "Сладкий пирог{" + (getReadiness() ? "Готов" : "Не готов") + " к употреблению}";
    }
}
