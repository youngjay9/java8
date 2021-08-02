package com.jay.lambdas.functionalinterface;

import com.jay.lambdas.data.Student;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

  static BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out
      .println(name + ":" + activities);



  public static  void printStudentNameAndActivities(List<Student> students){
    students.forEach((student -> {
      studentBiConsumer.accept(student.getName(), student.getActivities());
    }));
  }

  public static void main(String[] args) {

  }

}
