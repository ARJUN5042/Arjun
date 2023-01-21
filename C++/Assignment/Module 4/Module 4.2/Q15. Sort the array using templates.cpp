#include<iostream>
using namespace std;

template <class A>

class Sort{
	
	public:
		A arr[100],i,j,k,n;
		
		void input()
		{
			cout<<"\n Enter Size of Array : ";
			cin>>n;
			
			for(i=0;i<n;i++)
			{
				cout<<"\n Enter Elements ["<<i<<"] = ";
				cin>>arr[i];
			}
			
			cout<<"\n\n Sorting Array Elements in Asscending Order ";
			cout<<"\n------------------------------------------------------------------------------------------\n";
			
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(arr[i]>arr[j])
					{
						k = arr[i];
						arr[i] = arr[j];
						arr[j] = k;
					}
				}
				cout<<"\t"<<arr[i];
			}
		}
};



int main()
{
	Sort <int>s;
	s.input();
	
	
	return 0;
}