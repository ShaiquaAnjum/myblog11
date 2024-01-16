package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class testemployee {
    public static void main(String[] args) {
        List<testemp> Employee = Arrays.asList(
                new testemp("Shyqa",30,"Banglore"),
                new testemp("Farheen",35,"Ranchi"),
                new testemp("Aman",30,"Banglore"),
                new testemp("Mohit",30,"Ranchi")


        );
        Map<String, List<testemp>> collect = Employee.stream().collect(Collectors.groupingBy(e -> e.getCity()));
        for(Map.Entry<String, List<testemp>> entry:collect.entrySet()){
            String key = entry.getKey();
            List<testemp> value = entry.getValue();
            for(testemp e :value){
                System.out.println(e.getName());
                System.out.println(e.getAge());
                System.out.println(e.getCity());
            }
        }
        List<testemp> collect1 = Employee.stream().filter(e -> e.getAge() ==30).collect(Collectors.toList());
        for(testemp e:collect1){
            System.out.println(e.getName());
        }


    }
}
