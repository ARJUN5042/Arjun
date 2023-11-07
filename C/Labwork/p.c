#include<stdio.h>
int main()
{
	int a[20][20],b[20][20],mul[20][20];
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{	
		printf("Enter element a[%d][%d] ",i,j);
		scanf("%d",&a[i][j]);
		}
	}
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{	
		printf("Enter element b[%d][%d] ",i,j);
		scanf("%d",&b[i][j]);
		}
	}
	
	
	printf("Multiplication of Matrix:\n");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{	
		mul[i][j]=0;
			for(int k=0;k<2;k++)
			{
				mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
			}
			printf("%d\t",mul[i][j]);
		}
		printf("\n");
	}
	printf("\n\n");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{	
		printf("%d\t",mul[i][j]);
		}
		printf("\n");
	}

	return 0;
}