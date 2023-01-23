#include<iostream>
using namespace std;

class fibo_fact
{
	public:
		int a,i,fact=1;
		void fibonacci(int n)
		{
			int t1=0;
			int t2=1;
			int next;
			next=t1+t2;
			cout<<"\n\n Fibonacci Series are : "<<t1<<", "<<t2;
			for(i=3;i<=n;i++)
			{
				next=t1+t2;
				t1=t2;
				t2=next;
				cout<<", "<<next;
			}
		}
		void factorial(int n)
		{
			for(i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			cout<<"\n\n Factorial of "<<n<<" is : "<<fact;
		}
};

int main()
{
	int n;
	cout<<"\n Enter number : ";
	cin>>n;
	fibo_fact f;
	f.fibonacci(n);
	f.factorial(n);
	return 0;
}