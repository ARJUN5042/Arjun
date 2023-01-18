#include<iostream>
using namespace std;
//	creating base class
class Student
{
	public:
		string name;
		int rollno;
		//creating constructor
		Student()
		{
			name = "Arjun Hirpara";
			rollno = 9;
		}		
};
//	creating derived class
class Test : public Student
{
	public:
		int s1,s2;
		//creating constructor
		Test()
		{
			s1=89;
			s2=78;
		}
};
//	creating another derived class to inherit
class Result : public Test
{
	public:
		int total;
		//creating constructor
		Result()
		{
			total=s1+s2;
		}
		//creating method for display
		void Display()
		{
			cout<<"\n*********************************";
			cout<<"\n\tSTUDENT RESULT";
			cout<<"\n*********************************";
			cout<<"\nStudent Name    : "<<name;
			cout<<"\nRoll Number     : "<<rollno;
			cout<<"\nSubject 1 Marks : "<<s1;
			cout<<"\nSubject 2 Marks : "<<s2;
			cout<<"\nTotal Marks     : "<<total;
		}
};
int main()
{
	//creating object from latest derived class 
	Result r;
	//calling method
	r.Display();
	return 0;
}