package com.jay.lambdas.functionalinterface;

import com.jay.lambdas.data.Student;
import com.jay.lambdas.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

  static Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
  static Consumer<Student> c2 = (student) -> System.out.println(student.getName());
  static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
  static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

  public static void printStudentName() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(c2);
  }

  public static void printStudentNameAndActivities() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(c3.andThen(c4)); // 使用 consumer chain 串連
  }

  public static void printStudentNameAndActivitiesUsingCondition() {
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach((student -> {
      if (student.getGradeLevel() >= 3 && student.getGpa() >= 4.0) {
        c3.andThen(c4).accept(student);
      }
    }));
  }

  public static void main(String[] args) {

//    c1.accept("java8");

//    printStudentName();

//    printStudentNameAndActivities();

    printStudentNameAndActivitiesUsingCondition();
  }
}
