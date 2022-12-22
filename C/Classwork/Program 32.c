#include<stdio.h>
void even_odd(int i)
{
	printf("In Function A : %d",i);
	
	if(i%2==0)
	{
		printf("\n%d is an Even.",i);
	}
	else
	{
		printf("\n%d is an Odd.",i);
	}
}
void main()
{
	int n;
	printf("\nEnter Number : ");
	scanf("%d",&n);
	even_odd(n);
}