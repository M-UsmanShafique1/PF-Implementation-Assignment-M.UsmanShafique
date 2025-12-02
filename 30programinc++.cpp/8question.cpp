#include<iostream>
using namespace std;
int main()
{
    float F,C;
    cout<<"Enter temperature in Fahrenheit: ";
    cin>>F;
   C = 5/9*(F - 32);
   cout<<"Temperature in Celsius : "<<C;
    return 0;
}