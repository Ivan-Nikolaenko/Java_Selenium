package main.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int count=0;
        for (int i = 0; i <100; i++) {
            System.out.println("My change");
            count++;
        }
        System.out.println(count);
        int[] arrayInt=new int[10];
        for (int i = 0; i < 10; i++) {
            arrayInt[i]=i*3;
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}