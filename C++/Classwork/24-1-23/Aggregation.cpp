#include<iostream>
using namespace std;

class Address{
	public:
		string street, city, state;
		Address(string street, string city, string state)
		{
			this->street = street;
			this->city = city;
			this->state = state;
		}
};

class Employee{
	private:
		Address *address;
	public:
		int id;
		string name;
		Employee(int id, string name, Address *address)
		{
			this->id = id;
			this->name = name;
			this->address = address;
		}
		void display()
		{
			cout<<"\nId      : "<<id;
			cout<<"\nName    : "<<name;
			cout<<"\nAddress : "<<address->street;
			cout<<"\nCity    : "<<address->city;
			cout<<"\nState   : "<<address->state;
		}
};

int main()
{
	Address a1("10, OPP. GLS, CG ROAD","AHMEDABAD","GUJRAT");
	Employee e1(101,"ARJUN HIRPARA",&a1);
	e1.display();
	
	return 0;
}