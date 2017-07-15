package projectEuler;

import java.util.Scanner;

public class ProjectEuler3 {
  
  /**
   * This problem is a programming version of Problem 3 from projecteuler.net
   *
   *The prime factors of 13195 are 5,7,13 and 29.
   *
   *What is the largest prime factor of a given number N?
   *
   *Input Format
   *
   *First line contains T, the number of test cases. This is followed by T lines each containing an integer N.
   *
   *Constraints
   *
   *  1<=T<=10
   *  10<=N<=10^12
   *
   *Output Format
   *
   *  For each test case, display the largest prime factor of .
   *
   *Sample Input 0
   *
   *  2
   *  10
   *  17
   *  
   *Sample Output 0
   *
   *  5
   *  17
   *  
   *Explanation 0
   *
   *Prime factors of 10 are {2,5}, largest is 5.
   *Prime factor of 17 is 17 itself, hence largest is 17.
   * */
	
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      long n = in.nextLong();
      long i = 3;
      while(n%2 == 0){
        n /= 2;
      }
      if(n==1){
        System.out.println(2);
      }
      else{
        for(;i<=Math.sqrt(n);){
          if(n%i==0){
            n/=i;
          } 
          else{
            i+=2;
          }
        }
        System.out.println(n>2?n:i);
      }           
    }
    in.close();
  }
}
