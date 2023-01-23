#include<iostream>
using namespace std;

class result
{
	public:
		void res()
		{
		cout<<"Roll No   Sub1   Sub2   Sub3   Total Percentage\n";
		cout<<"1         30     25     45     100   "<<100/(float)3<<endl;
		cout<<"2         25     20     25     70    "<<70/(float)3<<endl;
		cout<<"3         20     15     35     70    "<<70/(float)3<<endl;
		cout<<"4         35     30     40     105   "<<105/(float)3<<endl;
		}
		
};
int main()
{
	result r;
	r.res();
	return 0;
}