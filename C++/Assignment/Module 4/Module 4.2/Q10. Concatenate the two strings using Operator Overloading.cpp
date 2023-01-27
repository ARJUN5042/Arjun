#include<iostream>
using namespace std;
//	creating class
class addString{
	public:
		//creating data members
		string name, add;
		//creating method for input string
		void input()
		{
			cout<<"\nEnter Name : ";
			getline(cin,name);
		}
		//creating method for display string with return type
		string display()
		{
			return name;
		}
		//operator overloading for concatenate strings
		addString operator + (addString a)
		{
			add = name + a.name;
			cout<<"\n\nConcatenate String : "<<add;
			return a;
		}
};
//	creating main function
int main()
{
	string x,y;
	//creating object
	addString a,b,c;
	a.input();			 	  //calling method for 1st input
	b.input();				 //calling method for 2nd input
	x = a.display();		//intializing method as variable
	cout<<"\nString 1 : "<<x;
	y = b.display();		//intializing method as variable
	cout<<"\nString 2 : "<<y;
	c = a + b;				//implementing for concatenate string
	
	
	return 0;
}