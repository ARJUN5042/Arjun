#include<iostream>
using namespace std;
//	creating class
class Lecture
{
	//creating private data members
	private:
		string f_lecturer[20],f_sub[20],f_course[20],f_no[20];
	public:
		
		int i;
		//creating parameterized constructor for access data members of private 
		Lecture(string a_lecturer[],string a_sub[], string a_course[], string a_no[])
		{
			//assign values
			f_lecturer[i]=a_lecturer[i];
			f_sub[i]=a_sub[i];
			f_course[i]=a_course[i];
			f_no[i]=a_no[i];
		}
		//creating method for input
		void input()
		{
			for(i=0;i<5;i++)
			{
				cout<<"\nEnter Lecturer Name : ";
				getline(cin,f_lecturer[i]);
				cout<<"\nEnter Subject Name : ";
				getline(cin,f_sub[i]);
				cout<<"\nEnter Course Name : ";
				getline(cin,f_course[i]);
				cout<<"\nEnter No. of Lectures : ";
				cin>>f_no[i];
				cout<<"\n------------------------------------------------";			
				fflush(stdin);
			}
		}
		//creating method for output
		void display()
		{
			for(i=0;i<5;i++)
			{
				cout<<"\n******************************************";
				cout<<"\n\nLecturer Name : "<<f_lecturer[i];
				cout<<"\n\nSubject Name : "<<f_sub[i];
				cout<<"\n\nCourse Name : "<<f_course[i];
				cout<<"\n\nNo. of Lectures : "<<f_no[i];			
			}
		}
};
//	creating main function
int main()
{
//	creating variables
	string a_lecturer[20],a_sub[20],a_course[20],a_no[20];
	//creating Object
	Lecture l(a_lecturer,a_sub,a_course,a_no);
	//calling methods for input and display
	l.input();
	l.display();
	
	
	return 0;
}