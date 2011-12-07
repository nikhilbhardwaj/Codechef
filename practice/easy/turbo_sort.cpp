//Modified implementation of counting sort
#include<cstdio>

const int TEN_POW_6 = 1000000;
int A[TEN_POW_6], B[TEN_POW_6+1], C[TEN_POW_6]={0};

int main()
{
  int total_nos;
  scanf("%d",&total_nos);
  for(int i=0;i<total_nos;++i)
  {
    scanf("%d",&A[i]);
    C[A[i]]++;
  }
//calculate the cumulative frequency
  for(int i=1;i<=TEN_POW_6;++i)
  {
    C[i] += C[i-1];
  }
//place the no's in order
  for(int i=total_nos-1; i >= 0; --i)
  {
    B[C[A[i]]] = A[i];
    C[A[i]]--;
  }
//print the result
for(int i=1;i<=total_nos;++i)
{
  printf("%d\n",B[i]);
}
  return 0;
}
