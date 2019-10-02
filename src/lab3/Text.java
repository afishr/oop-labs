package lab3;

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
}
