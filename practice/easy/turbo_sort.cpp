#include<iostream>
#include<algorithm>

using namespace std;

int main()
{
  int total_nos,tmp;
  cin>>total_nos;
  int numbers[total_nos];
  for(int i=0;i<total_nos;++i)
  {
    cin>>numbers[i];
  }

  sort(numbers,numbers+total_nos);
  for(int i=0;i < total_nos; ++i)
  {
    cout<<numbers[i]<<endl;
  }
  return 0;
}
