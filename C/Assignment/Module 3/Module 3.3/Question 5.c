#include<stdio.h>
void main()
{
	int n,i,j,t;
	int a1[5],a2[5];
	printf("Enter Array 1 elements -->\n\n");
	for(i=0;i<5;i++)
	{
		printf("Enter your element %d : ",i+1);
		scanf("%d",&a1[i]);
	}
	printf("\nEnter Array 2 elements -->\n\n");
	for(i=0;i<5;i++)
	{
		printf("Enter your element %d : ",i+1);
		scanf("%d",&a2[i]);
	}
	printf("\nArray 1 Elements are : \n");
	for(i=0;i<5;i++)
	{
		printf("%d\t",a1[i]);
	}
	printf("\n\nArray 2 Elements are : \n");
	for(i=0;i<5;i++)
	{
		printf("%d\t",a2[i]);
	}
	printf("\n\n\t\t#Sorting Order Menu #\n\n");
	printf("Press 1 for Sorting Array Elements in Ascending Order\n");
	printf("Press 2 for Sorting Array Elemrnts in Descending Order\n");
	printf("\nEnter your choice --> ? ");
	scanf("%d",&n);
	switch(n)
	{
		case 1:
			printf("\nArray 1 Elements in Ascending Order are : \n");
			for(i=0;i<5;i++)
			{
				for(j=0;j<5;j++)
				{
				if(a1[i]<a1[j])
				{
					t=a1[i];
					a1[i]=a1[j];
					a1[j]=t;
				}	
				}
			}
			for(i=0;i<5;i++)
			{
			printf("%d\t",a1[i]);
			}
			printf("\n\nArray 2 Elements in Ascending Order are: \n");
			for(i=0;i<5;i++)
			{
				for(j=0;j<5;j++)
				{
					if(a2[i]<a2[j])
					{
						t=a2[i];
						a2[i]=a2[j];
						a2[j]=t;
					}
				}
			}
			for(i=0;i<5;i++)
			{
				printf("%d\t",a2[i]);
			}
			break;
		case 2:
			printf("\nArray 1 Elements in Descending Order are: \n");
			for(i=0;i<5;i++)
			{
				for(j=0;j<5;j++)
				{
					if(a1[i]>a1[j])
					{
						t=a1[i];
						a1[i]=a1[j];
						a1[j]=t;
					}
				}
			}
			for(i=0;i<5;i++)
			{
				printf("%d\t",a1[i]);
			}
			printf("\n\nArray 2 Elements in Descending Order are: \n");
			for(i=0;i<5;i++)
			{
				for(j=0;j<5;j++)
				{
					if(a2[i]>a2[j])
					{
						t=a2[i];
						a2[i]=a2[j];
						a2[j]=t;
					}
				}
			}
			for(i=0;i<5;i++)
			{
				printf("%d\t",a2[i]);
			}
			break;
		default:
			printf("\nInvalid Input!!!!!!!!!");
			break;
	}
}