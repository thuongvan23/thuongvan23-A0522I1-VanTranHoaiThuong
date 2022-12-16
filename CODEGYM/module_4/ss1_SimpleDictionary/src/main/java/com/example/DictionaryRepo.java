package com.example;

import java.util.Map;
import java.util.TreeMap;

public class DictionaryRepo {
    private static final Map<String, String> words = new TreeMap<>();

    static {
        words.put("Cat", "Mèo");
        words.put("Dog", "Chó");
        words.put("Red", "Màu đỏ");
        words.put("Horse", "Ngựa");
        words.put("Yellow", "Vàng");
    }

    public static String translate(String eng){
        if (words.get(eng) != null){
            return words.get(eng);
        }
        return "Does not exits";
    }
}
