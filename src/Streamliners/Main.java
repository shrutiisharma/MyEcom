package Streamliners;

import Streamliners.models.Product;
import Streamliners.models.Variant;
import Streamliners.models.VariantsBasedProduct;
import Streamliners.models.WeightBasedProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //creating an object of the Product class
        Product product = new Product("Mango", "mangoImg");
        System.out.println(product);

/*
        //null
        Product product1 = new Product();
        System.out.println(product1);

        o/p = Product{name='null', imageURL='null'}

        //null pointer exception error
         System.out.println(product1.name.toUpperCase());
*/


        //weightBasedProduct
        WeightBasedProduct weightBasedProduct = new WeightBasedProduct(
                "Apple", "AppleImg", 100, 1);

        System.out.println(weightBasedProduct);

/*
        //list data type
        List<String> strings = new ArrayList<>(
                Arrays.asList("A", "B", "C")
        );
        System.out.println(strings);
*/


        //variant
        List<Variant> variants = new ArrayList<>(
                        Arrays.asList(new Variant("500g", 90 ), new Variant("1kg", 180))
                );


        //variantBasedProduct
        VariantsBasedProduct variantsBasedProduct = new VariantsBasedProduct(
                "Kiwi", "kiwiImg", variants);

        System.out.println(variantsBasedProduct);


        //equals() and hashCode() methods
        Product a = new Product("a", "");
        Product b = new Product("a", "");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));


        //Adding products in list
        List<Product> products = new ArrayList<>(
                Arrays.asList(weightBasedProduct, variantsBasedProduct)
        );

        System.out.println(products);
    }
}
