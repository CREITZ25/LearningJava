package com.example.helloworld;

public class Main {
    public static void main(String[] args) {
        String name = "Carsten";
        String job = "Software Entwickler";
        showGreetings(10);
        showGreetings(20);
        System.out.println("Ich heiße " + name + ". Ich arbeite als " + job + ".");
    }
    public static void showGreetings(Integer hour){
        if (hour < 12) {
            System.out.println("Guten Morgen!");
        } else if (hour < 18) {
            System.out.println("Guten Tag!");
        } else {
            System.out.println("Guten Abend!");
        }
    }
}