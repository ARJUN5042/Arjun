package com.Assignment;

//creating class
class MostSecondFrequent
{
	//creating method with argument
    static public void getSecondMost(String s) 
    {
    	//initialize an array for small letters 
        int[] a = new int[128];
        //initialize an array to store string into character
        char[] char_array = s.toCharArray();
        //using for loop to separate character of string
        for(int i = 0; i < char_array.length; i++) 
        {
            int index = char_array[i];
            a[index - 'a']++;
            //System.out.println(index);
        }
        //initialize most frequent character as 0
        int max = 0;
        //using for loop to get ASCII value of most frequent letter
        for(int i = 0; i < a.length; i++) 
        {
            if(a[i] > max) 
            {
                max = a[i];
                //System.out.println(i);
            }
        }
        //initialize second most frequent character as 0
        int max2=0;
        //using for loop to get ASCII value of second most frequent character
        for(int i=0; i<a.length; i++)
        {
        	if(a[i] > max2 && a[i] < max)
        	{
        		max2=a[i];
//        		System.out.println(max2);
        	}
        }
        //initialize null string to print character
        String result = "";
        //use for loop if array of i is equal to second most frequent character 
        for(int i=0; i<a.length; i++)
        {
        	if(a[i] == max2)
        	{
        		result += (char)(i+'a');//type casting int to char
        		System.out.println(result);//display result
        	}
        }
    }
}
public class Q20_SecondMostFrequentCharacterInString 
{
	public static void main(String[] args) 
	{
		//creating an object of class
		MostSecondFrequent m = new MostSecondFrequent();
		String s="success";
	    System.out.println("Original String is : "+s);
	    System.out.print("Second most frequent character of string is: ");
	    m.getSecondMost(s);
	    	    
	}
}