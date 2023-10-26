#include<stdio.h>
//first 50 0.50
//next 100 0.75
//next 100 1.20
//above 250 1.5
//additional surcharge 20%
int main()
{
	float units,total,surcharge;
	
	printf("Enter the number of units consumed: ");
	scanf("%f",&units);
	
	//for first 50 or less units 
	if(units<=50)
	{
		total = units*0.50;
	}
	//for first 50 units rate = 0.50 and other upto 100 units rate =0.75
	else if(units<=150)
	{
		total = 50*0.50 + (units -50)*0.75;
	}
	else if(units<=250)
	{
		total = (50*0.50) + (100*0.75) + (units-150)*1.20;
	}
	else 
	{
		total = (50*0.50) + (100*0.75) + (100*1.20) + (units-250)*1.50;
	}
	
	surcharge = 0.20*total;
	total += surcharge;
	
	printf("Electricity Bill: %.2f Rs.",total);
	
	return 0;
}