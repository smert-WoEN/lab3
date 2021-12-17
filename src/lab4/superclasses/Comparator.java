package lab4.superclasses;

import superclasses.Human;

import java.util.ArrayList;

public interface Comparator {
    void comparator(Human human, Human human1);
    void unComparator(Human human, Human human1);
    ArrayList<ArrayList<Object>> getHumansPairs();
    String getHumanPairs();
}
