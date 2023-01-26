#include<iostream>
using namespace std;

int main()
{
	string name1 = "Arjun";
	string name2;
	cout<<"Name : "<<name1;
	name2 = name1;
	cout<<"\nName : "<<name2;
	cout<<"\nString Concatenate : "<<name1 + name2;
	int len= name2.size();
	cout<<"\nString Length : "<<len;
	
	return 0;
}