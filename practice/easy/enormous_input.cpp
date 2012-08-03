#include<cstdio>

int main()
{
  int no_of_inputs,number,divisor;
  scanf("%d %d",&no_of_inputs,&divisor);
  int no_of_divisors=0;

  for(int i=0;i<no_of_inputs;++i)
  {
    scanf("%d",&number);
    if( number % divisor == 0)
    {
      no_of_divisors++;
    }
  }
  printf("%d",no_of_divisors);
  return 0;
}
