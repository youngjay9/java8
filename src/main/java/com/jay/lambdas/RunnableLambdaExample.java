package com.jay.lambdas;

public class RunnableLambdaExample {

  public static void main(String[] args) {

    // java8 以前的寫法
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Inside runnable");
      }
    };

    new Thread(runnable).start();

    // java8 Lambda ==> 實作一個 FunctionalInterface
    // single abstract method(SAM)
    // () -> {}
    Runnable runnableLambda = () ->{
      System.out.println("Inside runnableLambda");
    };

    new Thread(runnableLambda).start();

  }
}
