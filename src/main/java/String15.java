package main.java;

public class String15 {
    public static void main(String[] args) {
        String s = "Hi!";
        String s1 = new String("Hi!");

        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        String str ="My name %s! Im %d years old!";
        int age = 30;
        String name ="Ivan";

        System.out.println(String.format(str,name,age));

        String age2 = "30";
        int a = Integer.parseInt(age2);
        System.out.println(a*3);
        System.out.println(age2.length());


    }
}
