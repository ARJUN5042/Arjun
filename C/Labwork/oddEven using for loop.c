#include<stdio.h>
int main()
{
	int num,odd=0,even=0;
    
    printf("Enter 10 numbers:\n");
    
    for (int i = 1; i <= 10; i++) 
	{
        printf("Enter number %d: ", i);
        scanf("%d", &num);
        
        if (num % 2 == 0) 
		{
            printf("%d is even.\n", num);
            even++;
        }
		else 
		{
            printf("%d is odd.\n", num);
            odd++;
        }
    }
            printf("\nTotal even numbers: %d",even);
            printf("\nTotal odd numbers: %d",odd);
	
	return 0;
}