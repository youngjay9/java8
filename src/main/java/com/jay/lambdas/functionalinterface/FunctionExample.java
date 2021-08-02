package com.jay.lambdas.functionalinterface;

import java.util.function.Function;

public class FunctionExample {

  static Function<String, String> fun = (str) -> str.toUpperCase();

  static Function<String, String> fun2 = (str) -> str.toUpperCase().concat(" second execute");


  public static void main(String[] args) {

    System.out.println("result is: " + fun.apply("java8"));

    System.out.println("result of andThen is: " + fun.andThen(fun2).apply("java8"));


  }
}
