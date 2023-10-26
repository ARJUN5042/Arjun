#include<stdio.h>
int main()
{
	int i=1,n,even=0,odd=0,esum=0,osum=0;
	while(i<=5)
	{
		printf("Enter number: ");
		scanf("%d",&n);
		if(n%2==0)
		{
			even++;
			esum+=n;
		}
		else
		{
			odd++;
			osum+=n;
		}
		i++;
	}
	printf("\nEven numbers: %d",even);
	printf("\nSum of Even numbers: %d",esum);
	
	printf("\nOdd numbers: %d",odd);
	printf("\nSum of Odd numbers: %d",osum);
	return 0;
}