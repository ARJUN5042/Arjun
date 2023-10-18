#include<stdio.h>
int main()
{
	//Accept monthly salaty from user
	//deduct 10% insurance premium,
	//deduct 10% loan installment 
	//print remain salary
	
	double salary,remainSalary,insurance,loan,salary1;
	
	printf("Enter Monthly salary: ");
	scanf("%lf",&salary);
	
	insurance=(salary*10)/100;
	salary1=salary-insurance;
	
	loan=(salary1*10)/100;
	
	remainSalary=salary1-loan;
	
	printf("Remain Salary is %.2lf",remainSalary);
	
	return 0;
}