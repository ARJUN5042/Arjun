#include<stdio.h>
#include<conio.h>
//	Creating Function
void food()
{
//	Creating Variables
	int choice,price,quantity;
	char addanother,ans;
	float total,amount;
//	Using loop for one time call
	do
	{
//	Display Menu
	printf("\n\n--------------------Menu--------------------\n");
	printf("\n1.Pizza\t\tPrice = 180rs/pcs\n");
	printf("2.Burger\tPrice = 100rs/pcs\n");
	printf("3.Dosa\t\tPrice = 120rs/pcs\n");
	printf("4.Idli\t\tPrice = 50rs/pcs\n");
//	Input for choice
	printf("\nPlease Enter your choice:? ");
	scanf("%d",&choice);
//	Display Choice and evaluate price
	switch(choice)
	{
		case 1:
			printf("\nYou have selected Pizza.");
			price = 180;
			break;
		case 2:
			printf("\nYou have selected Burger.");
			price = 100;
			break;
		case 3:
			printf("\nYou have selected Dosa.");
			price = 120;
			break;
		case 4:
			printf("\nYou have selected Idli.");
			price = 50;
			break;
		default:
			printf("\nInvalid Input!!!!");
			break;
	}
//	Input for Quantity
	printf("\nEnter the quantity : ");
	scanf("%d",&quantity);
//	Display Amount
	amount = quantity * price;
	printf("Amount : %.2f",amount);
//	defining vatiable for adding order value
	total = total + amount;
	printf("\nTotal Amount is = %.2f",total);
	printf("\nDo you want place more orders ? (y/n) : ");
	scanf("%c",&ans);
	addanother = getch();
	}
	while(addanother=='y'||addanother=='Y');
	{
		switch(ans)
		{
			case 'y':
			case 'Y':
				food();
				break;
			case 'n':
			case 'N':
				printf("\n\nThank you......Visit Again");
				break;
		}
	}
}
void main()
{
	food();
}