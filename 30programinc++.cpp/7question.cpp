#include<iostream>
using namespace std;
int main()
{
    int rollno,PF,IC,CG,totalmark,average;
    cout<<"Enter roll no: ";
    cin>>rollno;
cout<<"Enter PF marks; ";
cin>>PF;
cout<<"Enter IC marks; ";
cin>>IC;
cout<<"Enter CG marks; ";
cin>>CG;
    totalmark= PF+IC+CG;
    average=totalmark/3;
    cout<<totalmark<<endl<<average;
    return 0;
}