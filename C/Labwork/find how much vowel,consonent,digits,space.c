#include<stdio.h>
#include<string.h>
int main()
{
	char str[150];
  	int vowels, consonant, digit, space,specialCharacter;

	vowels = consonant = digit = space = specialCharacter = 0;

  
  	printf("Enter a line of string: ");
  	fgets(str, sizeof(str), stdin);

 
  	for (int i = 0; str[i] != '\0'; ++i) 
	{
    	str[i] = tolower(str[i]);
  		

    if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' ||
        str[i] == 'o' || str[i] == 'u') 
		{
      		++vowels;
    	}
    
    else if ((str[i] >= 'a' && str[i] <= 'z')) 
	{
    	++consonant;
    }

    else if (str[i] >= '0' && str[i] <= '9') 
	{
      	++digit;
    }

    else if (str[i] == ' ') 
	{
      	++space;
    }
    else
    {
    	++specialCharacter;
	}
  	}

  	printf("Vowels: %d", vowels);
  	printf("\nConsonants: %d", consonant);
  	printf("\nDigits: %d", digit);
  	printf("\nWhite spaces: %d", space);
  	printf("\nSpecial character: %d",specialCharacter-1);

  	return 0;
}