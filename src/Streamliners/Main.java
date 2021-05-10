package Streamliners;

import Streamliners.models.Cart;
import Streamliners.models.Product;
import Streamliners.models.ProductOperations;
import Streamliners.models.Variant;
import Streamliners.models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ProductOperations productOperations = new ProductOperations();
        CartOperations cartOperations = new CartOperations();

        //cart object of Cart class to store items
        Cart cart = new Cart();


        System.out.println("\033[0;32m" + "WELCOME!" + "\033[0m");

        String operations = "\nFollowing are the operations you can perform using this application:\n" +
                "0: View all products.\n" +
                "\033[0;34m" + "For the ADMIN\n" + "\033[0m" +
                "1: Add a product.\n" +
                "2: Edit a product.\n" +
                "3: Delete a product.\n" +
                "\033[0;34m" + "For the CUSTOMER\n" + "\033[0m" +
                "4: Add a product to the cart.\n" +
                "5: Edit a product from the cart.\n" +
                "6: Delete a product from the cart.\n" +
                "7: View the cart.\n" +
                "8: Place the order.\n" +
                "9: Cancel the order.\n" +
                "10: Exit the application.\n" +
                "Select the operation you want to perform:" ;



        while(true){

            System.out.print(operations);
            int choice = input.nextInt();
            System.out.println();

            switch (choice)
            {
                case 0:
                {
                    if (productOperations.allProducts.isEmpty()){
                        System.out.println("\u001B[33m" + "\nSorry! No product available to show.\n" + "\033[0m");
                        break;
                    }
                    System.out.println("\u001B[33m" + productOperations + "\u001B[0m");
                    break;
                }

                case 1:
                {
                    System.out.println("\u001B[33m" + "Add a product:" + "\033[0m");
                    productOperations.addProduct();
                    break;
                }

                case 2:
                {
                    System.out.println("\u001B[33m" + "Edit a product:" + "\033[0m");
                    productOperations.editProduct();
                    break;
                }

                case 3:
                {
                    System.out.println("\u001B[33m" + "Delete a product:" + "\033[0m");
                    productOperations.deleteProduct();
                    break;
                }

                case 4:
                {
                    System.out.println("\u001B[33m" + "Add a product to the cart:" + "\033[0m");
                    cartOperations.addToCart(cart, productOperations);
                    break;
                }

                case 5:
                {
                    System.out.println("\u001B[33m" + "Edit a product from the cart:" + "\033[0m");
                    cartOperations.editFromCart(cart, productOperations);
                    break;
                }

                case 6:
                {
                    System.out.println("\u001B[33m" + "Remove a product from the cart:" + "\033[0m");
                    cartOperations.removeFromCart(cart, productOperations);
                    break;
                }

                case 7:
                {
                    if (cart.cartItems.isEmpty()){
                        System.out.println("\u001B[33m" + "\nYour cart is empty!\n" + "\033[0m");
                        break;
                    }
                    System.out.println( cart );
                    break;
                }

                case 8:
                {
                    System.out.println("\u001B[32m" + "THANK YOU! Your order has been receiced successfully.\nDo visit again!" + "\u001B[0m");
                    break;
                }

                case 9:
                {
                    cartOperations.deleteCart(cart, productOperations);
                    System.out.println("\u001B[32m" + "Your order has been cancelled.\nThank You! Do visit again!" + "\u001B[0m");
                    break;
                }

                case 10:
                {
                    System.out.println("\u001B[33m" + "You exit the application." + "\u001B[0m");
                    return;
                }

                default:
                    System.out.println("\u001B[31m" + "ERROR! You entered wrong input. Please select from 0 to 10" + "\u001B[0m");
            }
        }
    }
}
