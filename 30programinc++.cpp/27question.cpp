#include<iostream>
using namespace std;
int main()
{
    int a,b,c,s,d;
    cout<<"Enter Time in hours : ";
    cin>>a;
    cout<<"Enter Time in second: ";
    cin>>b;
    cout<<"Enter Time in minutes: ";
    cin>>c;
    s=a*3600;
    d=c*60;
    cout<<"Time in hour is : "<<s<<endl<<"Time in minutes is: "<<d;
    return 0;
}