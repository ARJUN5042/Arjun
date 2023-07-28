#include<stdio.h>
main()
{
	int i,n,sum=0,sum1=0,sum2=0;
	printf("Enter Number: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		sum+=i;
		
	}
	printf("Sum of Numbers: %d",sum);
		for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			sum1+=i;
		}
		
	}
	printf("\nSum of Even Numbers: %d",sum1);
	for(i=1;i<=n;i++)
	{
		if(i%2!=0)
		{
			sum2+=i;
		}
		
	}
	printf("\nSum of Odd Numbers: %d",sum2);
		
}