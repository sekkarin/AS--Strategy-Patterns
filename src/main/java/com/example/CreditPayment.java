package com.example;

public class CreditPayment implements PaymentStrategy {
  public void pay(int amount) {
    // System.out.println("CreditPayment");
    System.out.println("CreditPayment " + amount);
  }
}
