#include<stdio.h>
main()
{
	int m1,m2,m3,m4,m5;
	printf("Enter Marks: ");
	printf("\n===================\n");
	printf("Enter marks 1: ");
	scanf("%d",&m1);
	printf("Enter marks 2: ");
	scanf("%d",&m2);
	printf("Enter marks 3: ");
	scanf("%d",&m3);
	printf("Enter marks 4: ");
	scanf("%d",&m4);
	printf("Enter marks 5: ");
	scanf("%d",&m5);
	int total=m1+m2+m3+m4+m5;
	float per=(float)total/5;
	printf("\n\nTotal Marks: %d",total);
	printf("\n\nPercentage is: %f",per);
	
	if(per>=70)
	{
		printf("\n\nDistinction");
	}
	else if(per>=60)
	{
		printf("\n\nFirst Class");
	}
	else if(per>50)
	{
		printf("\n\nSecond Class");
	}
	else if(per>40)
	{
		printf("\n\nThird Class");
	}
	else
	{
		printf("\n\nFail");
	}
}