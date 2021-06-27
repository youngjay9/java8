package com.jay.lambdas.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {

  public static void main(String[] args) {

    // 實作一個 Predicate.test, 檢查數字是否為偶數

    // prior java8
    Predicate<Integer> predicate = new Predicate<Integer>() {
      @Override
      public boolean test(Integer integer) {
        return integer % 2 == 0;
      }
    };

    System.out.println(predicate.test(9));

    // java8
    Predicate<Integer> p = (integer -> {
      return integer % 2 == 0;
    });


    System.out.println(p.test(4));
  }
}
