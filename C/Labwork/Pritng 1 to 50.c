#include<stdio.h>
//1 2 3 ....10
//11 12 13 ....20
//21 22 .... 30
//....
//.....50
int main()
{
	for(int i=1;i<=50;i++)
	{
		if(i==11 || i==21 || i==31 || i==41)
		{
			printf("\n");
		}
		printf("%d  ",i);
	}
	
	return 0;
}