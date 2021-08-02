package com.jay.lambdas.functionalinterface;

import com.jay.lambdas.data.Student;
import com.jay.lambdas.data.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

  public static void main(String[] args) {
    BiConsumer<String, String> biConsumer = (a, b) -> {
      System.out.println("a:" + a + " b:" + b);
    };

    biConsumer.accept("java", "spring");

    List<Student> studentList = StudentDataBase.getAllStudents();

    studentList.forEach((student) -> biConsumer.accept(student.getName(), student.getGender()));
  }
}
