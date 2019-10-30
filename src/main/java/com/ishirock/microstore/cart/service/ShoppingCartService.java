package com.ishirock.microstore.cart.service;

import com.ishirock.microstore.cart.model.ShoppingCart;

public interface ShoppingCartService {

    public ShoppingCart calculateCartPrice(ShoppingCart sc);

    public ShoppingCart getShoppingCart(String cartId);

    public ShoppingCart addToCart(String cartId, String itemId, int quantity);

    public ShoppingCart removeFromCart(String cartId, String itemId, int quantity);

    public ShoppingCart checkoutShoppingCart(String cartId);

}
