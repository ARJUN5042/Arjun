#include<iostream>
#include<stdio.h>		//for character
#include<string.h>		//for copying string

using namespace std;
//	creating class
class bank
{
	public:
//	creating data members
	long long accno,balance;
	char name[100];
	char acctype[100];
	
//	creating function
	bank(long long acc_no, char *nam, char *acc_type, long long bal)
	{
//		assign value for input from main
		accno=acc_no;
		strcpy(name,nam);
		strcpy(acctype,acc_type);
		balance=bal;
	}
//	creating deposit function
	void deposit()
	{
		int dep;
		cout<<"\nEnter Deposit Amount : ";
		cin>>dep;
		balance+=dep;
	}
//	creating withdraw function
	void withdraw()
	{
		int wid;
		cout<<"\nEnter Withdraw Amount : ";
		cin>>wid;
		balance-=wid;
	}
//	creating display function
	void display()
	{
		cout<<"\n--------------------------------";
		cout<<"\n Account No. : "<<accno;
		cout<<"\n Name : "<<name;
		cout<<"\n Account Type : "<<acctype;
		cout<<"\n Balance : "<<balance;
	}
};
//	creating main function
int main()
{
//	creating variables
	long long acc_no,bal;
	char nam[100];
	char acc_type[100];
//	input from user
	cout<<endl<<"Enter Details : "<<endl;
	cout<<"--------------------------------"<<endl;
	cout<<"\n Account No. : ";
	cin>>acc_no;
	fflush(stdin);
	cout<<"\n Name : ";
	gets(nam);
	cout<<"\n Account Type : ";
	cin>>acc_type;
	cout<<"\n Balance : ";
	cin>>bal;
//	calling member functions
	bank cust(acc_no,nam,acc_type,bal);
	cust.deposit();
	cust.withdraw();
	cust.display();
	
	return 0;
}