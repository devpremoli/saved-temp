package org.example.demoejb;

import jakarta.ejb.Stateful;

import java.util.ArrayList;
import java.util.List;

@Stateful
public class ListElementImpl implements ListElementRemote{

    List<Integer> values = new ArrayList<>();
    @Override
    public void addElement(int e) {
        values.add(e);
    }

    @Override
    public void removeElement(int e) {
        values.remove(Integer.valueOf(e));
    }

    @Override
    public List<Integer> getElements() {
        return values;
    }
}
