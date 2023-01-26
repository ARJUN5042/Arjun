#include<iostream>
using namespace std;

class Harshit
{
	private:
		int money;
		friend int Vansh(Harshit);
	public:
		Harshit()
		{
			money = 0;
		}
};

int Vansh(Harshit h)
{
	h.money = 5000;
	return h.money;
}

int main()
{
	Harshit h;
	cout<<"\n Vansh is giving RS. "<<Vansh(h)<<" to Harshit.";
	
	
	return 0;
}