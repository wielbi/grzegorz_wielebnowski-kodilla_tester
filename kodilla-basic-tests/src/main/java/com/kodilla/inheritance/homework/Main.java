package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {

        Computer Asus = new Computer();
        Asus.macOS = "turnOn";
        Asus.Windows = "turnOf";


        System.out.println( Asus.macOS);
        System.out.println(Asus.Windows);
        Asus.uruchomSystem();
    }
}
