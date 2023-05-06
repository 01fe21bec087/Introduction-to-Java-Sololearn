/*
Author: Abhinav Pawar
Date: 06-05-2023
*/

/*
Celsius to Fahrenheit

You are making a Celsius to Fahrenheit converter.
 Write a method to take the Celsius value as an argument and return the corresponding Fahrenheit value.
Sample Input
36
Sample Output
96.8
The given code takes the celsius value as input and passes it to a fahr () method, which you need to create.
The following equation is used to calculate the Fahrenheit value: 1.8 * celsius + 32.
*/


import java.util.Scanner;

public class Program {
    //your code goes here
    static double fahr(double c){
        double f=1.8*c+32;
        return f;
    }
    
    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
    }
}
