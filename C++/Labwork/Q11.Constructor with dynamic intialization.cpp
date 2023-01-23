#include<iostream>
using namespace std;

class Interest
{
	private:
	int p,y;
	float r,t;
	public:
		Interest(int principal, int year, int rate)
		{
			p=principal;
			y=year;
			r=rate;
		}
		Interest(int principal, int year, float rate)
		{
			p=principal;
			y=year;
			r=rate;
		}
		void interest()
		{
			t=p*y*r/100;
			cout<<"\nInterest is : "<<t;
		}
};

int main()
{
	int principal,year;
	float rate;
	cout<<"\nEnter Principal Amount : ";
	cin>>principal;
	cout<<"\nEnter Year : ";
	cin>>year;
	cout<<"\nEnter Rate : ";
	cin>>rate;
	Interest in1(principal,year,rate);
	in1.interest();
	return 0;
}