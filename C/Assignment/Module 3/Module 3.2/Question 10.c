#include<stdio.h>
void main()
{
	int n,remainder;
	int reverse=0;
	printf("------Reverse number Program -----\n\n");
	printf("Enter your number : ");
	scanf("%d",&n);
	
	while(n!=0)
	{
		remainder=n%10;
		n /=10;
		reverse=reverse*10+remainder;
	}	
		printf("Reverse number is : %d",reverse);
}