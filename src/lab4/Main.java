package lab4;

import java.io.FileReader;
import java.util.Stack;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("D:\\dev\\study\\oop_labs\\src\\lab4\\assets\\three_expressions.txt");
		
		String[] expressions = new String[3];
		for (int l = 0; l < expressions.length; l++)
		{
			expressions[l] = "";
		}
		
		int i, j = 0;
		while ((i=fr.read()) != -1)
		{
			if (i == '\n')
			{
				j++;
			}
			expressions[j] += (char) i;
		}
		fr.close();
		
		for (int k = 0; k < expressions.length; k++)
		{
			if (expressions[k] == "")
				break;
			System.out.println(expressions[k]);
			System.out.println(ExpressionValidator.isValid(expressions[k]));
		}
	}
}
