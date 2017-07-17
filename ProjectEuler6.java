package projectEuler;

import java.util.Scanner;

public class ProjectEuler6 {
  
  /**
   * This problem is a programming version of Problem 6 from projecteuler.net
   *
   *The sum of the squares of the first ten natural numbers is, 1^2 +2^2 +...+10^2 = 385. The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025. Hence the absolute difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
   *
   *Find the absolute difference between the sum of the squares of the first N natural numbers and the square of the sum.
   *
   *Input Format
   *
   *  First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.
   *
   *Constraints
   *
   *  1 <= T <= 10^4
   *  1 <= N <= 10^4
   *Output Format
   *
   *Print the required answer for each test case.
   *
   *Sample Input 0
   *
   * 2
   * 3
   * 10
   *Sample Output 0
   *
   * 22
   * 2640
   *Explanation 0
   *
   *For N = 3, (1 + 2 + 3)^2 - ( ^2 + 2^2 + 3^2) => 22
   *For N = 10, (1 + 2 + ... + 10)^2 - (1^2 +2^2 +...+10^2) => 2640
   *
   **/
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        long n = in.nextLong();
        System.out.println((n*(n+1)*(n-1)*(3*n+2)/12));
    }
    in.close();
}

}
