#include<iostream>

using namespace std;

class friendF{
	private:
		int a,b;
		
		friend void swap(friendF);
	public:
		
		friendF()
		{
			a = 10;
			b = 20;
		}
		void before()
		{
			cout<<"\n Before Swapping";
			cout<<"\n------------------------";
			cout<<"\n A = "<<a<<"\t B = "<<b;
		}
};
void swap(friendF f1)
{
	f1.a = f1.a + f1.b;
	f1.b = f1.a - f1.b;
	f1.a = f1.a - f1.b;
	
	cout<<"\n\n After Swapping";
	cout<<"\n------------------------";
	cout<<"\n A = "<<f1.a<<"\t B = "<<f1.b;
}

int main()
{
	friendF f1;
	f1.before();
	swap(f1);
	
	return 0;
}