#include<stdio.h>
void main()
{
//	int m[5];
	int m[3][3],m1[3][3];
	int i,j;
	printf("\n\tMatrix 1");        
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\nEnter Element [%d][%d] : ",i,j);
			scanf("%d",&m[i][j]);
		}
	}
	printf("\n\n\tMatrix 2\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("\nEnter Element [%d][%d] : ",i,j);
			scanf("%d",&m1[i][j]);
		}
	}
	printf("\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("%d\t",m[i][j]);
		}
		printf("\n");
	}
	printf("\n\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("%d\t",m1[i][j]);
		}
		printf("\n");
	}
	printf("\n\n\tdivision\n");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			printf("%i\t",(m[i][j]*m1[i][j]));
		}
		printf("\n");
	}
}
