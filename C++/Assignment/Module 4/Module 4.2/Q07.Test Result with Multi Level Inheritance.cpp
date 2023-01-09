#include<iostream>
using namespace std;
class Student
{
	public:
		string name;
		int rollno;
		Student()
		{
			name = "Arjun Hirpara";
			rollno = 9;
		}		
};
class Test : public Student
{
	public:
		int s1,s2;
		Test()
		{
			s1=89;
			s2=78;
		}
};
class Result : public Test
{
	public:
		int total;
		Result()
		{
			total=s1+s2;
		}
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
	Result r;
	r.Display();
	return 0;
}