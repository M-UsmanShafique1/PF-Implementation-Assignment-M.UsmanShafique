#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int a,b,c,s,area;
    cout<<"Enter 1st side of triangle: ";
    cin>>a;
    cout<<"Enter 2nd side of triangle: ";
    cin>>b;
    cout<<"Enter 3rd side of triangle: ";
    cin>>c;
    s=(a+b+c)/2;
    area=sqrt(s*(s-a)*(s-b)*(s-c));
    cout<<"The area of triangle is: "<<area;


    return 0;
}