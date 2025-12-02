#include<iostream>
using namespace std;
int main()
{
    int vi;
    float a,s,t;
    cout<<"enter intial velocity: "<<endl;
    cin>>vi;
    cout<<"enter time: "<<endl;
    cin>>t;
    cout<<"enter acceleration: "<<endl;
    cin>>a;
    s=vi*t+(1/2)*a*t*t;
    cout<<s;
    return 0;
}