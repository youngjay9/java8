package com.jay.lambdas.methodreferences;

import com.jay.lambdas.data.Student;
import com.jay.lambdas.data.StudentDataBase;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class MethodReferenceExample {

  /**
   * Lambda: (args) -> ClassName.staticMethod(args) MethodReference: ClassName::staticMethod
   */
  public static void demo1() {
    ToIntFunction<String> lambda = (String s) -> Integer.parseInt(s);
    System.out.println("lambda: " + lambda.applyAsInt("9"));

    ToIntFunction<String> methodReference = Integer::parseInt;
    System.out.println("methodReference: " + methodReference.applyAsInt("9"));
  }

  /**
   * Lambda: (arg0, rest) -> arg0.instanceMethod(rest)
   * arg0 is of type ClassName
   * MethodReference: ClassName::instanceMethod
   */
  public static void demo2() {
    BiPredicate<List<String>, String> lambda = (list, element) -> list.contains(element);
    System.out.println("lambda: " + lambda.test(Arrays.asList("a", "b", "c"), "d"));

    BiPredicate<List<String>, String> methodReference = List::contains;
    System.out
        .println("methodReference:" + methodReference.test(Arrays.asList("a", "b", "c"), "c"));
  }

  /**
   * Lambda: (args) -> expr.instanceMethod
   * MethodReference: expr::instanceMethod
   */
  public static void demo3(){


  }



  public static void main(String[] args) {

    demo1();

    demo2();
  }
}
