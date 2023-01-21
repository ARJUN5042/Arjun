#include<iostream>
using namespace std;

template<typename s>
s swap(s a,s b)
{
	int c;
	cout<<"\n------------------------------";
	cout<<"\n Before Swap";
	cout<<"\n------------------------------";
	cout<<"\n A = "<<a<<"\t B = "<<b;
	c=a;
	a=b;
	b=c;
	cout<<"\n\n\n------------------------------";
	cout<<"\n After Swap";
	cout<<"\n------------------------------";
	cout<<"\n A = "<<a<<"\t B = "<<b;
	return 0;
}

int main()
{
	swap(10,20); 
	return 0;
}