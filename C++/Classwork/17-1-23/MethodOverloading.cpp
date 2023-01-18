#include<iostream>
using namespace std;

class MOdemo
{
	public:
		void operators()
		{
			int a=4,b=9;
			cout<<"\nAddition : "<<(a+b);
		}
		void operators(int a)
		{
			if(a%2==0)
			{
				cout<<"\n"<<a<<" is Even.";
			}
			else
			{
				cout<<"\n"<<a<<" is Odd.";
			}
		}
		int operators(int a, int b)
		{
			return a*b;
		}
	
};

int main()
{
	MOdemo mo;
	mo.operators();
	mo.operators(5);
	cout<<"\nMultiplication : "<<mo.operators(5,9);
	
	return 0;
}