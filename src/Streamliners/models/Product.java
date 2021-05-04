package Streamliners.models;

import java.util.Objects;

public class Product {
    public String name, imageURL;

    //default constructor
    public Product() {
    }

    //parameterized constructor
    public Product(String name, String imageURL) {
        this.name = name;
        this.imageURL = imageURL;
    }

    //Overrides toString() method of the Object Class
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    //Overrides equals() method of the Object Class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(imageURL, product.imageURL);
    }

    //Overrides hashCode() method of the Object Class
    @Override
    public int hashCode() {
        return Objects.hash(name, imageURL);
    }
}
