#include<stdio.h>
void main()
{
	int n,remainder,large=0;
	printf("\n--------------------------------------------\n");
	printf("#Find Max Digit #");
	printf("\n--------------------------------------------\n");
	printf("Enter Number : ");
	
	scanf("%d",&n);
	while(n>0)
	{
		remainder=n%10;
		if(large<remainder)
		{
			large=remainder;
		}
		n=n/10;
	}
	printf("\nMax Number is : %d.",large);
}