/* Author: Abhinav Pawar
Date: 03-05-2023
*/
/*
Boiling Water

You are making a program for a water sensor that should check if the water is boiling. 
Take the integer temperature in Celsius as input and output "Boiling" if the temperature is above or equal to 100.
Output "Not boiling" if it's not.
Sample Input 105
Sample Output Boiling
Make sure to output the text exactly as defined in the text.
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp>=100)
            System.out.println("Boiling");
        else
            System.out.println("Not boiling");
    }
}
