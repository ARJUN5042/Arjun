#include<iostream>
using namespace std;
//	creating class
class calculator
{
	public:
		double x,y;
//		creating method for display
		void display(double x, double y)
		{
			cout<<"\n Addition       : "<<x<<" + "<<y<<" = "<<(x+y);
			cout<<"\n Subtraction    : "<<x<<" - "<<y<<" = "<<(x-y);
			cout<<"\n Multiplication : "<<x<<" * "<<y<<" = "<<(x*y);
			cout<<"\n Division       : "<<x<<" / "<<y<<" = "<<(x/y);
		}
		
};
int main()
{
	calculator calc;		//creating object
	double a,b;
	cout<<"\n\n\tSimple Calculator";
	cout<<"\n------------------------------------";
	cout<<"\n Enter A : ";
	cin>>a;
	cout<<"\n Enter B : ";
	cin>>b;
	cout<<endl<<"\n A : "<<a<<"\t\tB : "<<b;
	cout<<"\n------------------------------------";
	calc.display(a,b); 		//calling method
	return 0;
}