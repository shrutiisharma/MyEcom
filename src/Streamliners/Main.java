package Streamliners;

import Streamliners.models.Cart;
import Streamliners.models.Product;
import Streamliners.models.Variant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

/*
        //hashMap introduction

        HashMap<String,Integer> map = new HashMap<>();

        map.put("A", 454845);
        map.put("B", 879452);
        map.put("C", 238856);

        System.out.println(map.containsKey("A"));      //true
*/


        //create products
        Product apple = new Product("Apple", "img", 100, 0.5f ),
                orange = new Product("Orange", "img", 80, 0.5f ),
                kiwi = new Product("Kiwi", "img", new ArrayList<>(
                        Arrays.asList(
                                new Variant("500g", 96),
                                new Variant("1kg", 180)
                        ))),
                surfExcel = new Product("Surf Excel", "img", new ArrayList<>(
                        Collections.singletonList(new Variant("1kg", 180))));


        //create object of Cart class
        Cart cart = new Cart();

        //add items
        cart.add(apple, 2.5f);

        cart.add(orange, 2.5f);

        cart.add(kiwi, kiwi.variants.get(1));
        cart.add(kiwi, kiwi.variants.get(1));
        cart.add(kiwi, kiwi.variants.get(1));

        cart.add(surfExcel, surfExcel.variants.get(0));
        cart.add(surfExcel, surfExcel.variants.get(0));

        System.out.println(cart);

        //remove items
        cart.remove(orange);
        System.out.println();
        System.out.println(cart);

        cart.decrement(surfExcel, surfExcel.variants.get(0));
        System.out.println();
        System.out.println(cart);

        cart.decrement(surfExcel, surfExcel.variants.get(0));
        System.out.println();
        System.out.println(cart);

        cart.remove(kiwi);
        System.out.println();
        System.out.println(cart);

    }
}
