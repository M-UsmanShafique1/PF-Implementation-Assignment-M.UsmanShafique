#include<iostream>
using namespace std;
int main()
{
    int a,b,c,d;
    cout<<"Enter 1st an integer: ";
cin>>a;
cout<<"Enter an 2st integer: ";
cin>>b;
cout<<"Enter an 3rd integer: ";
cin>>c;
cout<<"Enter an 4th integer: ";
cin>>d;
if(a>b&&a>c&&a>d)
cout<<"A is maximum"<<endl;
else
cout<<"A is minimum"<<endl;
if(b>a&&b>c&&b>d)
cout<<"B is maximum"<<endl;
else
cout<<"B is minimum"<<endl;
if(c>b&&c>a&&c>d)
cout<<"C is maximum"<<endl;
else
cout<<"C is minimum"<<endl;
if(d>a&&d>c&&d>b)
cout<<"D is maximum"<<endl;
else
cout<<"D is minimum";

    return 0;
}