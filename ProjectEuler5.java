package projectEuler;

import java.util.Scanner;

public class ProjectEuler5 {
	
	/**
	 *This problem is a programming version of Problem 5 from projecteuler.net
	 *
	 *2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 *
	 *What is the smallest positive number that is evenly divisible(divisible with no remainder) by all of the numbers from  to ?
	 *
	 *Input Format
	 *
	 *  First line contains  that denotes the number of test cases. This is followed by  lines, each containing an integer, .
	 *
	 *Constraints
	 *
	 *  1<=T<=10
	 *  1<=N<=40
	 *  
	 *Output Format
	 *
	 *  Print the required answer for each test case.
	 *
	 *Sample Input 0
	 *
	 *  2
	 *  3
	 *  10
	 *Sample Output 0
	 *
	 *  6
	 *  2520
	 *Explanation 0
	 *
	 *  You can check 6 is divisible by each of {1, 2, 3}, giving quotient of {6, 3, 2} respectively.
	 *  You can check 2520 is divisible by each of {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} giving quotient of {2520,1260, 840, 630, 504, 420, 360, 315, 280, 252} respectively.
	 **/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long res = (long) Math.pow(2, Math.floor(Math.log(n)/Math.log(2)));
            res *= (long) Math.pow(3, Math.floor(Math.log(n)/Math.log(3)));
            for(long i=5,j=0;i<=n;i+=2+2*(j%2),j++)
            {
            	if(isPrime(i))
            	{
           		  res *= (long) Math.pow(i, Math.floor(Math.log(n)/Math.log(i)));
            	}
            }
            System.out.println(res);
        }
        in.close();
    }

	private static boolean isPrime(long p) {
		if(p==2)
			return true;
		if(p%2==0)
			return false;
		for(int i=3;i<=Math.sqrt(p);i+=2)
			if(p%i==0)
				return false;
		return true;
	}
}