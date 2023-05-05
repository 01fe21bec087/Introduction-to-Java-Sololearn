/*
Author: Abhinav Pawar
Date: 05-05-2023
*/

/*Movie Theater

You are creating a ticketing program for a small movie theater.
 The seats are represented using a 2-dimensional array.
 Each item can have the values 1 and 0.
 1 is occupied, and 0 if it's free.
Your program needs to take as input the row and the column of the seat 
and output Free if it's free, and sold if it's not.
*/

import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();
                if(seats[row][col]==0)
                    System.out.println("Free");
                else
                    System.out.println("Sold");
    }

}



/* Taking this problem statement further...
Display the status of each seat:



import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        for (int row=0;row<seats.length; row++)
        {
            for (int col=0;col<seats[row].length; col++)
            {
               if(seats[row][col]==0)
                    System.out.print(" Free ");
                else
                    System.out.print(" Sold "); 
            }
            System.out.println();
        }
    }

}


*/
