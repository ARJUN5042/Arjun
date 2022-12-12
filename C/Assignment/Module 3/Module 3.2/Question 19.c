#include<stdio.h>
void main()
{
	int i,j,n;
	printf("Enter number of Column : ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("* ",j);
		}
		printf("\n");
	}
	for(i=n-1;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			printf("* ",j);
		}
		printf("\n");
	}
}