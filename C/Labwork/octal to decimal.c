#include<stdio.h>

int octToDec(int n)
{
	int dec=0;
	int base=1;
	int t=n;
	while(t)
	{
		int rem=t%10;
		t=t/10;
		dec+=rem*base;
		base=base*8;
	}
	return dec;
 } 
int main()
{
	int n;
	printf("Enter number: ");
	scanf("%d",&n);
	
    
	printf("Decimal number: %d",octToDec(n));
	
	return 0;
}