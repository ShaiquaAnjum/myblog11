package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass1 {

    //predicate
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shyqa","Aman","Shahin","Saina","Fiya");
        List<String> filteredNames = names.stream().filter(x->x.startsWith("S")).collect(Collectors.toList());
        System.out.println(filteredNames);

        List<String> name = Arrays.asList("Ass","Hole");
        List<String> n = name.stream().filter(y->y.equals("Ass")).collect(Collectors.toList());
        System.out.println(n);
        
        
    }
}
