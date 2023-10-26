#include<stdio.h>
int main()
{
	int n;
	if(n==1 || n==3 || n==5 || n==7 || n==8 || n==9 || n==11)
	{
		printf("Days is 31");
	}
	else if(n=4 || n==6 || n==10 || n==12)
	{
		printf("Days is 30");
	}
	else if(n=2)
	{
		printf("Days is 28");
	}
	else
	{
		printf("Invalid Number...");
	}
	
	 return 0;
}