package com.java.oop.collections.model;

import com.java.oop.collections.comparator.ProductIdComparator;
import com.java.oop.collections.comparator.ProductPriceComparator;

import java.util.*;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int maxRetailPrice;
    private int discountPercentage;
    private boolean isAvailable;
    private String company;
    private String category;
    private int manufacturedYear;

    public Product() {

    }

    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public int getMaxRetailPrice() {
        return maxRetailPrice;
    }

    public Product setMaxRetailPrice(int maxRetailPrice) {
        this.maxRetailPrice = maxRetailPrice;
        return this;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public Product setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
        return this;

    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Product setAvailable(boolean available) {
        isAvailable = available;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Product setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Product setCategory(String category) {
        this.category = category;
        return this;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public Product setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
        return this;
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(1111);
        product1.setName("Asus vivo book");
        product1.setMaxRetailPrice(68999);
        product1.setDiscountPercentage(10);
        product1.setAvailable(true);
        product1.setCompany("Asus");
        product1.setCategory("Laptop");
        product1.setManufacturedYear(2023);
        Product product2 = new Product();
        product2.setId(2222);
        product2.setName("HP chrome book");
        product2.setMaxRetailPrice(78999);
        product2.setDiscountPercentage(11);
        product2.setAvailable(true);
        product2.setCompany("HP");
        product2.setCategory("Laptop");
        product2.setManufacturedYear(2023);
        Product product3 = new Product();
        product3.setId(3333);
        product3.setName("Mac book");
        product3.setMaxRetailPrice(98999);
        product3.setDiscountPercentage(5);
        product3.setAvailable(true);
        product3.setCompany("Apple");
        product3.setCategory("Laptop");
        product3.setManufacturedYear(2023);
        Product product4 = new Product();
        product4.setId(3333);
        product4.setName("Mac book");
        product4.setMaxRetailPrice(98999);
        product4.setDiscountPercentage(5);
        product4.setAvailable(true);
        product4.setCompany("Apple");
        product4.setCategory("Laptop");
        product4.setManufacturedYear(2023);
        // if given duplicate it adds to the set to avoid this we write equals() and hashcode() overridden method.
        //HashSet does not maintain insertion order
        Set< Product > hashSetProducts  = new HashSet<>();
        hashSetProducts.add(product3);
        hashSetProducts.add(product1);
        hashSetProducts.add(product2);
        hashSetProducts.add(product4);

        // LinkedHashSet maintains insertion order
        Set<Product> linkedHashSetProducts = new LinkedHashSet<>();
        linkedHashSetProducts.add(product3);
        linkedHashSetProducts.add(product1);
        linkedHashSetProducts.add(product2);
        linkedHashSetProducts.add(product4);

        //TreeSet maintains sorted order
        Set<Product> treeSetProducts = new TreeSet<>(new ProductIdComparator());
        treeSetProducts.add(product3);
        treeSetProducts.add(product1);
        treeSetProducts.add(product2);
        treeSetProducts.add(product4);

        Set<Product> priceSortedProducts = new TreeSet<>(new ProductPriceComparator());
        priceSortedProducts.add(product3);
        priceSortedProducts.add(product1);
        priceSortedProducts.add(product2);
        priceSortedProducts.add(product4);

        System.out.println("HashSet Output:");
        System.out.println(hashSetProducts);

        System.out.println();

        System.out.println("LinkedHashSet Output:");
        System.out.println(linkedHashSetProducts);

        System.out.println();

        System.out.println("TreeSet Output:");
        System.out.println(treeSetProducts);

        System.out.println();
        System.out.println("Price Sorted TreeSet Output:");
        System.out.println(priceSortedProducts);

        System.out.println();

        System.out.println("HashSet Size: " + hashSetProducts.size());
        System.out.println("LinkedHashSet Size: " + linkedHashSetProducts.size());
        System.out.println("TreeSet Size: " + treeSetProducts.size());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && maxRetailPrice == product.maxRetailPrice && discountPercentage == product.discountPercentage && isAvailable == product.isAvailable && manufacturedYear == product.manufacturedYear && Objects.equals(name, product.name) && Objects.equals(company, product.company) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, maxRetailPrice, discountPercentage, isAvailable, company, category, manufacturedYear);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                ", discountPercentage=" + discountPercentage +
                ", isAvailable=" + isAvailable +
                ", company='" + company + '\'' +
                ", category='" + category + '\'' +
                ", manufacturedYear=" + manufacturedYear +
                '}';
    }
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.id, other.id);
    }
}
