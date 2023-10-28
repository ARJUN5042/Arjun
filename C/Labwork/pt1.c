#include<stdio.h>
int main()
{
	int n=5,space=n-1,star=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=space-2;j++)
		{
			printf(" ");
		}
		for(int k=1;k<=star;k++)
		{
			printf("*");
		}
		if(space>i)
		{
			space=space-1;
			star=star+2;
		}
		if(space<i)
		{
			space=space+1;
			star=star-2;
		}
		printf("\n");
	}
	
	return 0;
}