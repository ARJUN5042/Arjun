#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;

class lecture
{
	public:
		char f_lecturer[20],f_subject[20],f_course[20],f_lectures[20];
		int i;
		void assign(char *a_lecturer, char *a_subject, char *a_course, char *a_lectures)
		{
//			f_lecturer[i]=a_lecturer[i];
//			f_subject[i]=a_subject[i];
//			f_course[i]=a_course[i];
//			f_lectures[i]=a_lectures[i];
			strcpy(f_lecturer,a_lecturer);
			strcpy(f_subject,a_subject);
			strcpy(f_course,a_course);
			strcpy(f_lectures,a_lectures);
		}
		void display()
		{
			for(i=0;i<5;i++)
			{
				cout<<"\n\nLecturer : "<<f_lecturer[i];
				cout<<"\nSubject : "<<f_subject[i];
				cout<<"\nCourse : "<<f_course[i];
				cout<<"\nLectures : "<<f_lectures[i];
			}
		}
		
};

int main()
{
	lecture l;
	char a_lecturer[20],a_subject[20],a_course[20],a_lectures[20];
	int i;
	for(i=0;i<5;i++)
	{
		cout<<"\nEnter Lecturer : ";
//		getline(cin,a_lecturer[i]);
		cin>>a_lecturer[i];
		cout<<"Enter Subject : ";
//		getline(cin,a_subject[i]);
		cin>>a_subject[i];
		cout<<"Enter Course : ";
//		getline(cin,a_course[i]);
		cin>>a_course[i];
		cout<<"Enter Lectures : ";
//		getline(cin,a_lectures[i]);
		cin>>a_lectures[i];
		fflush(stdin);
	}
	l.assign(a_lecturer,a_subject,a_course,a_lectures);
	l.display();
	return 0;
}