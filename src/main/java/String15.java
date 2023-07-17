package main.java;

public class String15 {
    public static void main(String[] args) {
        String s = "Hi!";
        String s1 = new String("Hi!");

        System.out.println(s==s1);
        System.out.println(s.equals(s1));
    }
}
