#include<iostream>
using namespace std;
class add
{
	public:
		int i,j,m[20][20],m1[20][20],m2[20][20],r,c;
		void rc()
		{
			cout<<"\n Enter row for matrix : ";
			cin>>r;
			cout<<"\n Enter column for matrix : ";
			cin>>c;
		}
		void input1()
		{
			for(i=0;i<=r;i++)
			{
				for(j=0;j<=c;j++)
				{
					cout<<" Enter Element ["<<i<<"]["<<j<<"] : ";
					cin>>m1[i][j];
				}
			}
		}
		void input2()
		{
			for(i=0;i<=r;i++)
			{
				for(j=0;j<=c;j++)
				{
					cout<<" Enter Element ["<<i<<"]["<<j<<"] : ";
					cin>>m2[i][j];
				}
			}
		}
		void display()
		{
			cout<<"\n\n\tMatrix 1 \n";
			cout<<"----------------------------------------\n";
			for(i=0;i<=r;i++)
			{
				for(j=0;j<=c;j++)
				{
					cout<<"\t"<<m1[i][j];
				}
				cout<<"\n";
			}
			cout<<"\n\n\tMatrix 2 \n";
			cout<<"----------------------------------------\n";
			for(i=0;i<=r;i++)
			{
				for(j=0;j<=c;j++)
				{
					cout<<"\t"<<m2[i][j];
				}
				cout<<"\n";
			}
		}
		void sum()
		{
			for(i=0;i<=r;i++)
			{
				for(j=0;j<=c;j++)
				{
					m[i][j]=m1[i][j]+m2[i][j];
					cout<<"\t"<<m[i][j];
				}
				cout<<"\n";
			}
		}
};

int main()
{
	add m;
	m.rc();
	cout<<"\n\n Enter Elements for Matrix 1\n";
	cout<<"----------------------------------------\n";
	m.input1();
	cout<<"\n\n Enter Elements for Matrix 1\n";
	cout<<"----------------------------------------\n";
	m.input2();
	m.display();
	cout<<"\n\n\t Addition of Matrix \n";
	cout<<"----------------------------------------\n";
	m.sum();
	return 0;
}