#include<stdio.h>
int main()
{
	int num, binary_num, decimal_num = 0, base = 1, rem;  
    printf ("Enter a binary number: \n");  
    scanf ("%d", &num); 
  
    binary_num = num;
      
      
    while (num>0)  
    {  
        rem = num % 10;
        printf("\nrem %d",rem);
        decimal_num = decimal_num + rem * base;  
        printf("\ndecimal_num %d",decimal_num);
        num = num / 10;
        printf("\nnum %d",num);
        base = base * 2;  
        printf("\nbase %d",base);
    }  
  
    printf ("\nThe binary number is %d \t", binary_num);
    printf ("\nThe decimal number is %d \t", decimal_num);
	
	
	
	return 0;
}