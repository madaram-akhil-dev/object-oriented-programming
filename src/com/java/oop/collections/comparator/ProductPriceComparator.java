package com.java.oop.collections.comparator;

import com.java.oop.collections.model.Product;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getMaxRetailPrice(), o2.getMaxRetailPrice());
    }
}
