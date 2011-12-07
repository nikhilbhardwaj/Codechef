/*Statement

Given N,A,B,C, find how many solutions exist to the equation : a + b + c ≤ N, such that 0 ≤ a ≤ A, 0 ≤ b ≤ B, 0 ≤ c ≤ C.
Input

The first line contains the number of test cases T (1<= T <= 50). Each test case contains 4 integers, N,A,B,C. 0 ≤ N,A,B,C ≤ 2500
Output

Output T lines, one for each test case.
Sample Input
2
4 3 2 1
1 1 1 1

Sample Output
20
4
*/

#include<cstdio>


int main()
{
  int N,A,B,C,T;
  scanf("%d",&T);
  for(int i=0;i<T;++i)
  {
    scanf("%d %d %d %d",&N,&A,&B,&C);
    int no_of_solutions = 0;
    for(int a=0; a<=A && a<=N ;++a)
    {
      for(int b=0;b<=B && b<=N ;++b)
      {
        for(int c=0;c<=C && c<=N ;++c)
        {
          if( (a+b+c) <= N )
          {
            no_of_solutions++;
          }
        }
      }
    }
    printf("%d\n",no_of_solutions);
  }
  return 0;
}
