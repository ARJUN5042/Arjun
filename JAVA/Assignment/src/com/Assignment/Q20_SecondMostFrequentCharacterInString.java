package com.Assignment;

public class Q20_SecondMostFrequentCharacterInString 
{
	public static void main(String[] args) 
	{
		//initialize string with value
		String str = "success";
		//create an array for 26 character
        int[] freq = new int[26];
        //using for loop for separate character
        for (int i = 0; i < str.length(); i++) 
        {
            freq[str.charAt(i) - 'a']++;
            //System.out.println(i);
        }
        //initialize other data members
        char secondMostFreq = ' ';
        int maxFreq = 0;
        int secondMaxFreq = 0;
        //using for loop for separate frequent character length
        for (int i = 0; i < freq.length; i++) 
        {
        	//making conditions for finding second most frequent character
            if (freq[i] > maxFreq) 
            {
                secondMaxFreq = maxFreq;
                maxFreq = freq[i];
                secondMostFreq = (char) (i + 'a');
            } 
             if (freq[i] > secondMaxFreq && freq[i] < maxFreq) 
            {
                secondMaxFreq = freq[i];
                secondMostFreq = (char) (i + 'a');
            }
        }
        System.out.println("The second most frequent character in the string is: " + secondMostFreq);
	}
}
