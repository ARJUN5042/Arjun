#include<iostream>

using namespace std;
class matrix
{
	public:
		int i,j,m[20],mat[20];
		void input()
		{
			for(i=0;i<5;i++)
			{
				cout<<"\nEnter Elements ["<<i<<"] : ";
				cin>>m[i];
			}
		}
		void output()
		{
			for(i=0;i<5;i++)
			{
				cout<<m[i]<<"\t";
			}
		}
		matrix operator + (matrix add)
		{
			for(i=0;i<5;i++)
			{
				mat[i] = m[i] + add.m[i];
			}
			for(i=0;i<5;i++)
			{
				cout<<mat[i]<<"\t";
			}
			return add;
		}
};

int main()
{
	matrix m,n;
	cout<<"\n\t\t Enter Matrix 1 Element";
	m.input();
	cout<<"\n\n\t\t Enter Matrix 2 Element";
	n.input();
	cout<<"\n---------------------------------------";
	cout<<"\n\n\t\tMatrix 1\n\n";
	m.output();
	cout<<"\n---------------------------------------";
	cout<<"\n\n\t\tMatrix 2\n\n";
	n.output();
	cout<<"\n---------------------------------------";
	cout<<"\n\n\tAddition of Matrix\n";
	m+n;
	return 0;
	
}