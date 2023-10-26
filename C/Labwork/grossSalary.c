#include<stdio.h>
int main()
{
	double salary,hra,da,grossSalary;
	printf("Enter Salary: ");
	scanf("%lf",&salary);
	
	if(salary<=10000)
	{
		hra=salary*20/100;
		da=salary*80/100;
		grossSalary=salary+hra+da;
		printf("Gross Salary is: %.2lf",grossSalary);
	}
	else if(salary<=20000 && salary>10000)
	{
		hra=salary*25/100;
		da=salary*90/100;
		grossSalary=salary+hra+da;
		printf("Gross Salary is: %.2lf",grossSalary);
	}
	else if(salary>20000)
	{
		hra=salary*30/100;
		da=salary*95/100;
		grossSalary=salary+hra+da;
		printf("Gross Salary is: %.2lf",grossSalary);
	}
	
	return 0;
}