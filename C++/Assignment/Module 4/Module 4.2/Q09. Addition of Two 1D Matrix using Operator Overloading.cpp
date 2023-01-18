#include<iostream>
using namespace std;
//	creating class
class Matrix
{
	public:
		int a[100],mat[100],i;
		//creating method for input elements for matrix
		void input()
		{
			for(i=0;i<5;i++)
			{
				cout<<"\nEnter Element ["<<i<<"] : ";
				cin>>a[i];
			}
		}
		//creating method for display elements for matrix
		void display()
		{
			for(i=0;i<5;i++)
			{
				cout<<a[i]<<"\t";
			}
		}
		//Operator Overloading for addition of two matrix
		Matrix operator+(Matrix x)
		{
			for(i=0;i<5;i++)
			{
			    mat[i]=a[i] + x.a[i];
			}
			for(i=0;i<5;i++)
			{
				cout<<mat[i]<<"\t";		//display element after addition
			}
			return x;		//return value for matrix;
		}
};

int main()
{
	//creating 2 object for 2 matrix
	Matrix m,n;
	cout<<"--------------------------------------\n";
	cout<<"\tEnter Matrix 1 Element";
	cout<<"\n--------------------------------------\n";
	m.input();		//calling input method for 1st object
	cout<<"\n--------------------------------------\n";
	cout<<"\tEnter Matrix 2 Element";
	cout<<"\n--------------------------------------\n";
	n.input();		//calling input method for 2nd object
	cout<<"\n\n--------------------------------------\n";
	cout<<"\t\tMatrix 1";
	cout<<"\n--------------------------------------\n\n";
	m.display();	//calling display method for 1st matrix
	cout<<"\n\n--------------------------------------\n";
	cout<<"\t\tMatrix 2";
	cout<<"\n--------------------------------------\n";
	n.display();	//calling display method for 2nd matrix
	cout<<"\n--------------------------------------\n\n";
	cout<<"\n--------------------------------------\n";
	cout<<"\tAddition of Two Matrix ";
	cout<<"\n--------------------------------------\n";
	m+n;			//additioning 1st and 2nd matrix elements
	return 0;
}