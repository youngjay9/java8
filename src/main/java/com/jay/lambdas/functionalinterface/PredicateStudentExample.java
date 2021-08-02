package com.jay.lambdas.functionalinterface;

import com.jay.lambdas.data.Student;
import com.jay.lambdas.data.StudentDataBase;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

  private static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;

  private static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

  public static void filterStudentByGradeLevel() {
    List<Student> studentList = StudentDataBase.getAllStudents();

    studentList.forEach((student) -> {
      if (p1.test(student)) {
        System.out.println(student);
      }
    });
  }

  public static void filterStudentByGpa() {
    List<Student> studentList = StudentDataBase.getAllStudents();

    studentList.forEach((student -> {
      if (p2.test(student)) {
        System.out.println(student);
      }
    }));
  }

  public static void filterStudents() {
    List<Student> studentList = StudentDataBase.getAllStudents();

    studentList.forEach((student -> {
      if (p1.and(p2).test(student)) {
        System.out.println(student);
      }
    }));
  }

  public static void main(String[] args) {
//    filterStudentByGradeLevel();
//    filterStudentByGpa();

    filterStudents();
  }
}
