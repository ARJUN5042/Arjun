#include<iostream>
#include<string.h>
using namespace std;
//	creating class
class addString
{
	public:
		char str[100];
		//creating input method for string
		void input()
		{
			cout<<"\n\tEnter Your String :  ";
			cin.getline(str,100); 	   //use for input space in char data type data-member
		}
		//creating display method for concatenate string
		void display()
		{
			cout<<"\n\tConcatenate String : "<<str;
		}
		//Operator Overloading for Concatenate string
		addString operator+(addString s)
		{
			addString o;
			strcat(str,s.str);
			strcpy(o.str,str);
			return o;
		}
};
int main()
{
	//creating 3 objects of class
	addString s1,s2,s3;
	s1.input();		   //calling input method for object 1
	s2.input();		  //calling input method for object 2
	s3 = s1 + s2;	 //adding 1st and 2nd object
	s3.display();	//calling display method for after adding both object
	return 0; 
}