package org.example02;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String Name = name.nextLine();
        System.out.println(Name + " has " + Name.length() + " characters");
    }
}
