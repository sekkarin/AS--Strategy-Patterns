package com.example;

public class ShoppingCart {
  private PaymentStrategy paymentStrategy;

  /**
   * The function sets the payment strategy for a given object.
   * 
   * @param strategy The "strategy" parameter is of type PaymentStrategy. It is used to set the payment
   * strategy for a particular object or class.
   */
  public void setPaymentStrategy(PaymentStrategy strategy) {
    // System.out.println("sadasd");
    this.paymentStrategy = strategy;
  }

  /**
   * The paymentStrategy function takes an amount as input and calls the pay method of the
   * paymentStrategy object.
   * 
   * @param amount The amount parameter represents the amount of money that needs to be paid.
   */
  public void paymentStrategy(int amount) {
    // System.out.println("sadasd");
    this.paymentStrategy.pay(amount);
  }

}
