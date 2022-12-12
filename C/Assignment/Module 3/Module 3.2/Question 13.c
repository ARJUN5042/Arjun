#include<stdio.h>
void main()
{
	long long n;
	int firstDigit,lastDigit;
	int sum=0;
	printf("\n--------------------------------------------\n");
	printf("# Sum of first and last Digit #");
	printf("\n--------------------------------------------\n");
	printf("Enter Number : ");
	scanf("%lld",&n);
		lastDigit=n%10;
	while(n>=10)
	{
		n=n/10;
	}
		firstDigit=n;
	sum=firstDigit+lastDigit;
	printf("Sum of First and Last Digit : %d",sum);
}