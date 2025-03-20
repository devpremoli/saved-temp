package org.example.concepts.ejb.sessionbean.stateful.shoppingcart;

import jakarta.ejb.Local;

import java.util.List;

@Local
public interface ShoppingCart {
    void addItem(String item);
    void removeItem(String item);
    List<String> getItems();
    void clearCart();
}
