#include<iostream>
using namespace std;
//	creating class
class calculator
{
	public:
	int a,b;
	
//	creating function for input value from user and display
	void input()
	{
		cout<<"Enter A : ";
		cin>>a;
		cout <<"Enter B : ";
		cin>>b;
		cout<<"\nA : "<<a<<"\tB : "<<b;
	}
//	creating addition function
	void add()
	{
		cout<<endl<<"Additon : "<<a<<" + "<<b<<" = "<<(a+b);
	}
//	creating subtraction function
	void sub()
	{
		cout<<endl<<"Subtraction : "<<a<<" - "<<b<<" = "<<(a-b);
	}
//	creating multiplication function
	void mul()
	{
		cout<<endl<<"Multiplication : "<<a<<" * "<<b<<" = "<<(a*b);
	}
//	creating division function
	void div()
	{
		cout<<endl<<"Division : "<<a<<" / "<<b<<" = "<<((float)a/b);
	}
};


int main()
{
	cout<<"\n******Simple Calculator******"<<endl<<endl;
	calculator calc;
	calc.input();
	int n;
	cout<<endl<<endl<<"\tChoice Menu"<<endl;
	cout<<endl<<"Press 1 for Addition";
	cout<<endl<<"Press 2 for Suntraction";
	cout<<endl<<"Press 3 for Multiplication";
	cout<<endl<<"Press 4 for Division";
	
	cout<<endl<<endl<<"Enter your choice ? :-->  ";
	cin>>n;
	
	switch(n)
	{
		case 1:
			calc.add();
			break;
		case 2:
			calc.sub();
			break;
		case 3:
			calc.mul();
			break;
		case 4:
			calc.div();
			break;
		default:
			cout<<endl<<endl<<"INVALID INPUT !!!!!!!";
			break;
	}
	return 0;
}