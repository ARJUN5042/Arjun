#include<stdio.h>
int main()
{
	int row=3;
	for(int i=0;i<2*row-1;i++)
	{
		int c;
		if(i<row)
		{
			c=2*i+1;
		}
		else
		{
			c=2*(2*row-i)-3;
		}
		for(int j=1;j<=c-1;j++)
		{
			printf(" ");
		}
		for(int k=1;k<=2*row-c;k++)
		{
			printf("*");
		}
		printf("\n");
	}
	
	
	return 0;
}