#include<iostream>
using namespace std;
class calculator
{
	public:
		double x,y;
		void display(double x, double y)
		{
			cout<<"\n Addition : "<<x<<" + "<<y<<" = "<<(x+y);
			cout<<"\n Subtraction : "<<x<<" - "<<y<<" = "<<(x-y);
			cout<<"\n Multiplication : "<<x<<" * "<<y<<" = "<<(x*y);
			cout<<"\n Division : "<<x<<" / "<<y<<" = "<<(x/y);
		}
		
};
int main()
{
	calculator calc;
	double a,b;
	cout<<"\n\n\tSimple Calculator";
	cout<<"\n------------------------------------";
	cout<<"\n Enter A : ";
	cin>>a;
	cout<<"\n Enter B : ";
	cin>>b;
	cout<<endl<<"\n A : "<<a<<"\t\tB : "<<b;
	cout<<"\n------------------------------------";
	calc.display(a,b);
	return 0;
}