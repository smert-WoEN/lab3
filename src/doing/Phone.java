package doing;

import superclasses.Ringable;

public class Phone implements Ringable {

    public void ring() {
        System.out.println(this + " зазвонил!");
    }

    @Override
    public int hashCode() {
        return 17 * super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Phone;
    }

    @Override
    public String toString() {
        return "Телефон";
    }
}
