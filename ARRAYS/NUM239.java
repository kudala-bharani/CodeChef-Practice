/*Vasya likes the number 239. Therefore, he considers a number pretty if its last digit is 2, 3 or 9.

Vasya wants to watch the numbers between L and R (both inclusive), so he asked you to determine how many pretty numbers are in this range. Can you help him?

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers L and R.
Output
For each test case, print a single line containing one integer — the number of pretty numbers between L and R.

Constraints
1≤T≤100
1≤L≤R≤105
Subtasks
Subtask #1 (100 points): original constraints

Sample Input 1 
2
1 10
11 33
Sample Output 1 
3
8
Explanation
Example case 1: The pretty numbers between 1 and 10 are 2, 3 and 9.

Example case 2: The pretty numbers between 11 and 33 are 12, 13, 19, 22, 23, 29, 32 and 33.*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0)
		{
		    int s = sc.nextInt();
		    int e = sc.nextInt();
		    int count = 0;
		    for(int i=s;i<=e;i++)
		    {
		        if(i%10 == 2 || i%10 == 3 || i%10 == 9)
		            count++;
		    }
		    System.out.println(count);
		}
	}
}
