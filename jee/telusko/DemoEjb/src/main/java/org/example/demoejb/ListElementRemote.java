package org.example.demoejb;

import jakarta.ejb.Remote;

import java.util.List;

@Remote
public interface ListElementRemote {
    void addElement(int e);
    void removeElement(int e);
    List<Integer> getElements();
}
