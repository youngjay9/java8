package com.jay.streams.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFlatMap {

  public static void main(String[] args) {

    /**
     * 以下的例子將重複的字元 distinct 後輸出,需用 flatMap 處理
     * Hello, World ==> H, e, l, o, W, r, d
     */

    List<String> words = Arrays.asList("Hello", "World");

    words.stream()
        // 轉成 Stream<String[]>
        .map(word -> word.split(""))
        // 使用 map 是將上一步每一個 Stream 物件的內容(String[]) 轉成各別的 Stream<String>
        .map(wordArr -> Arrays.stream(wordArr))
        .distinct().collect(Collectors.toList());

    words.stream()
        // Stream<String[]>
        .map(word->word.split(""))
        // 使用 flatMap 是將上一步每一個 Stream 物件的內容轉成單一個 String
        .flatMap(wordArray->Arrays.stream(wordArray))
        .distinct()
        .collect(Collectors.toList());
  }

}
