#include<stdio.h>
void main()
{
	int i,array[10],eCount=0,eSum=0,oCount=0,oSum=0;
	printf("Enter your numbers :\n");
	for(i=0;i<10;i++)
	{
	scanf("%d",&array[i]);
	}
	printf("\nThese are Even Numbers : ");
	for(i=0;i<10;i++)
	{
		if(array[i]%2==0)
		{
		printf("%d\t",array[i]);
		eSum=eSum+array[i];
		eCount++;
	}
	}
	printf("\nThese are Odd Numbers : ");
	for(i=0;i<10;i++)
	{
		if(array[i]%2!=0)
		{
		printf("%d\t",array[i]);
		oSum=oSum+array[i];
		oCount++;
	}
	}
	printf("\nTotal Even Numbers are : %d",eCount);
	printf("\nTotal Odd Numbers are : %d",oCount);
	printf("\nSum of Even Numbers are : %d",eSum);
	printf("\nSum of Odd Numbers are : %d",oSum);
}