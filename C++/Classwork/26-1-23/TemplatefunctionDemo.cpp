#include<iostream>
using namespace std;

template <typename T>
T add(T a, T b)
{
	return a+b;
}


int main()
{
	cout<<"\nAdd using Integer Type : "<<add<int>(10,20);
	cout<<"\nAdd using Float Type : "<<add<float>(12.5,25.23);
	cout<<"\nAdd using String Concatenate : "<<add<string>("Tops ","Tech");
	return 0;
}