#include<iostream>
using namespace std;

class matrix
{
	public:
		int i,j,m[20][20],r,c;
		void rc()
		{
			cout<<"\n Enter row for matrix : ";
			cin>>r;
			cout<<"\n Enter column for matrix : ";
			cin>>c;
		}
		void input()
		{
			cout<<"\n\n\t Enter Elements";
			cout<<"\n----------------------------------\n";
			for(i=0;i<=r;i++)
			{
				for(j=0;j<=c;j++)
				{
					cout<<" Enter element ["<<i<<"]["<<j<<"] : ";
					cin>>m[i][j];
				}
			}
		}
		void display()
		{
			cout<<"\n\n\t     Matrix";
			cout<<"\n----------------------------------\n";
			for(i=0;i<=r;i++)
			{
				for(j=0;j<=c;j++)
				{
					cout<<"\t"<<m[i][j];
				}
				cout<<"\n";
			}
		}
		
};

int main()
{
	matrix m;
	m.rc();
	m.input();
	m.display();
	return 0;
}