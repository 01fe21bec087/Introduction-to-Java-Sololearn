

/* Author: Abhinav Pawar
Date: 04-05-2023
*/
/*
Factorial

The factorial of a number N is equal to 1 *2*3*... *N For example, the factorial of 5 is 1*2*3*4*5 = 120.
Create a program that takes a number from input and output the factorial of that number.
Use a for loop to make the calculation, and start the loop from the number 1.
*/

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int factorial = 1;
    for(int i=1;i<=N;i++)
    {
        factorial *= i;
    }
    System.out.println(factorial);
   }
}
