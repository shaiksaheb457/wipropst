package com.wipro.exception;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EX5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");

        Set<String> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}
