#include<stdio.h>
int main()
{
	int num, originalNum, remainder, result = 0;
    printf("Enter a three-digit integer: ");
    scanf("%d", &num);
    originalNum = num;

    while (originalNum > 0) 
	{
       remainder = originalNum % 10;
       result = result *10 + remainder;
       originalNum /= 10;
    }

    if (result == num)
    {
        printf("%d is an Palindrome number.", num);
	}
    else
    {
    	
        printf("%d is not an Palindrome number.", num);
	}
	
	return 0;
}