#include<iostream>
using namespace std;
int main()
{
    string a;
    char b;
    float c;
    int d;
    cout<<"Enter your name: ";
    getline(cin,a);
    cout<<"Enter your age: ";
    cin>>b;
    cout<<"Enter your gender: ";
    cin>>c;
    cout<<"Enter your height: ";
    cin>>d;
cout<<"Your name is: "<<a<<endl;
cout<<"Your age is: "<<b<<endl;
cout<<"Your gender is: "<<c<<endl;
cout<<"Your height is: "<<d;

    return 0;
}