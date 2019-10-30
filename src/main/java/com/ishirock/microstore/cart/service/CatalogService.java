package com.ishirock.microstore.cart.service;

import com.ishirock.microstore.cart.model.Product;

public interface CatalogService {

    Product getProduct(String itemId);

}
