./*
Author: Abhinav Pawar
Date: 04-05-2023
*/
/*
Sum

Your math teacher asked you to calculate the sum of the numbers 1 to N, where N is a given number.
Task: Take an integer N from input and output the sum of the numbers 1 to N, inclusive.

Sample Input: 10
Sample Output: 55
The sum of the numbers 1 to 10 is 55.
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,sum=0;
        while(i<=n)
        {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}
