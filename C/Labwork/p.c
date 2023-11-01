#include<stdio.h>
int main()
{
	int n=150,sum=0,rem=0;
	while(n>0)
	{
		rem=n%10;
		sum=sum+rem;
		n/=10;
	}
	printf("Sum = %d",sum);
	
	return 0;
}