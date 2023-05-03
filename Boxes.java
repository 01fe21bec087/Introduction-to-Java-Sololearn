/* Author: Abhinav Pawar
Date: 03-05-2023
*/
/*
Boxes

You are making a robot that should categorize items by their color.
Each color corresponds to a box with a specific number.
For simplicity, our program will handle 3 colors:
red goes to box #1
green goes to box #2
black goes to box #3
Your program needs to take a color as input and output the corresponding box number.

Sample Input
green
Sample Output
2
Remember, you can use the switch statement to check for different conditions.
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        String colour=sc.nextLine();
        switch(colour)
        {
            case "red":System.out.println("1");
            break;
            case "green":System.out.println("2");
            break;
            case "black":System.out.println("3");
        }
    }
}
