#include<iostream>
using namespace std;
//	creating base class
class person
{
	public:
		string name;
		int age;
		//creating constructor
		person()
		{
			name = "Arjun Hirpara";
			age = 27;
		}
		
};
//	creating base class
class student
{
	public:
		int s1,s2,s3,total;
		float per;
		//creating constructor
		student()
		{
			s1 = 78;
			s2 = 67;
			s3 = 89;
			total = s1 + s2 + s3;
			per = (float)total / 3;
		}
		
};
//	creating derived class for two base classes for inherit
class teacher : public person , public student
{
	public:
		float salary;
		//creating constructor
		teacher()
		{
			salary = 100000;
		}
		//creating read method
		void read()
		{
			cout<<"\nName       : "<<name;
			cout<<"\nAge        : "<<age;
			cout<<"\nPercentage : "<<per;
		}
		//creating write method
		void write()
		{
			cout<<"\nSalary     : "<<salary;
		}		
};

int main()
{
	//creating derived class object
	teacher t1;
	//calling method using derived class object
	t1.read();
	t1.write();
	return 0;
}