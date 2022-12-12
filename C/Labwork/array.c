#include<stdio.h>
void main()
{
	int i,n;
	int a1[5],a2[5];
	printf("Enter elements for array 1 :\n");
	for(i=0;i<5;i++)
	{
	scanf("%d",&a1[i]);
	}
	printf("Enter elements for array 2 : \n");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a2[i]);
	}
	printf("\nElements of Array 1 :\n");
	for(i=0;i<5;i++)
	{
		printf("%d\t",a1[i]);
	}
	printf("\nElements of Array 2 :\n");
	for(i=0;i<5;i++)
	{
		printf("%d\t",a2[i]);
	}
	printf("\n\n-----------Menu-----------\n");
	printf("\nPress 1 for Addition");
	printf("\nPress 2 for Subtraction");
	printf("\nPress 3 for Multiplication");
	printf("\nPress 4 for Division\n");
	printf("\nEnter your choice ? ");
	scanf("%d",&n);
	printf("\n");
	switch(n)
	{
		case 1:
			printf("\nAddition of array 1 and array 2 :\n");
			for(i=0;i<5;i++)
			{
				printf("%d\t",(a1[i]+a2[i]));
			}
			break;
		case 2:
			printf("\nSubtraction of array 1 and array 2 :\n");
			for(i=0;i<5;i++)
			{
				printf("%d\t",(a1[i]-a2[i]));
			}
			break;
		case 3:
			printf("\nMultiplication of array 1 and array 2 :\n");
			for(i=0;i<5;i++)
			{
				printf("%d\t",(a1[i]*a2[i]));
			}
			break;
		case 4:
			printf("\nDivision of array 1 and array 2 :\n");
			for(i=0;i<5;i++)
			{
				printf("%.2f\t",((float)a1[i]/a2[i]));
			}
			break;
		default:
			printf("Invalid Input!!!!!!!!");
			break;
	}
}