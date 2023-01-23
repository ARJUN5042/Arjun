#include<iostream>
using namespace std;

class lecDetails
{
	public:
		string f_lecturer[20],f_subject[20],f_course[20];
		int f_lectures[20],i;
		
		void input()
		{
			for(i=0;i<5;i++)
			{
				cout<<"\nEnter Lecturer Name : ";
				getline(cin,f_lecturer[i]);
				cout<<"Enter Subject : ";
				getline(cin,f_subject[i]);
				cout<<"Enter Course : ";
				getline(cin,f_course[i]);
				cout<<"Enter No. of Lectures : ";
				cin>>f_lectures[i];
				fflush(stdin);
			}
		}
		
		void display()
		{
			cout<<"\n";
			for(i=0;i<5;i++)
			{
				cout<<"\n Lecturer Name : "<<f_lecturer[i];
				cout<<"\n Subject Name : "<<f_subject[i];
				cout<<"\n Course Name : "<<f_course[i];
				cout<<"\n No. of Lectures : "<<f_lectures[i]<<endl;
			}
		}
	
};

int main()
{
	lecDetails l;
	l.input();
	l.display();
	return 0;
}