package lab4.doing;

import lab4.superclasses.Comparator;
import superclasses.Human;

import java.util.ArrayList;

public class ComparatorHumans implements Comparator {
    private final ArrayList<ArrayList<Object>> humanPair = new ArrayList<>();

    @Override
    public void comparator(Human human, Human human1) {
        ArrayList<Object> humans = new ArrayList<>();
        humans.add(human);
        humans.add(human1);
        humanPair.add(humans);
        System.out.println("взялись за руки и пошли " + humans);
    }

    @Override
    public void unComparator(Human human, Human human1) {
        ArrayList<Object> humans = new ArrayList<>();
        humans.add(human);
        humans.add(human1);
        humanPair.remove(humans);
        System.out.println("Перестали идти вместе " + humans);
    }

    @Override
    @SuppressWarnings("unchecked")
    public ArrayList<ArrayList<Object>> getHumansPairs() {
        return (ArrayList<ArrayList<Object>>) humanPair.clone();
    }

    @Override
    public String getHumanPairs() {
        return "вместе идут " + getHumansPairs();
    }
}
