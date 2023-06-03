package com.Assignment;

public class Q20_SecondMostFrequentCharacterInString 
{
	public static void main(String[] args) 
	{
		String str = "success";
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) 
        {
            freq[str.charAt(i) - 'a']++;
        }
        char secondMostFreq = ' ';
        int maxFreq = 0;
        int secondMaxFreq = 0;
        for (int i = 0; i < freq.length; i++) 
        {
            if (freq[i] > maxFreq) 
            {
                secondMaxFreq = maxFreq;
                maxFreq = freq[i];
                secondMostFreq = (char) (i + 'a');
            } 
            else if (freq[i] > secondMaxFreq && freq[i] < maxFreq) 
            {
                secondMaxFreq = freq[i];
                secondMostFreq = (char) (i + 'a');
            }
        }
        System.out.println("The second most frequent character in the string is: " + secondMostFreq);
	}
}asda
