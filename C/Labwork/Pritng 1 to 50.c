#include<stdio.h>
//1 2 3 ....10
//11 12 13 ....20
//21 22 .... 30
//....
//.....50
int main()
{
	for(int i=1;i<=10;i++)
	{
		printf("%d  ",i);
	}
	printf("\n");
	for(int i=11;i<=20;i++)
	{
		printf("%d ",i);
	}
	printf("\n");
	for(int i=21;i<=30;i++)
	{
		printf("%d ",i);
	}
	printf("\n");
	for(int i=31;i<=40;i++)
	{
		printf("%d ",i);
	}
	printf("\n");
	for(int i=41;i<=50;i++)
	{
		printf("%d ",i);
	}
	
	return 0;
}