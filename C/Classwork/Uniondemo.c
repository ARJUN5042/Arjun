#include<stdio.h>
union Employee
{
	int eid;
	char ename[10];
	float esal;
};
void main()
{
	union Employee emp;
	printf("Enter ID : ");
	scanf("%d",&emp.eid);
	printf("Id : %d\n",emp.eid);
	
	printf("\nEnter Name : ");
	scanf("%s",&emp.ename);
	printf("Name : %s\n",emp.ename);
	
	printf("\nEnter Salary : ");
	scanf("%f",&emp.esal);
	printf("Salary : %.2f",emp.esal);
	
	printf("\n\nSize of Union is : %d bytes.",sizeof(emp));
}