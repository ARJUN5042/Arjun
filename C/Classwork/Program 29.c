#include<stdio.h>
void main()
{
	int i,j;
	int m1[3][3],m2[3][3];
	printf("Enter element of Matrix 1 =>\n\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("Enter element for Matrix[%d][%d] = ",i,j);
			scanf("%d",&m1[i][j]);
		}
	}
	printf("\n\nEnter element of Matrix 2 =>\n\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("Enter element for Matrix 2[%d][%d] = ",i,j);
			scanf("%d",&m2[i][j]);
		}
	}
	printf("\n\nMatrix 1 Elements are =>\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",m1[i][j]);
		}
		printf("\n");
	}
	printf("\n\nMatrix 2 Elements are =>\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",m2[i][j]);
		}
		printf("\n");
	}
	printf("\n\nAddition of Matrix ==>\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",(m1[i][j]+m2[i][j]));
		}
		printf("\n");
	}
}