#include<iostream>
#include<conio.h>
using namespace std;

class Fan
{
	public:
	void state()
	{
		cout<<"\n Fan is Stable.";
	}
	virtual void OFF();
};
class OnOff : public Fan
{
	public:
		void OFF()
		{
			cout<<"\n Fan is Rotating.";
		}
};

int main()
{
	int choice;
	OnOff a;
	
	cout<<"\n Press 1 for Turn Off Fan";
	cout<<"\n Press 2 for Turn On Fan";
	cout<<"\n Enter your choice : ";
	cin>>choice;
	do
	{
	switch(choice)
	{
		case 1:
			a.state();
			break;
		case 2:
			a.OFF();
			break;
		default:
			cout<<"\n Invalid Input!!!";
			break;
	}
	}
	while(choice != 1 && choice != 2);
	{
		cout<<"\n\n Press any Key.\n";
		getch();
		a.state();
	}
	
	return 0;
}