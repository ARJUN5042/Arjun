#include<iostream>
#include<stdlib.h>
#include<ctime>
#include<conio.h>
using namespace std;
//	creating class
class RPS
{
	public:
		//creating data members and methods
		int pChoice,cChoice,i,j,k,round,fScore;
		int pScore = 0, cScore = 0;
		string pName;
		void name();
		void roundChoise();
		void rounds();
		void result();
};
		//method for input Name
void RPS::name()
{
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=52;i++)
	 {
	 	cout<<"\xDB";
	 }
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xB2";
	 }
	 cout<<"\t\t\t       ";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xB2";
	 }
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xDB";
	 }
	 cout<<" Rock Paper Scissor Game ";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xDB";
	 }
	  cout<<"\t\t\t";
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xB2";
	 }
	 cout<<"\t\t\t       ";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xB2";
	 }
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=52;i++)
	 {
	 	cout<<"\xDB";
	 }
	 cout<<endl<<endl<<"\t\t\t";
	 for(i=0;i<=26;i++)
	 {
	 	for(j=0;j<1;j++)
	 	{
			cout<<"\xDc";
		}
		cout<<" ";
	 }
	 cout<<endl<<endl<<"\t\t\t\t\t     ***Rules***";
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=52;i++)
	 {
	 	cout<<"~";
	 }
		 //showing rules for game
	 cout<<endl<<endl<<"\t\t\t\xEc\xEc\xEc> 1)Rock Beats Scissor,But Loses to Paper.";
	 cout<<endl<<endl<<"\t\t\t\xEc\xEc\xEc> 2)Paper Beats Rock,But Loses to Scissor.";
	 cout<<endl<<endl<<"\t\t\t\xEc\xEc\xEc> 3)Scissor Beats Paper,But Loses to Rock.";
	 cout<<endl<<endl<<"\t\t\t\xEc\xEc\xEc> 4)If Both Choose Same Then It's A Tie.";
	 
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=52;i++)
	 {
	 	cout<<"~";
	 }
	 cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC\xEC> Enter Your Name : ";
	 getline(cin,pName);
}



		//method for number of rounds
void RPS::roundChoise()
{
	system("cls");
	cout<<endl<<"\t\t\t";
	 for(i=0;i<=52;i++)
	 {
	 	cout<<"\xDB";
	 }
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xB2";
	 }
	 cout<<"\t\t\t       ";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xB2";
	 }
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xDB";
	 }
	 cout<<" Rock Paper Scissor Game ";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xDB";
	 }
	  cout<<"\t\t\t";
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xB2";
	 }
	 cout<<"\t\t\t       ";
	 for(i=0;i<=13;i++)
	 {
	 	cout<<"\xB2";
	 }
	 cout<<endl<<"\t\t\t";
	 for(i=0;i<=52;i++)
	 {
	 	cout<<"\xDB";
	 }
	 cout<<endl<<endl<<"\t\t\t";
	 for(i=0;i<=26;i++)
	 {
	 	for(j=0;j<1;j++)
	 	{
			cout<<"\xDc";
		}
		cout<<" ";
	 }
	 cout<<endl<<endl<<"\t\t\tDear "<<pName<<", ";
	cout<<endl<<"\t\t\t\tHow many Rounds You Want To Play : \xEC\xEC\xEC\xEC> ";
	cin>>round; 		//asking how many rounds user want to play
}




		//method for playing round
void RPS::rounds()
{
	//using for loop to continue for number of rounds
	for(i=1;i<=round;i++)
	{
		system("cls");		//to use for clear screen after every round
		
		cout<<endl<<"\t\t\t";
		for(j=0;j<=52;j++)
		{
			cout<<"\xDB";
		}
		cout<<endl<<"\t\t\t";
		for(j=0;j<=19;j++)
		{
			cout<<"\xB2";
		}
		cout<<"\t\t ";
		for(j=0;j<=19;j++)
		{
			cout<<"\xB2";
		}
		cout<<endl<<"\t\t\t";
		for(j=0;j<=19;j++)
		{
			cout<<"\xDB";
		}
		cout<<" Round  : "<<i;
		cout<<"  ";
		for(j=0;j<=19;j++)
		{
			cout<<"\xDB";
		}
		cout<<endl<<"\t\t\t";
		for(j=0;j<=19;j++)
		{
			cout<<"\xB2";
		}
		cout<<"\t\t ";
		for(j=0;j<=19;j++)
		{
			cout<<"\xB2";
		}
		cout<<endl<<"\t\t\t";
		for(j=0;j<=52;j++)
		{
			cout<<"\xDB";
		}
		cout<<endl<<endl<<"\t\t\t";
		for(j=0;j<=26;j++)
		{
	 		for(k=0;k<1;k++)
	 		{
			cout<<"\xDc";
			}
		cout<<" ";
	 	}

		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> "<<pName<<"'s Score : "<<pScore;		//changing score after single round
		cout<<endl<<"\t\t\t\xEC\xEC\xEC> Computer's Score : "<<cScore;
			//to use do while loop for choice
		do
		{
			cout<<endl<<endl<<"\t\t\t\xEc\xEc\xEc>1) Rock";
			cout<<endl<<endl<<"\t\t\t\xEc\xEc\xEc>2) Paper";
			cout<<endl<<endl<<"\t\t\t\xEc\xEc\xEc>3) Scissor";
			
			cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> Select Your Choice : ";		//asking choice for user select
			cin>>pChoice;
			//condition to print what is select by user
			if(pChoice == 1)
			{
				cout<<endl<<"\t\t\t\t---> You Select Rock.";
			}
			else if(pChoice == 2)
			{
				cout<<endl<<"\t\t\t\t---> You Select Paper.";
			}
			else if(pChoice == 3)
			{
				cout<<endl<<"\t\t\t\t---> You Select Scissor.";
			}
			else
			{
				cout<<endl<<"\t\t\t\t---> *ERROR 404*";
				cout<<endl<<"\t\t\t\t\tUPPS !!!! You Enter Wrong Digit.";
				
				//if there is wrong input then asking again to input
				cout<<endl<<endl<<"\t\t\t\t\xEC\xEC\xEC> Please Enter Again : ";
				cin>>pChoice;
			}
			
			//creating computer to random choice
			srand(time(0));
			cChoice = (rand()%3)+1;
			
			cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> Computer Choice : "<<cChoice;
			//condition to print what is select by computer
			if(cChoice == 1)
			{
				cout<<endl<<endl<<"\t\t\t\t---> Computer Select Rock.";
			}
			else if(cChoice == 2)
			{
				cout<<endl<<endl<<"\t\t\t\t---> Computer Select Paper.";
			}
			else if(cChoice == 3)
			{
				cout<<endl<<endl<<"\t\t\t\t---> Computer Select Scissor.";
			}			
		}		
		
		//to use while for which condition is true
		while(pChoice != 1 && pChoice != 2 && pChoice != 3);
		{
			if(pChoice == 1 && cChoice == 3)
			{
				cout<<endl<<endl<<"\t\t\t";
		for(j=0;j<52;j++)
		{
			cout<<"=";
		}
				cout<<endl<<endl<<"\t\t\t\t\t    You Won.";
				pScore++;		//increasing user score
			}
			else if(pChoice == 2 && cChoice == 1)
			{
				cout<<endl<<endl<<"\t\t\t";
		for(j=0;j<52;j++)
		{
			cout<<"=";
		}
				cout<<endl<<endl<<"\t\t\t\t\t    You Won.";
				pScore++;		//increasing user score
			}
			else if(pChoice == 3 && cChoice == 2)
			{
				cout<<endl<<endl<<"\t\t\t";
		for(j=0;j<52;j++)
		{
			cout<<"=";
		}
				cout<<endl<<endl<<"\t\t\t\t\t    You Won.";
				pScore++;		//inclreasing user score
			}
			else if(pChoice == cChoice)
			{
				cout<<endl<<endl<<"\t\t\t";
		for(j=0;j<52;j++)
		{
			cout<<"=";
		}
				cout<<endl<<endl<<"\t\t\t\t\t    It's a Tie";
			}
			else
			{
				cout<<endl<<endl<<"\t\t\t";
				for(j=0;j<52;j++)
		{
			cout<<"=";
		}
				cout<<endl<<endl<<"\t\t\t\t\t UPPS !!! Computer Won.";
				cScore++;		//increasing computer score
			}
			cout<<endl<<endl<<"\t\t\t";
		for(j=0;j<52;j++)
		{
			cout<<"~";
		}
			cout<<endl<<endl<<"\t\t\t";
		
			cout<<endl<<endl<<"\t\t\t\xEc\xEc\xEc> Press any Key to Continue...";
			getch();
		}
	}
}
void RPS::result()
{
	system("cls");
		//display Final Result
		cout<<endl<<"\t\t\t";
		for(i=0;i<=52;i++)
		{
			cout<<"\xDB";
		}
		cout<<endl<<"\t\t\t";
		for(i=0;i<=19;i++)
		{
			cout<<"\xB2";
		}
		cout<<"\t\t ";
		for(i=0;i<=19;i++)
		{
			cout<<"\xB2";
		}
		cout<<endl<<"\t\t\t";
		for(i=0;i<=19;i++)
		{
			cout<<"\xDB";
		}
		cout<<" Game Result ";
		for(i=0;i<=19;i++)
		{
			cout<<"\xDB";
		}
		cout<<endl<<"\t\t\t";
		for(i=0;i<=19;i++)
		{
			cout<<"\xB2";
		}
		cout<<"\t\t ";
		for(i=0;i<=19;i++)
		{
			cout<<"\xB2";
		}
		cout<<endl<<"\t\t\t";
		for(i=0;i<=52;i++)
		{
			cout<<"\xDB";
		}
		cout<<endl<<endl<<"\t\t\t";
	 	for(i=0;i<=26;i++)
	 	{
	 		for(j=0;j<1;j++)
	 		{
				cout<<"\xDc";
			}
			cout<<" ";
		}
		
		
		//Creating conditions for who won and display score
	if(pScore>cScore)
	{
		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> Your Score is : "<<pScore<<".";
		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> Computer's Score is : "<<cScore<<".";
		cout<<endl<<endl<<"\t\t\t";
		for(i=0;i<52;i++)
		{
			cout<<"~";
		}
		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> Congratulations, # "<<pName<<" # You Won The Game.";
		cout<<endl<<endl<<"\t\t\t";
		for(i=0;i<52;i++)
		{
			cout<<"~";
		}		
	}
	else if(pScore<cScore)
	{
		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> Your Score is : "<<pScore<<".";
		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> Computer's Score is : "<<cScore<<".";
		cout<<endl<<endl<<"\t\t\t";
		for(i=0;i<52;i++)
		{
			cout<<"~";
		}
		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> UPPS !!!,\n\t\t\t\t Sorry(-_-)\n\t\t\t\t\t Better Luck Next Time.";
		cout<<endl<<endl<<"\t\t\t";
		for(i=0;i<52;i++)
		{
			cout<<"~";
		}
	}
	else
	{
		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> Your Score is : "<<pScore<<".";
		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> Computer's Score is : "<<cScore<<".";
		cout<<endl<<endl<<"\t\t\t";
		for(i=0;i<52;i++)
		{
			cout<<"~";
		}
		cout<<endl<<endl<<"\t\t\t\xEC\xEC\xEC> It's a Tie.";
		cout<<endl<<endl<<"\t\t\t Because Your Score and Computer's Score Are Equal.";
		cout<<endl<<endl<<"\t\t\t";
		for(i=0;i<52;i++)
		{
			cout<<"~";
		}
	}
}

int main()
{
	//creating object
	RPS game;
	//calling methods
	game.name();
	game.roundChoise();
	game.rounds();
	game.result();
	return 0;
}