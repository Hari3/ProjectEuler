package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectEuler7 {
  
  /*
   * This problem is a programming version of Problem 7 from projecteuler.net
   *
   *By listing the first six prime numbers: 2, 3, 5, 7, 11 and 13, we can see that the 6th prime is 13.
   *
   *What is the Nth prime number?
   *
   *Input Format
   *
   *First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.
   *
   *Constraints
   *
   *  1<=T<=10^3
   *  10<=N<=10^4
   *
   *Output Format
   *
   *Print the required answer for each test case.
   *
   *Sample Input 0
   *
   * 2
   * 3
   * 6
   * 
   *Sample Output 0
   *
   * 5
   * 13
   * 
   *Explanation 0
   *
   *The first 10 prime numbers are
   *    {2,3,5,7,11,13,17,19,23,29}
   *
   *we can see that 3rd prime number is 5 and 6th prime number is13
   *
   * */
    
  public static List<Long> primes = new ArrayList<>();
  public static long prime(long n){
      n--;
      if(n<primes.size())
          return primes.get((int)n);
      long res=primes.get(primes.size()-1)+2;
      long t=res;
      for(;primes.size()<=n;res+=2)
      {
         if(isPrime(res))
         {
          t = res>t?res:t;
         }
      }
      return primes.get(primes.size()-1);
  }
  public static boolean isPrime(long n){
    for(long i: primes)
      if(n%i==0)
        return false;
    primes.add(n);
    return true;
  }
  public static void main(String[] args) {
      primes.add(2L);
      primes.add(3L);
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      for(int a0 = 1; a0 <=t; a0++){
        int n = in.nextInt();
        System.out.println(prime(n));
      }
      in.close();
  }
}
