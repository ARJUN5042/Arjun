#include<stdio.h>
void main()
{
	int day,n;
	char ch;
	printf("\n\t\tPress 1 for Monday to Sunday by using Switch");
	printf("\n\t\tPress 2 for Vowel or Consonant by using Switch");
	printf("\n\t\tEnter your choice : ");
	scanf("%d",&n);
	switch(n)
	{	
		case 1:
		printf("\n\n\t\tEnter 1 for Monday");
		printf("\n\t\tEnter 2 for Tuesday");
		printf("\n\t\tEnter 3 for Wednesday");
		printf("\n\t\tEnter 4 for Thursday");
		printf("\n\t\tEnter 5 for Friday");
		printf("\n\t\tEnter 6 for Saturday");
		printf("\n\t\tEnter 7 for Sunday");
		printf("\n\n\t\tEnter a day : ");
		scanf("%d",&day);
		switch(day)
			{
			case 1:
			printf("\n\t\tToday is Monday.");
			break;
			case 2:
			printf("\n\t\tToday is Tuesday.");
			break;
			case 3:
			printf("\n\t\tToday is Wednesday.");
			break;
			case 4:
			printf("\n\t\tToday is Thursday.");
			break;
			case 5:
			printf("\n\t\tToday is Friday.");
			break;
			case 6:
			printf("\n\t\tToday is Saturday.");
			break;
			case 7:
			printf("\n\t\tToday is Sunday.");
			break;
			default:
			printf("\n\t\tInvalid Input!!!");
			}
			break;
		case 2:
			fflush(stdin);
			printf("\n\t\tEnter your character : ");
			scanf("%c",&ch);
			switch(ch)
			{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				printf("\n\t\tIt is Vowel.");
				break;
			default:
				printf("\n\t\tIt is Consonant.");
				break;
			}
			break;
			default:
				printf("\n\t\tInvalid Input!!!");
				break;
	}
}