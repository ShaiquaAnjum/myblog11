package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testlogin {
    public static void main(String[] args) {
        List<login> logins = Arrays.asList(new login("shaiqua_45","23456"),
                (new login("amanrah","4567")));


        List<logindto> dtos = logins.stream().map(login1 -> maptodto(login1)).collect(Collectors.toList());
        System.out.println(dtos);


    }
        static logindto maptodto (login login){
        logindto dto = new logindto();
        dto.setUsername(login.getUsername());
        dto.setPassword(login.getPassword());
        return dto;
        }

    }

