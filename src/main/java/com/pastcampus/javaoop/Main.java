package com.pastcampus.javaoop;

import com.pastcampus.javaoop.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("hello World");
        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
