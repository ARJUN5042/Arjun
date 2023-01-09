#include<iostream>
using namespace std;
//	creating class
class ope
{
	public:
//	creating data members
		int x,y;
//	creating constructor
	ope(int a, int b)
	{
		x=a;
		y=b;
	}
//	creating member function for output
	void result()
	{
		cout<<"\n\n*******************************************";
		cout<<"\n Below results are with using Constructor";
		cout<<"\n*******************************************";
		cout<<"\n\n Addition : "<<(x+y);
		cout<<"\n\n Subtraction : "<<(x-y);		
		cout<<"\n\n Multiplication : "<<(x*y);
		cout<<"\n\n Division : "<<((float)x/y);
	}
};
//	creating main function
int main()
{
//	creating variables
	int a,b;
//	input values
	cout<<"\n Enter A : ";
	cin>>a;
	cout<<"\n Enter B : ";
	cin>>b;
//	display values
	cout<<"\n\n A : "<<a<<"\t\tB : "<<b;
//	creating object and access constructor
	ope add(a,b);
	add.result();		//calling member function
	return 0;
}