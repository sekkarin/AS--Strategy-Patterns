package com.example;

public class ScanPayment implements PaymentStrategy {
  public void pay(int amount) {
    System.out.println("ScanPayment " + amount);
  }
}
