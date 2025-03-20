package org.example.concepts.ejb.sessionbean.stateful.shoppingcart;

import jakarta.ejb.Stateful;

import java.util.ArrayList;
import java.util.List;

@Stateful
public class ShoppingCartBean implements ShoppingCart{

    private List<String> items = new ArrayList<>();

    @Override
    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public void removeItem(String item) {
        items.remove(item);
    }

    @Override
    public List<String> getItems() {
        return new ArrayList<>(items); // Return a copy to avoid external modification
    }

    @Override
    public void clearCart() {
        items.clear();
    }
}
