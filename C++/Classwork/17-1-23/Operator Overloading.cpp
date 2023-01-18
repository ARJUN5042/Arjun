#include<iostream>
using namespace std;

/*
		operator not supported in operator overloading
		1) ?:
		2) ::
		3) sizeof()
		4) .
*/
class Distance
{
	public:
		double feet,inches;
		
		Distance(double f, double i)
		{
			feet = f;
			inches = i;
		}
		//operator overloading
		Distance operator-()
		{
			feet = -feet;
			inches = -inches;
			return Distance(feet,inches);
		}
		void display()
		{
			cout<<"\nFeet : "<<feet<<"\nInches : "<<inches;
		}
	
};

int main()
{
	Distance d1(6,-7);
	-d1;
	d1.display();
	
	return 0;
}