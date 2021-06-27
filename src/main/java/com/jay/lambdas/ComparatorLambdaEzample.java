package com.jay.lambdas;

import java.util.Comparator;

public class ComparatorLambdaEzample {

  public static void main(String[] args) {
    // prior java8
    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2); // 0 ==> o1 == o2
        // 1 ==> o1 > o2
        // -1 ==> o1 < o2
      }
    };

    System.out.println("Result comparator:" + comparator.compare(5, 6));

    // java8
    Comparator<Integer> comparatorLambda = (Integer o1, Integer o2) -> {
      return o1.compareTo(o2);
    };

    System.out.println("Result comparatorLambda:" + comparatorLambda.compare(6, 7));
  }
}
