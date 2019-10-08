package lab3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text
{
	private String storage;
	
	public Text(String storage)
	{
		this.storage = storage;
	}
	
	public int getNumberOfSentences()
	{
		return storage.split("([a-z])[\\.|?|!]\\s+").length;
	}
	
	public int getNumberOfWords()
	{
		return storage.split(" ").length;
	}
	
	public int getNumberOfLetters()
	{
		Pattern pattern = Pattern.compile("\\w");
		Matcher matcher = pattern.matcher(storage);
		
		int count = 0;
		while (matcher.find())
			count++;
		
		return count;
	}
	
	public int getNumberOfVowels()
	{
		Pattern pattern = Pattern.compile("[aeiouy]");
		Matcher matcher = pattern.matcher(storage);
		
		int count = 0;
		while (matcher.find())
			count++;
		
		return count;
	}
	
	public int getNumberOfConsonants()
	{
		Pattern pattern = Pattern.compile("([^aeiouy\\W])");
		Matcher matcher = pattern.matcher(storage);
		
		int count = 0;
		while (matcher.find())
			count++;
		
		return count;
	}
	
	public void printTop5Often()
	{
		Pattern pattern = Pattern.compile("(\\w+)");
		Matcher matcher = pattern.matcher(storage);
		Hashtable<String, Integer> top = new Hashtable<String, Integer>();
		
		while (matcher.find())
		{
			String temp = matcher.group();
			temp = temp.toLowerCase();
			
			top.put(temp, top.containsKey(temp) ? top.get(temp) + 1 : 1);
		}
		
		System.out.println("Top 5 words:");
		
		ArrayList sortedTop = sortValue(top);
		for (int i = 0; i < ((sortedTop.size() < 5) ? sortedTop.size() : 5); i++) {
			System.out.println(sortedTop.get(i));
		}
		
	}
	
	public void printTop5Long()
	{
		Pattern pattern = Pattern.compile("(\\w+)");
		Matcher matcher = pattern.matcher(storage);
		Hashtable<String, Integer> top = new Hashtable<String, Integer>();
		
		while (matcher.find())
		{
			String temp = matcher.group();
			temp = temp.toLowerCase();
			
			top.put(temp, temp.length());
		}
		
		System.out.println("Top 5 words:");
		
		ArrayList sortedTop = sortValue(top);
		for (int i = 0; i < ((sortedTop.size() < 5) ? sortedTop.size() : 5); i++) {
			System.out.println(sortedTop.get(i));
		}
		
	}
	
	private static ArrayList sortValue(Hashtable<?, Integer> t)
	{
		
		//Transfer as List and sort it
		ArrayList<Map.Entry<?, Integer>> l = new ArrayList(t.entrySet());
		Collections.sort(l, new Comparator<Map.Entry<?, Integer>>()
		{
			
			public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2)
			{
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		return l;
	}
}
