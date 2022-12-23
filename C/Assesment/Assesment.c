#include<stdio.h>
//	Creating function for multiplication
void multiply(int m1[10][10],int m2[10][10],int r1,int c1, int r2, int c2)
{
	int mul[10][10],i,j,k;
	printf("\n\n----Result: Multiplication Matrix----\n\n");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c2;j++)
		{
			mul[i][j]=0;
			for(k=0;k<r2;k++)
			{
				mul[i][j]+=m1[i][k]*m2[k][j];
			}
		}
	}
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c2;j++)
		{
			printf("%d\t",mul[i][j]);
		}
		printf("\n");
	}
}
//	Creating Main Function
void main()
{
//	Creating Variables
	int m1[10][10],m2[10][10],i,j,r1,c1,r2,c2;
//	input for row and columns
	printf("Enter row and column for Matrix 1 : \n");
	scanf("%d%d",&r1,&c1);
	printf("Enter row and column for Matrix 2 : \n");
	scanf("%d%d",&r2,&c2);
//	make conditions for matrix conditions row and column
	if(c1==r2)
	{
		printf("\n\n\tMatrix Multiplication");
		printf("\n\n---------------Matrix 1--------------\n\n");
//		Input for Matrix 1
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				printf("Enter Element : ");
				scanf("%d",&m1[i][j]);
			}
		}
		printf("\n");
//		display Matrix 1
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				printf("%d\t",m1[i][j]);
			}
			printf("\n");
		}
		
		printf("\n\n---------------Matrix 2--------------\n\n");
//		Input for Matrix 2
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				printf("Enter Element : ");
				scanf("%d",&m2[i][j]);
			}
		}
		printf("\n");
//		display Matrix 2
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				printf("%d\t",m2[i][j]);
			}
			printf("\n");
		}
		
//		Calling Multiplication function
		multiply(m1,m2,r1,c1,r2,c2);
	}
	else
	{
		printf("\n\nDimension of Matrix for Multiplication is doesn't Match!!!!'");
	}
}