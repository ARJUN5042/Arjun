#include<iostream>
using namespace std;
//	creating class
class operations
{
	public:
		//creating same name methods but different parameters and deferent return type
		int sum(int a, int b)
		{
			return a+b;
		}
		float sum(float a, float b)
		{
			return a-b;
		}
		int sum(float a, int b)
		{
			return a*b;
		}
		float sum(int a, float b)
		{
			return (float)a/b;
		}
};

int main()
{
	int a=105,b=23;
	float c=8,d=34;
	cout<<"\n=====================================================";
	cout<<"\n\tOperations with Operation Overloading";
	cout<<"\n=====================================================";
	//creating object
	operations ope;		
	cout<<"\n\t\t1) Addition       : "<<ope.sum(a,b);
	cout<<"\n\t\t2) Subtraction    : "<<ope.sum(c,d);		//calling methods
	cout<<"\n\t\t3) Multiplication : "<<ope.sum(c,a);
	cout<<"\n\t\t4) Division       : "<<ope.sum(a,c);
}