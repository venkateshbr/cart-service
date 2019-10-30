package com.ishirock.microstore.cart.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ishirock.microstore.cart.model.ShoppingCart;
import com.ishirock.microstore.cart.service.ShoppingCartService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("/cart")
public class CartController {

    private static final Logger LOG = LoggerFactory.getLogger(CartController.class);

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/{id}")
    public ShoppingCart getCart(@PathVariable("id") String cartId) {
        return shoppingCartService.getShoppingCart(cartId);
    }

    @PostMapping("/{cartId}/{itemId}/{quantity}")
	@ResponseStatus(HttpStatus.OK)
    public ShoppingCart add(@PathVariable("cartId") String cartId, @PathVariable("itemId") String itemId, @PathVariable("quantity") int quantity) throws Exception {
        return shoppingCartService.addToCart(cartId, itemId, quantity);
    }

    
    @DeleteMapping("/{cartId}/{itemId}/{quantity}")
    public ShoppingCart delete(@PathVariable("cartId") String cartId, @PathVariable("itemId") String itemId, @PathVariable("quantity") int quantity) throws Exception {
        return shoppingCartService.removeFromCart(cartId, itemId, quantity);
    }
    

    @PostMapping("/checkout/{cartId}")
    public ShoppingCart checkout(@PathVariable("cartId") String cartId) {
        // TODO: register purchase of shoppingCart items by specific user
        ShoppingCart cart = shoppingCartService.checkoutShoppingCart(cartId);
        LOG.info("ShoppingCart " + cart + " checked out");
        return cart;
    }
    
}
