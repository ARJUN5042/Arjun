#include<stdio.h>
struct Employee
{
	int eno,eage;
	char ename[20],eaddress[100];
};
void main()
{
//	nomber of employees
	int i,n=5;	
//	array to store value
	struct Employee emp[n];
//	input
	printf("Enter %d Employee Details \n\n",n);
	for(i=0;i<n;i++)
	{
//		Name
		printf("Enter No. : ");
		scanf("%d",&emp[i].eno);
		
//		ID
		printf("Enter Name : ");
		scanf("%s",&emp[i].ename);
		
//		Address
		printf("Enter Address : ");
		scanf("%s",&emp[i].eaddress);
		
//		Age
		printf("Enter Age : ");
		scanf("%d",&emp[i].eage);
		
		printf("\n");
	}
	
//	Print Details
	printf("\n----------All Employee Details----------\n\n");
	for(i=0;i<n;i++)
	{
		printf("Employee No. \t: %d\n",emp[i].eno);
		printf("Employee Name \t: %s\n",emp[i].ename);
		printf("Employee Address : %s\n",emp[i].eaddress);
		printf("Employee Age \t: %d\n",emp[i].eage);
		printf("\n");
	}
}