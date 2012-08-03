#include<iostream>

using namespace std;

int main()
{
  int withdrawal_amt;
  float balance;
  cin>>withdrawal_amt>>balance;
  if( withdrawal_amt%5 == 0 && (withdrawal_amt + 0.50)<= balance )
  {
    balance -= (withdrawal_amt + .50);
  }
  cout<<balance;
  return 0;
}
