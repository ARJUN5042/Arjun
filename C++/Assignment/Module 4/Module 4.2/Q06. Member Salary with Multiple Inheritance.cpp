#include<iostream>
using namespace std;

class person
{
	public:
		string name;
		int age;
		person()
		{
			name = "Arjun Hirpara";
			age = 27;
		}
		
};
class student
{
	public:
		int s1,s2,s3,total;
		float per;
		student()
		{
			s1 = 78;
			s2 = 67;
			s3 = 89;
			total = s1 + s2 + s3;
			per = (float)total / 3;
		}
		
};
class teacher : public person , public student
{
	public:
		float salary;
		teacher()
		{
			salary = 100000;
		}
		void read()
		{
			cout<<"\nName : "<<name;
			cout<<"\nAge : "<<age;
			cout<<"\nPercentage : "<<per;
		}
		void write()
		{
			cout<<"\nSalary :"<<salary;
		}		
};

int main()
{
	teacher t1;
	t1.read();
	t1.write();
	return 0;
}