#include<iostream>
using namespace std;
//	creating class
class bank
{
	public:
//		creating data members
		long long accNo,balance;
		string name,accType;
//		creating function for take input from main function
		void assign(long long acc_no, string nam,string acc_Type, long long bal)
		{
			accNo=acc_no;
			name=nam;
			accType=acc_Type;
			balance=bal;
		}
//		creating member function for deposit
		void deposit()
		{
			int dep;
			cout<<"\n Enter Deposit Amount : ";
			cin>>dep;
			balance+=dep;
		}
//		creating member function for withdraw
		void withdraw()
		{
			int wit;
			cout<<"\n Enter Withdraw Amount : ";
			cin>>wit;
			if(wit>balance)
			{
			cout<<"\n Insufficient Balance!!!!!!!!!!!!!!";
			}
			else
			{
			balance-=wit;
			}
		}
//		creating member function for display
		void details()
		{
			cout<<"\n\n----------------------------------------";
			cout<<"\n\t Account Holder Details ";
			cout<<"\n----------------------------------------";
			cout<<"\n Account Name : "<<name;
			cout<<"\n Balance : "<<balance;
		}
};

//	creating main function
int main()
{
//	creating object
	bank b1;
//	creating variables
	long long acc_no,bal;
	string nam,acc_Type;
//	input value
	cout<<"\n\t Account Details ";
	cout<<"\n----------------------------------------";
	cout<<"\n Enter Account Number : ";
	cin>>acc_no;
	fflush(stdin);
	cout<<"\n Enter Name : ";
	getline(cin,nam);
	cout<<"\n Enter Account Type : ";
	cin>>acc_Type;
	cout<<"\n Enter Balance : ";
	cin>>bal;
//	calling member functions
	b1.assign(acc_no,nam,acc_Type,bal);
	b1.deposit();
	b1.withdraw();
	b1.details();
	return 0;
}