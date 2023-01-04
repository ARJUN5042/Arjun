#include<iostream>
using namespace std;

//	creating class
class line
{
	public:
		
//		creating inline function for multiplication value
		inline float mul(float x, float y)
		{
			return(x*y);
		}
		
//		creating inline function for Cubic value
		inline float cube(float x)
		{
			return(x*x*x);
		}
};

int main()
{
//	creating object
	line m_c;
	
//	creating variables
	float a,b;
	
//	input value
	cout<<"\n Enter A : ";
	cin>>a;
	cout<<"\n Enter B : ";
	cin>>b;
	
//	display value
	cout<<"\n A : "<<a<<"\t B : "<<b;
	
	cout<<"\n------------------------------";
//	calling member function of multiplication value
	cout<<"\n\n Multiplication Value";
	cout<<"\n\n "<<a<<"*"<<b<<" : "<<m_c.mul(a,b)<<endl;
	
	cout<<"\n------------------------------";
//	calling member function of cubic value
	cout<<"\n\n Cube Value";
	cout<<"\n\n "<<a<<"^3 : "<<m_c.cube(a);
	cout<<"\n "<<b<<"^3 : "<<m_c.cube(b);
	return 0;
}