/* 
Author: Abhinav Pawar
Date: 04-05-2023
*/

/*
Vending Machine

You are making a program for a vending machine that provides drinks. 
The menu of the drinks is stored in an array called menu
String[] menu = ("Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
Take the choice of the customer as an integer from input and
output the corresponding menu item.
Also, check for errors: in case the input is out of the range of the array, output "Invalid".
The choice defines the index of the array.
*/

import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int ch = sc.nextInt();
        if(ch>=0 && ch<5){
            System.out.println(menu[ch]);
        }
        else
            System.out.println("Invalid");
    }

}
