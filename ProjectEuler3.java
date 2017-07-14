package projectEuler;

import java.util.ArrayList;
import java.util.List;
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
  public static List<Long> primes = new ArrayList<>();
   
  public static boolean isPrime(long n){
    if(primes.contains(n))
      return true;
    for(long i: primes)
      if(n%i==0)
        return false;
    return true;
  }
  public static void fill(long p){
    if(primes.contains(p))
      return;
	long i = primes.get(primes.size()-1);
	  for(;i<p;i+=2){
		if(isPrime(i))
		  primes.add(i);
	  }
  }
  public static void main(String[] args) {
    primes.add(2L);
    primes.add(3L);
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        long n = in.nextLong();
        long p = n - 1 + n%2;
        fill(p);
        while(n%p!=0||!isPrime(p)){
          p-=2;
        }
        System.out.println(p);
    }
    in.close();
  }
}