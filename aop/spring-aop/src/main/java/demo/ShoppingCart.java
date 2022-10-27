package demo;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {


    public void checkout(String status) {
        //Logging
        //Authentication & Authorization
        //Sanitization
        System.out.println("Checkout Method from Shopping Cart Called");
    }

    public int quantity() {
        return 2;
    }

}
