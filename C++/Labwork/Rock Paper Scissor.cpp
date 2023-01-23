#include<iostream>
#include<stdlib.h>
#include<ctime>
#include<conio.h>
using namespace std;

class RPS
{
	public:
		string playerName;
		int rounds,pChoice,cChoice,i;
		int pScore=0,cScore=0;
		void display();
		void round();
};
void RPS::display()
{
	cout<<"\n*--*--*--*--*--*--*--*--*--*--*--";
	cout<<"\n\n\t\tNAME";
	cout<<"\n\n*--*--*--*--*--*--*--*--*--*--*--";
	cout<<"\n Enter Your Name : ";
	getline(cin,playerName);
	system("cls");			
}
void RPS::round()
{
	cout<<"\n*--*--*--*--*--*--*--*--*--*--*--";
	cout<<"\n\n\t\tROUNDS";
	cout<<"\n\n*--*--*--*--*--*--*--*--*--*--*--";
		
	cout<<"\n\nDear "<<playerName<<", \nHow many rounds you want to play? : ";
	cin>>rounds;
		
	for(i=1;i<=rounds;i++)
	{
		system("cls");
		cout<<"\n*--*--*--*--*--*--*--*--*--*--*--";
		cout<<"\n\n\t\tGAME";
		cout<<"\n\n*--*--*--*--*--*--*--*--*--*--*--";
			
		cout<<"\n\nRound No.: "<<i<<"/"<<rounds;
		cout<<"\n\n==> "<<playerName<<"'s Score : "<<pScore;
		cout<<"\n==> Computer Score : "<<cScore;
			
		cout<<"\n\n1) Rock";
		cout<<"\n\n2) Paper";
		cout<<"\n\n3) Scissor";
		
		srand(time(0));
		cChoice=(rand()%3)+1;
			
		do
		{
			cout<<"\n\n==> Enter Your Choice : ";
			cin>>pChoice;
			cout<<"\n\n==> Computer Choice is : "<<cChoice;
		}
		while(pChoice!=1&&pChoice!=2&&pChoice!=3);
		if(pChoice==1&&cChoice==3)
		{
			cout<<"\n\nYou Won.";
			pScore++;
		}
		else if(pChoice==2&&cChoice==1)
		{
			cout<<"\n\nYou Won.";
			pScore++;
		}
		else if(pChoice==3&&cChoice==2)
		{
			cout<<"\n\nYou Won.";
			pScore++;
		}
		else if(pChoice==cChoice)
		{
			cout<<"\n\nIt's a Tie.";
		}
		else
		{
			cout<<"\n\nComputer Won.";
			cScore++;
		}
		cout<<"\n\nPress Any Key To Continue...";
		getch();
	if(cScore==pScore)
	{
		cout<<"\n\nGame is Tie.";
	}
	else if(pScore>cScore)
	{
		cout<<"\n\nCongratulations "<<playerName<<" Won the Game.";
	}
	else
	{
		cout<<"\n\nUPPS (-_-)\nYou Lost the Game.";
	}
	}
}

int main()
{
	RPS g;
	g.display();
	g.round();
	return 0;
}