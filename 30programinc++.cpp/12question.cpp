/*Volume =πR^2 xH     The value of π is 3.1417Volume =πR^2 xH     The value of π is 3.1417*/
#include<iostream>
using namespace std;
int main()
{
    int R,H,V;
    float Pi;
     Pi=3.14;
    cout<<"Enter a radius";
    cin>>R;
    cout<<"Enter a height";
    cin>>H;
    V=Pi*R*R*H;
    cout<<"Volume is this: "<<V;

    return 0;
}