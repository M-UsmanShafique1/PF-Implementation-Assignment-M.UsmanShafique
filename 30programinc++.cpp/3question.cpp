#include<iostream>
using namespace std;
int main()
{
    int a=5,b=10,temp;
     cout<<"orginal values: "<<a<<endl<<b<<endl;
    temp = a;
    a=b;
    b=temp;
    cout<<"interchange values : "<<a<<endl<<b;

    return 0;
}