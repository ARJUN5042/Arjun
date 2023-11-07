#include<stdio.h>
int main()
{
	char str[100] ;
    int l = 0;
 
    printf("Enter String : ");
    scanf("%s",&str);
    
	int h = strlen(str) - 1;
    
    while (h > l) 
	{
        if (str[l++] != str[h--]) 
		{
            printf("%s is not a palindrome\n", str);
            return 0;
        }
    }
    		printf("%s is a palindrome\n", str);
 
	
	return 0;
}