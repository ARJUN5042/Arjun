#include<stdio.h>
void main()
{
	printf("\n\t\tLeap Year.");
	int y;
	printf("\n\n\t\tEnter Year : ");
	scanf("%d",&y);
	
	if(y%400==0)
	{
		printf("\n\t\t%d is a Leap Year.",y);
	}
	else if(y%4==0)
	{
		printf("\n\t\t%d is a Leap Year.",y);
	}
	else
	{
		printf("\n\t\t%d is not a Leap Year.",y);
	}
	
}