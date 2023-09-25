package com.example;

public class CashPayment implements PaymentStrategy {
  public void pay(int amount) {
    System.out.println("CashPayment " + amount);
  }
}
