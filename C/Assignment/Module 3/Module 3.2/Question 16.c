#include<stdio.h>
void main()
{
	int i,j,k,n;
	printf("Enter raw of pyramid pattern : ");
	scanf("%d",&n);
	printf("\n");
	for(i=1;i<=n;i++)
	{
		for(k=1;k<=n-i;k++)
		{
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{
		printf("* ",j);
		}
		printf("\n");
	}
}