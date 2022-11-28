package com.generics;

import java.util.ArrayList;
import java.util.List;

public class generics {
    public static void main(String[] args) {
        System.out.println((method(2,5)));
        System.out.println((method(2,"raj")));
        System.out.println((method("taj",'r')));
        System.out.println((method("taj","rajdharsingh")));



    }
    static <T>List<T> method(T s1 ,T s2)
    {
    List<T> list =new ArrayList<>();
    list.add(s1);
    list.add(s2);
    return list;
    }

}
