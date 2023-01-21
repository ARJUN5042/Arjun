#include<iostream>
using namespace std;

class Number{
	private:
		int n1,n2;
		friend int max(Number);
		
		public:
			void accept()
			{
				cout<<"\n Enter No. 1 : ";
				cin>>n1;
				cout<<"\n Enter No. 2 : ";
				cin>>n2;
			}
};
int max(Number n)
{
	if(n.n1>n.n2)
	{
		cout<<"\n\n Number 1 is Greater.";
	}
	else if(n.n2>n.n1)
	{
		cout<<"\n\n Number 2 is Greater.";
	}
	else
	{
		cout<<"\n\n Both Numbers are Equal.";
	}
	return 0;
}


int main()
{
	Number n;
	n.accept();
	max(n);
	
	return 0;
}