package com.example.java;
import java.util.Scanner;
public class AddTen {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = "";
    float n;
    while (!input.equals("q")) {
        System.out.print("Enter a number, or type q to quit: ");
        input = scan.nextLine();
        try{
         n = Float.parseFloat(input);
         float sum = n+(float)10;
         System.out.println(n+ " + "+"10"+" = "+ sum);
        }catch(NumberFormatException e){
            System.out.println(input+" is not a floating point number. Please try again!");
        } 
    }
    System.out.println("The user quit. Thank you.");
    scan.close();
  }
}