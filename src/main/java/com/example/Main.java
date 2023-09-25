package com.example;

public class Main {
    // private ShoppingCart shoppingCart;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ShoppingCart shoppingCart1 = new ShoppingCart();
        ShoppingCart shoppingCart2 = new ShoppingCart();
        ShoppingCart shoppingCart3 = new ShoppingCart();
        // `shoppingCart1.setPaymentStrategy(new CashPayment());` is setting the payment strategy for
        // `shoppingCart1` to be a `CashPayment` strategy. This means that when `shoppingCart1` is used
        // to make a payment, it will use the `CashPayment` strategy to handle the payment process.
        shoppingCart1.setPaymentStrategy(new CashPayment());
        shoppingCart2.setPaymentStrategy(new CreditPayment());
        shoppingCart3.setPaymentStrategy(new ScanPayment());

        // `shoppingCart1.paymentStrategy(523);` is calling the `paymentStrategy` method on the
        // `shoppingCart1` object and passing the argument `523`. This method is responsible for
        // handling the payment process for the shopping cart. The specific behavior of the payment
        // process depends on the payment strategy that has been set for `shoppingCart1`. In this case,
        // the payment strategy is set to be a `CashPayment` strategy, so the `paymentStrategy` method
        // will use the `CashPayment` strategy to handle the payment process for the amount `523`.
        shoppingCart1.paymentStrategy(523);
        shoppingCart2.paymentStrategy(1515151515);
        shoppingCart3.paymentStrategy(200);
    }
}