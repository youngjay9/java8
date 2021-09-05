package com.jay.streams.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

  public static void main(String[] args) {

    Optional<Dish> dish = Dish.menu.stream().filter(Dish::isVegetarian).findAny();




  }
}
