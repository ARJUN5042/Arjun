#include<stdio.h>
void main()
{
	char i,j,x='A';
	for(i='A';i<='E';i++)
	{
		for(j='A';j<=i;j++)
		{
			printf("%c ",x);
			x++;
		}
		printf("\n");
	}
}