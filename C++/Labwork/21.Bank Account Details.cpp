#include<iostream>
using namespace std;

//add penalty in saving account for minimum balance
//	creating class
class Account
{
	public:
		string name,type,bn;
		long long ac_no;
		//storing account details in consturctor
		Account()
		{
			bn = "State Bank of India";
			name = "Arjun Hirpara";
			ac_no = 20381533423;
		}
		void detail();
};
//	using scope resolution to access member function outside of class
void Account::detail()
{
	cout<<"\n********************************************************\n";
	cout<<"\n              Account Holder Information\n";
	cout<<"\n********************************************************"<<endl;
	cout<<"\n==> Bank Name      : "<<bn;
	cout<<"\n==> Name           : "<<name;
	cout<<"\n==> Account Number : "<<ac_no;
}
//	creating saving avvount class
class Savings:public Account
{
	public:
		long long balance,deposit,upbalance,interest,year,upibalance,withdraw,rate=5;
		Savings()
		{
			balance = 25000;		//main balance
			cout<<"\n==>Bank Balance : "<<balance;
			cout<<"\n\nCheque Book is not available for this account.";
		}
		void dep();
		void with();
};
void Savings::dep()			//deposit amount
{
	cout<<"\n\n---------------------------------------------------------";
	cout<<"\n\t\t Deposit";
	cout<<"\n---------------------------------------------------------";
	cout<<"\n\nEnter Amount for Deposit : ";
	cin>>deposit;		
	upbalance=balance+deposit;		//update amount after deposit
	cout<<"\n\nYour Current Balance is : "<<upbalance;
	
	cout<<"\n\nEnter How much year you have to deposit : ";
	cin>>year;
	interest=(upbalance*rate*year)/100;		//calculate interest of updated balance
	cout<<"\n\nYour Interest is : "<<interest;
	upibalance=upbalance+interest;			//adding interest in updated balance
	cout<<"\n\nYour Current Balance is : "<<upibalance;		//display updated balance
}
void Savings::with()		//withdraw amount
{
	cout<<"\n\n---------------------------------------------------------";
	cout<<"\n\t\t Withdraw";
	cout<<"\n---------------------------------------------------------";
	cout<<"\n\nEnter Amount for Withdraw : ";
	cin>>withdraw;
	if(upibalance<withdraw)		//checking condition for withdrawalbe or not
	{
		cout<<"\n\n---------------------------------------------------------";
		cout<<"\nSorry(-_-)\nYour Account Balance Is Insufficient.";
		cout<<"\n---------------------------------------------------------";
	}
	else
	{
		cout<<"\nYour Amount Withdraw Successfully.";
		cout<<"\n\n---------------------------------------------------------";
		cout<<"\nDear "<<name<<" Your Current Bank Balance is : "<<(upibalance-withdraw);		//display latest updated balance after withdraw
		cout<<"\n\n---------------------------------------------------------";
	}
}
//	creating class for current account
class Current:public Account
{
	public:
		long long balance,minbal,deposit,upbalance,withdraw,upwbalance,penalty;
		
		Current()
		{
			balance = 100000;		//main balance
			minbal = 10000;			//minimum balance
			
			cout<<"\n==> Bank Balance : "<<balance;
			//Terms and Conditions 
			cout<<"\n\n==>1) In your current account minimum balance must be\n\t"<<minbal<<" otherwise you have to pay penalty.";
			cout<<"\n==>2) No Interest is paid on this account.";
			cout<<"\n==>3) Cheque Book is available for this account.";
		}
		void dep();
		void with();
};
void Current::dep()		//deposit amount
{
	cout<<"\n\n---------------------------------------------------------";
	cout<<"\n\t\t Deposit";
	cout<<"\n---------------------------------------------------------";
	cout<<"\nEnter Amount to Deposit : ";
	cin>>deposit;
	upbalance=balance+deposit;		//adding value to balance
	cout<<"\nYour Current Bank Balance is : "<<upbalance;		//show updated balance
}
void Current::with()		//withdraw amount
{
	cout<<"\n\n---------------------------------------------------------";
	cout<<"\n\t\t Withdraw";
	cout<<"\n---------------------------------------------------------";
	cout<<"\nEnter Amount for Withdraw : ";
	cin>>withdraw;
	upwbalance=upbalance-withdraw;		//deduct amount from updated balance
	penalty=upwbalance-1000;			//if minimum balance is not in your account then deduct another 1000.
	
	if(upbalance<withdraw)		//checking condition amount is withdrawable or not
	{
		cout<<"\n\n---------------------------------------------------------";
		cout<<"\nSorry (-_-)\nYour Account Balance Is Insufficient.";
		cout<<"\n---------------------------------------------------------";
	}
	else
	{
		cout<<"\n\nYour Amount Withdraw Successfuly.";
		cout<<"\n\nDear "<<name<<" Your Current Balance Is : "<<upwbalance;			
		if(upwbalance<10000)									//checking condition for minimum balance
		{
			cout<<"\n\n***Since Your Account Balance is less than 10000\nYou will have to pay a penalty of 1000.***";
			cout<<"\n\n---------------------------------------------------------";
			cout<<penalty;		//display balance after deduct 1000
			cout<<"\n-----------------------------------------------------------";
		}
	}	
}

int main()
{
	int choice;
	//accessign constructor
	Account a;		
	//calling detail function
	a.detail();
	cout<<"\n\n==> Account Type :";
	cout<<"\n==> 1) Saving Account";
	cout<<"\n==> 2) Current Account";
	//input for access account
	cout<<"\n\n==> Please Enter Your Choice to Access Account (1 or 2) : ";
	cin>>choice;
	
	//making choice for which account will be access
	if(choice==1)	
	{
		cout<<"\n\n---------------------------------------------------------";
		cout<<"\n\t\tSaving Account";
		cout<<"\n---------------------------------------------------------\n";
		Savings s;
		s.dep();
		s.with();
	}
	else if(choice==2)
	{
		cout<<"\n\n---------------------------------------------------------";
		cout<<"\n\t\tCurrent Account";
		cout<<"\n---------------------------------------------------------\n";
		Current c;
		c.dep();
		c.with();
	}
	else
	{
		cout<<"\n==>Invalid Input !!!!!!!!!!!!!!!!!!!!!!!!";
	}
	return 0;
}