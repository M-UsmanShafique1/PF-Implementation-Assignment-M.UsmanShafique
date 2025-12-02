#include<iostream>
using namespace std;
int main()
{
    float a, b,c,d;
    cout<<"Enter radius of circle: ";
    cin>>a;
    b=3.14;
    c=b*a*a;
    d=2*b*b;
    cout<<"The area of circle is: "<<c<<endl;
    cout<<"The circumfence of circle is: "<<d;
    return 0;
}