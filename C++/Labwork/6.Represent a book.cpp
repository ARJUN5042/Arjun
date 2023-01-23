#include<iostream>
using namespace std;

class book
{
	public:
		string f_author,f_title,f_publisher;
		float f_price;
		void book1(string a_author, string a_title, float a_price, string a_publisher)
		{
			f_author=a_author;
			f_title=a_title;
			f_price=a_price;
			f_publisher=a_publisher;
		}
		void display()
		{
			cout<<"\n\n\tDetails of BOOK";
			cout<<"\n---------------------------------------";
			cout<<"\n Author : "<<f_author;
			cout<<"\n Title : "<<f_title;
			cout<<"\n Price : "<<f_price;
			cout<<"\n Publisher : "<<f_publisher;
		}
};

int main()
{
	string a_author,a_title,a_publisher;
	float a_price;
	
	cout<<"\n\tRepresentin a Book";
	cout<<"\n\n Name of Author : ";
	getline(cin,a_author);
	cout<<"\n Name of Title : ";
	getline(cin,a_title);
	cout<<"\n Price of Book : ";
	cin>>a_price;
	fflush(stdin);
	cout<<"\n Name of Publisher : ";
	getline(cin,a_publisher);
	
	book b;
	b.book1(a_author,a_title,a_price,a_publisher);
	b.display();
	
	return 0;
}