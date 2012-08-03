#include<iostream>

using namespace std;

typedef unsigned long long ull;

int count_trailing_zeros(ull n)
{
  int zeros = 0;
  int divisor = 5;
  ull remainder;
  do
  {
    remainder = n / divisor;
    divisor *= 5;
    zeros += remainder;
  }while(remainder != 0);
  return zeros;
}

int main()
{
  int no_of_inputs;
  ull number;
  cin>>no_of_inputs;
  for(int i=0;i<no_of_inputs;++i)
  {
    cin>>number;
    cout<<count_trailing_zeros(number)<<endl;
  }
  return 0;
}
