package projectEuler;

import java.util.Scanner;

public class ProjectEuler1 {
  
  /**
   * This problem is a programming version of Problem 1 from projecteuler.net
   * 
   * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
   *
   *Find the sum of all the multiples of 3 or 5 below N.
   *
   *Input Format
   *
   *First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.
   *
   *Constraints
   *
   *  1<=T<=10^5
   *  10<=N<=10^9
   *  
   *Output Format
   *
   *For each test case, print an integer that denotes the sum of all the multiples of  or  below .
   *
   *Sample Input 0
   *
   *  2
   *  10
   *  100
   *
   *Sample Output 0
   *
   *  23
   *  2318
   *  
   *Explanation 0
   *
   *For N=10, if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5 6 and 9. The sum of these multiples is 23.
   *
   *Similarly for N=100, we get 2318.
   * */
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      long n = in.nextLong();
      long sum=0;
      n--;
      long x=n-n%3;
      sum+=(x)*(x+3)/6;
      x=n-n%5;
      sum+=(x)*(x+5)/10;
      x=n-n%15;
      sum-=(x)*(x+15)/30;
      System.out.println(sum);
      in.close();
    }
  }
}