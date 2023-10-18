#include<stdio.h>
int main()
{
	int s1,s2,s3,s4,s5,total;
	float per;
	printf("Enter Subject 1 Marks: ");
	scanf("%d",&s1);
	printf("Enter Subject 2 Marks: ");
	scanf("%d",&s2);
	printf("Enter Subject 3 Marks: ");
	scanf("%d",&s3);
	printf("Enter Subject 4 Marks: ");
	scanf("%d",&s4);
	printf("Enter Subject 5 Marks: ");
	scanf("%d",&s5);
	
	total=s1+s2+s3+s4+s5;
	per=(float)total/5;
	printf("Percentage of Student: %.2f",per);
	
	return 0;
}