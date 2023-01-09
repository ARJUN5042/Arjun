#include<iostream>
using namespace std;

class cricketer
{
	public:
		string name,role,bs;
		int no,age,tm,tr,bestperf;
		float avr;
		
};
class batsman : public cricketer
{
	public:
		void input()
		{
			cout<<"\n\n--------------------------------";
			cout<<"\n\tEnter Data  ";
			cout<<"\n--------------------------------";
			cout<<"\n\nEnter Cricketer Name : ";
			getline(cin,name);
			cout<<"Enter Batsman Role : ";
			getline(cin,role);
			cout<<"Enter Batsman Style : ";
			cin>>bs;
			cout<<"Enter Batsman Number : ";
			cin>>no;
			cout<<"Enter Batsman Age : ";
			cin>>age;
			cout<<"Enter Total Match Played : ";
			cin>>tm;
			cout<<"Enter Total Runs : ";
			cin>>tr;
			cout<<"Enter Best Performance : ";
			cin>>bestperf;
		}
		void average()
		{
			avr=((float)tr/tm);
		}
		
		void display()
		{
			cout<<"\n\n--------------------------------";
			cout<<"\n\tDetails of Cricketer";
			cout<<"\n--------------------------------";
			cout<<"\nCricketer Name : "<<name;
			cout<<"\nBatsman Role : "<<role;
			cout<<"\nBatsman Style : "<<bs;
			cout<<"\nBatsman No. : "<<no;
			cout<<"\nBatsman Age : "<<age;
			cout<<"\n\n--------------------------------";
			cout<<"\n\tCareer Details";
			cout<<"\n--------------------------------";
			cout<<"\nTotal Match : "<<tm;
			cout<<"\nTotal Run : "<<tr;
			cout<<"\nAverage Run : "<<avr;
			cout<<"\nBest Performance : "<<bestperf;
		}
};

int main()
{
	batsman data;
	data.input();
	data.average();
	data.display();
	
	return 0;
}