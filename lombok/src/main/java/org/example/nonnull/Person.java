package org.example.nonnull;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// https://projectlombok.org/features/NonNull

class EquivalentPerson {

    private final String name;

    public EquivalentPerson(final String name) {
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        }
        this.name = name;
    }

//    public EquivalentPerson(@NonNull final String name) {
//        this.name = name;
//    }
}

@RequiredArgsConstructor
public class Person {
    @NonNull
    private final String name;

    public static void main(String[] args) {

        //EquivalentPerson person = new EquivalentPerson(null);

        Person personA = new Person(null);

    }
}
