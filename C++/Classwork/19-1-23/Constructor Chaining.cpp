#include<iostream>
using namespace std;

class A
{
	public:
		A()
		{
			cout<<"\nA's Constructor Called.";
		}
	
};

class B : public A
{
	public:
		B()
		{
			cout<<"\nB's Constructor Called.";
		}
		
};
class C : public B
{
	public:
		C()
		{
			cout<<"\nC's Constructor Called.";
		}
		
};

int main()
{
	C obj;
	
	return 0;
}