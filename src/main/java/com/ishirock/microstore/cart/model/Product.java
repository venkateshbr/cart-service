package com.ishirock.microstore.cart.model;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = -7304814269819778382L;

    private String id;

    private String name;

    private String desc;

    private double price;
    
    //private String imageUrl;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String itemId) {
        this.id = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}*/

	@Override
    public String toString() {
        return "Product [itemId=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
    }
}
