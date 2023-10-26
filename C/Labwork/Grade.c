#include<stdio.h>
int main()
{
	int s1,s2,s3,s4,s5,total;
	float per;
	
	printf("Enter Marks Obtain in Physics: ");
	scanf("%d",&s1);
	printf("Enter Marks Obtain in Chemistry: ");
	scanf("%d",&s2);
	printf("Enter Marks Obtain in Biology: ");
	scanf("%d",&s3);
	printf("Enter Marks Obtain in Mathematics: ");
	scanf("%d",&s4);
	printf("Enter Marks Obtain in Computer: ");
	scanf("%d",&s5);
	
	total=s1+s2+s3+s4+s5;
	per=(float)total/5;
	
	printf("\n\nPercentage is %.2f",per);
	
	if(per>=90.00)
	{
		printf("\n\nYour Grade is A.");
	}
	else if(per>=80.00)
	{
		printf("\n\nYour Grade is B.");
	}
	else if(per>=70.00)
	{
		printf("\n\nYour Grade is C.");
	}
	else if(per>=60.00)
	{
		printf("\n\nYour Grade is D.");
	}
	else if(per>=40.00)
	{
		printf("\n\nYour Grade is E.");
	}
	else
	{
		printf("\n\nYou are Fail.");
	}
	
	return 0;
}