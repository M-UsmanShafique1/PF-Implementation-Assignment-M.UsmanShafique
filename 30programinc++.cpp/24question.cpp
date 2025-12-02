#include<iostream>
using namespace std;
int main()
{
    int subject1,subject2,subject3,subject4,subject5,totalmark,average;
    cout<<"Enter subject1: ";
    cin>>subject1;
cout<<"Enter subject2 marks; ";
cin>>subject2;
cout<<"Enter subject3 marks; ";
cin>>subject3;
cout<<"Enter subject4 marks; ";
cin>>subject4;
cout<<"Enter subject5 mark";
cin>>subject5;
    totalmark= subject1+subject2+subject3+subject4+subject5;
    average=totalmark/5;
    cout<<"The total mark is: "<<totalmark<<endl<<"The average amrk is: "<<average;
    return 0;
}