#include<iostream>
using namespace std;
//	creating class
class CRT
{
	public:
		//creating data members
		float ar;
		const float PI = 3.14; 		//initialize constant value
		//area of triangle
		float area(float r)
		{
			ar = PI*r*r;
			return ar;
		}
		//area of rectangle
		float area(float h, float b)
		{
			ar = h*b;
			return ar;
		}
		//area of triangle
		float area(float n, float h, float b)
		{
			ar = n*h*b;
			return ar;
		}
};
int main()
{
	//creating an object
	CRT a;
	float r,h,b,result;
	cout<<"\n================================================";
	//for circle
	cout<<"\n\t Area of Triangle\n";
	cout<<"\n Enter Radious for Area of Circle : ";
	cin>>r;
	result = a.area(r);		//declaring data member as a method for call
	cout<<"\n\n\t Area of Circle : "<<result;
	cout<<"\n================================================";
	//for rectangle
	cout<<"\n\t Area of Rectangle";
	cout<<"\n\n Enter Height of Rectangle : ";
	cin>>h;
	cout<<"\n Enter Breadth of Rectangle : ";
	cin>>b;
	result = a.area(h,b);		//declaring data member as a method for call
	cout<<"\n\n\t Area of Rectangle : "<<result;
	cout<<"\n================================================";
	//for triangle
	cout<<"\n\t Area of Triangle";
	cout<<"\n\n Enter Height of Triangle : ";
	cin>>h;
	cout<<"\n Enter Base of Triangle : ";
	cin>>b;
	result = a.area(0.5,h,b);		//declaring data member as a method for call
	cout<<"\n\n\t Area of Triangle : "<<result;
	cout<<"\n================================================";
	
}