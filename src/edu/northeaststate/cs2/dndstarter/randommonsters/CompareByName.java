package edu.northeaststate.cs2.dndstarter.randommonsters;

import edu.northeaststate.cs2.dndstarter.randommonsters.monsters.Monster;

import java.util.Comparator;

public class CompareByName implements Comparator<Monster> {
    @Override
    public int compare(Monster m1, Monster m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
