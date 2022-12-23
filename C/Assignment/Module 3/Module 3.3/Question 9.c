#include<stdio.h>
struct Employee
{
	int eno,eage;
	char ename[20];
	char eaddress[100];
};
void main()
{
	struct Employee emp;
	printf("Enter No. : ");
	scanf("%d",&emp.eno);
	printf("Enter Name : ");
	scanf("%s",&emp.ename);
	printf("Enter Address : ");
	scanf("%s",&emp.eaddress);
	printf("Enter Age : ");
	scanf("%d",&emp.eage);
	
	printf("\n\n----------Employee Details----------\n\n");
	
	printf("Employee No. : %d",emp.eno);
	printf("\nEmployee Name : %s",emp.ename);
	printf("\nEmployee Address : %s",emp.eaddress);
	printf("\nEmployee Age : %d",emp.eage);
}