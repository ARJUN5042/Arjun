#include<iostream>
#include<string.h>
using namespace std;

class addStrings
{
	public:
		char str[100],s[100];
		void input()
		{
			cout<<"\n Enter String : ";
			cin.getline(str,100);
		}
		
		addStrings operator + (addStrings add)
		{
			strcat(str,add.str);
			strcpy(add.str,str);
			return add;
		
		}
		
		void output()
		{
			cout<<"\n Concatenate String : "<<str;
		}
};

int main()
{
	addStrings s1,s2,s3;
	s1.input();
	s2.input();
	s3 = s1 + s2;
	s3.output();
	
	return 0;
}