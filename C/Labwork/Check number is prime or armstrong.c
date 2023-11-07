#include<stdio.h>
int isPrime(int num)
{
	if (num <= 1) {
        return 0;
    }
    if (num <= 3) {
        return 1;
    }
    if (num % 2 == 0 || num % 3 == 0) {
        return 0;
    }
    for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0) {
            return 0;
        }
    }
    return 1;
}
int isArmstrong(int num)
{
	 int originalNum, remainder, result = 0, n = 0;

    originalNum = num;

    while (originalNum != 0) {
        originalNum /= 10;
        n++;
    }

    originalNum = num;

    while (originalNum != 0) {
        remainder = originalNum % 10;
        result += pow(remainder, n);
        originalNum /= 10;
    }

    return result == num;
}



int main()
{
	int num;
	
	printf("Enter number: ");
	scanf("%d",&num);
	if(isPrime(num))
	{
		printf("\n%d is a prime number",num);
	}
	else
	{
		printf("\n%d is not a prime number",num);
	}
	
	if(isArmstrong(num))
	{
		printf("\n%d is an armstrong number",num);
	}
	else
	{
		printf("\n%d is not an armstrong number",num);
	}
	
	return 0;
}